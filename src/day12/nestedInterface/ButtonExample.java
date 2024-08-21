package day12.nestedInterface;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListner(new CallListener());
		btn.touch();
		
		btn.setOnClickListner(new MessageListener());
		btn.touch();
	}
}
