package com.snail.service.impl;

import com.qiniu.api.io.PutRet;
import com.snail.service.base.IFileService;
import com.snail.util.QiniuUtil;
import java.io.File;
import java.util.Date;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description 文件上传
 * @author Jiankun.Zhangsun 2017/10/15 21:39
 * @verion v1.0
 * @since v1.0
 */
@Service
@Slf4j
public class FileServiceImpl implements IFileService {

    private static final String QINIU_URL_PREFIX = "http://qiniu.thinkerol.com/";

    /**
     * 文件上传
     *
     * @param file 上传文件对象
     * @param path 文件的本地路径
     * @return 文件所在服务器的资源路径
     */
    @Override
    public String uploadFile(MultipartFile file, String path) {
        String fileName = file.getOriginalFilename();
        String fileExtention = fileName.substring(fileName.lastIndexOf(".") + 1);
        String fileNamePrefix = DateFormatUtils.format(new Date(), "yyyyMMdd");
        String newFileName = UUID.randomUUID().toString().replace("-", "");
        String uploadFileName = new StringBuilder().append(fileNamePrefix).append(newFileName).append(".").append(fileExtention).toString();
        File targetFile = new File(path, uploadFileName);

        File fileDir = new File(path);
        PutRet putRet = null;
        if(!fileDir.exists()) {
            fileDir.setWritable(true);
            fileDir.mkdirs();
        }
        try {
            file.transferTo(targetFile);
            QiniuUtil qiniuUtil = new QiniuUtil();
            putRet = qiniuUtil.uploadFile(targetFile);
            targetFile.delete();
        } catch (Exception e) {
            log.error("文件上传七牛失败!", e);
        }
        return  QINIU_URL_PREFIX + putRet.getKey();
    }
}
