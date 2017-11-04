package com.snail.util;

import com.qiniu.api.auth.AuthException;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.config.Config;
import com.qiniu.api.io.IoApi;
import com.qiniu.api.io.PutExtra;
import com.qiniu.api.io.PutRet;
import com.qiniu.api.rs.GetPolicy;
import com.qiniu.api.rs.PutPolicy;
import com.qiniu.api.rs.RSClient;
import com.qiniu.api.rs.URLUtils;
import com.snail.exception.SnailServerException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ResourceBundle;
import org.json.JSONException;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午12:54 2017/11/3
 * @Description:
 */
public class QiniuUtil {

    private static String bucketName;
    private String domain;

    /**
     * 初始化参数
     */
    static {
        ResourceBundle bundle = ResourceBundle.getBundle("qiniu");
        if (null == bundle) {
            throw new SnailServerException(-1, "redis.properties not found");
        }
        bucketName = bundle.getString("qiniu.bucketName");
        Config.ACCESS_KEY = bundle.getString("qiniu.accessKey");
        Config.SECRET_KEY = bundle.getString("qiniu.secretKey");
    }

    public void setDomain(String domain) {

        this.domain = domain;
    }

    /**
     * 通过文件路径上传
     *
     * @param localFile
     * @return
     * @throws AuthException
     * @throws JSONException
     */
    public PutRet uploadFile(String localFile) throws AuthException, JSONException {
        File file = new File(localFile);
        return uploadFile(file);
    }

    /**
     * 通过文件上传
     *
     * @param file
     * @return
     * @throws AuthException
     * @throws JSONException
     */
    public PutRet uploadFile(File file) throws AuthException, JSONException {
        String uptoken = getUpToken();
        PutExtra extra = new PutExtra();
        PutRet ret = IoApi.putFile(uptoken, file.getName(), file.getAbsolutePath(), extra);
        return ret;
    }

    /**
     * 从 inputstream 中写入七牛
     *
     * @param key 文件名
     * @param content 要写入的内容
     * @return
     * @throws AuthException
     * @throws JSONException
     */
    public PutRet uploadFile(String key, String content) throws AuthException, JSONException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(content.getBytes());
        String uptoken = getUpToken();
        PutExtra extra = new PutExtra();
        PutRet ret = IoApi.Put(uptoken, key, inputStream, extra);
        return ret;
    }

    /**
     * 获取图片下载地址
     *
     * @param filename
     * @return
     * @throws Exception
     */
    public String getDownloadFileUrl(String filename) throws Exception {
        Mac mac = getMac();
        String baseUrl = URLUtils.makeBaseUrl(domain, filename);
        GetPolicy getPolicy = new GetPolicy();
        String downloadUrl = getPolicy.makeRequest(baseUrl, mac);
        return downloadUrl;
    }

    /**
     * 删除图片
     *
     * @param filename
     */
    public void deleteFile(String filename) {
        Mac mac = getMac();
        RSClient client = new RSClient(mac);
        client.delete(domain, filename);
    }

    /**
     * 获取上传凭证
     *
     * @return
     * @throws AuthException
     * @throws JSONException
     */
    private String getUpToken() throws AuthException, JSONException {
        Mac mac = getMac();
        PutPolicy putPolicy = new PutPolicy(bucketName);
        String uptoken = putPolicy.token(mac);
        return uptoken;
    }

    /**
     * 获取图片mac地址
     *
     * @return
     */
    private Mac getMac() {
        Mac mac = new Mac(Config.ACCESS_KEY, Config.SECRET_KEY);
        return mac;
    }
}
