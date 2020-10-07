package com.study.java;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public void QueueExtest(){
        Queue<Message> messageQueue = new LinkedList<Message>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendtalk", "홍두께"));

        while (!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail" :
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS" :
                    System.out.println(message.to + "님에게 SMS을 보냅니다.");
                    break;
                case "sendtalk" :
                    System.out.println(message.to + "님에게 톡을 보냅니다.");
                    break;
            }
        }
    }
}
