package com.snail.service.rpc;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

/**
 * Socket测试1
 */
@ServerEndpoint("/echo")
public class ServerSocket1 {

    @OnMessage
    public String echo(String message) {
        System.out.println(message + "|");
        return "I got this message:" + message + " so I am sending it back !";
    }

}
