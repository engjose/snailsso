package com.snail.service.rpc;

import java.io.IOException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Creacted by Panyuanyuan
 */
@ServerEndpoint("/init")
public class WebSocketTest {

    private static Logger LOG = LoggerFactory.getLogger(WebSocketTest.class);

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("hah");
    }

    @OnMessage
    public String onMessage(String message, Session session) throws IOException {
        LOG.info("user [" + session.getId() + "] Received: " + message);

        return message;
    }

    @OnError
    public void onError(Throwable throwable) {
        LOG.error(throwable.getMessage());
    }

    @OnClose
    public void onClose(Session session) {

    }
}
