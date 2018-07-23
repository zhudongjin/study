/*
package com.gold.common.jms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

*/
/**
 * Created by 朱冬金 on 2018/3/22.
 *//*

public class MainProducer {
    public static void main(String[] args) {

        ExecutorService threadPool= Executors.newFixedThreadPool(3);
        for (int i = 0; i <5 ; i++) {
            threadPool.submit(new Runnable() {
                public void run() {
                    JMSProducerThread jpt = new JMSProducerThread();
                    jpt.init();
                    jpt.produce();
                }
            });
        }
    }
}
*/
