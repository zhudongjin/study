/*
package com.gold.common.jms;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

*/
/**
 * Created by 朱冬金 on 2018/3/22.
 * 消息生产者-消息发布者（多线程发送消息）
 *//*

public class JMSConsumerThread {
    private static final String USERNAME="admin"; //ActiveMQConnection.DEFAULT_USER;//默认用户名
    private static final String PASSWORD="admin";//ActiveMQConnection.DEFAULT_PASSWORD;//默认密码
    private static final String BROKEURL="tcp://192.168.6.88:61616";//ActiveMQConnection.DEFAULT_BROKER_URL;//默认连接地址

    ConnectionFactory connectionFactory;
    private Connection connection;
    private Session session;
    private Destination destination;

    public void init(){
        //实例化工厂
        connectionFactory=new ActiveMQConnectionFactory(JMSConsumerThread.USERNAME,JMSConsumerThread.PASSWORD,JMSConsumerThread.BROKEURL);
        try{
            connection=connectionFactory.createConnection();
            connection.start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void consumer(){
        MessageConsumer messageConsumer;
        try{
            session=connection.createSession(Boolean.FALSE,Session.AUTO_ACKNOWLEDGE);//创建session
            destination=session.createQueue("queue1");
            messageConsumer=session.createConsumer(destination);
            messageConsumer.setMessageListener(new Listener3());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
*/
