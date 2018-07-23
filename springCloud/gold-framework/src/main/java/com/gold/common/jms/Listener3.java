/*
package com.gold.common.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

*/
/**
 * Created by 朱冬金 on 2018/3/22.
 * 消息监听(多线程接收)
 *//*

public class Listener3 implements MessageListener {

    private ExecutorService threadpool= Executors.newCachedThreadPool();

    public void onMessage(final Message message) {
        threadpool.execute(new Runnable(){
            public void run(){
                try {
                    System.out.println(Thread.currentThread().getName()+"收到的消息是："+((TextMessage)message).getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
*/
