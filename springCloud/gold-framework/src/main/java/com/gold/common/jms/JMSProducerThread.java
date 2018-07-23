/*
package com.gold.common.jms;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

*/
/**
 * Created by 朱冬金 on 2018/3/22.
 * 消息生产者-消息发布者（多线程发送）
 *//*

public class JMSProducerThread {
    private static final String USERNAME="admin"; //ActiveMQConnection.DEFAULT_USER;//默认用户名
    private static final String PASSWORD="admin";//ActiveMQConnection.DEFAULT_PASSWORD;//默认密码
    private static final String BROKEURL="tcp://192.168.6.88:61616";//ActiveMQConnection.DEFAULT_BROKER_URL;//默认连接地址
    private static final int SENDNUM=10000;//发送消息数

    ConnectionFactory connectfactory=null;
    private Connection connection=null;
    private Session session=null;
    private Destination destination=null;

    public  void init(){
        connectfactory=new ActiveMQConnectionFactory(JMSProducerThread.USERNAME,JMSProducerThread.PASSWORD,JMSProducerThread.BROKEURL);
        try{
            connection=connectfactory.createConnection();
            connection.start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void produce(){
        try{
            MessageProducer messageproduce;//消息生产者
            session=connection.createSession(Boolean.TRUE,Session.AUTO_ACKNOWLEDGE);
            destination=session.createQueue("queue1");
            messageproduce=session.createProducer(destination);//创建消费者
            for (int i = 0; i <JMSProducerThread.SENDNUM ; i++) {
                TextMessage message=session.createTextMessage("ActiveMQ中"+Thread.currentThread().getName()+"线程发送的数据"+":"+i);
                //System.out.println(Thread.currentThread().getName()+"线程"+"发送消息："+"ActiveMQ 发布的消息"+":"+i);
                messageproduce.send(message);
                session.commit();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void sendMessage(Session session,MessageProducer messageproducer) throws Exception{
        for (int i = 0; i <JMSProducerThread.SENDNUM ; i++) {
            TextMessage message=session.createTextMessage("ActiveMQ 发送的消息"+i);
          ///  System.out.println("ActiveMQ 发送的消息"+i);
            messageproducer.send(message);
        }

    }

}
*/
