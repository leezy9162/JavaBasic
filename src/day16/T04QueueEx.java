package day16;

import java.util.LinkedList;
import java.util.Queue;

public class T04QueueEx {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		//Queue에 Message 객체를 넣기
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while (!messageQueue.isEmpty()) {
			
			Message message = messageQueue.poll();
			
			switch(message.getCommand()) {
				case "sendMail":
					System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.getTo() + "님에게 SMS을 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.getTo() + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}
	}
}
