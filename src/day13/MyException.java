package day13;

public class MyException extends Exception{
	
	public MyException(String msg, Throwable e) {
		super(msg, e);
	}
}
