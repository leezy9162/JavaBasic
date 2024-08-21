package day12.nestedInterface;

public class Button {
	//nested interface type field
	OnClickListener listener;
	
	void setOnClickListner(OnClickListener listner) {
		this.listener = listner;
	}
	
	void touch() {
		listener.onClick();
	}
	
	//nested interface
	static interface OnClickListener{
		//abstract method
		void onClick();
	}
}
