package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T05WildCardTest {
	
	//모든 허용가능한 항목을 담은 카트의 항목 출력 메서드
	//파라미터에 모든 항목을 담을 수 있도록 (Cart<?> cart)
	public static void displayCartItemInfo(Cart<?> cart) {
		System.out.println("= 장바구니 리스트 =");
		for (Object obj : cart.getList()) {
			System.out.println(obj);
		}
		System.out.println("---------------");
	}

	//extends 를 이용한 타입 제한
	//Cart 객체의 타입이 Drink or 그 하위 객체만...
	public static void displayCartItemInfo2(Cart<? extends Drink> cart) {
		System.out.println("= 장바구니 리스트 =");
		for (Object obj : cart.getList()) {
			System.out.println(obj);
		}
		System.out.println("---------------");
	}

	//<? super Meat>: Meat 타입이나 그 상위 타입만 가능하도록 제한...
	public static void displayCartItemInfo3(Cart<? super Meat> cart) {
		System.out.println("= 장바구니 리스트 =");
		for (Object obj : cart.getList()) {
			System.out.println(obj);
		}
		System.out.println("---------------");
	}
	
	
	//Main
	public static void main(String[] args) {
		Cart<Food> foodCart = new Cart<>();
		foodCart.addItem(new Meat("돼지고기", 5000));
		foodCart.addItem(new Meat("소고기", 500000));
		foodCart.addItem(new Juice("오렌지쥬스", 1000));
		foodCart.addItem(new Coffee("아메리카노", 2000));
		
		Cart<Meat> meatCart = new Cart<>();
		meatCart.addItem(new Meat("돼지고기", 5000));
		meatCart.addItem(new Meat("소고기", 500000));
//		meatCart.addItem(new Juice("오렌지쥬스", 1000));
//		meatCart.addItem(new Coffee("아메리카노", 2000));
		
		Cart<Drink> drinkCart = new Cart<>();
//		drinkCart.addItem(new Meat("돼지고기", 5000));
//		drinkCart.addItem(new Meat("소고기", 500000));
		drinkCart.addItem(new Juice("오렌지쥬스", 1000));
		drinkCart.addItem(new Coffee("아메리카노", 2000));
		
		
		
		
		
		//Info는 파라미터의 값이 어떤 타입이어도 상관없다...
		displayCartItemInfo(foodCart);
		displayCartItemInfo(meatCart);
		displayCartItemInfo(drinkCart);

		//Info2는 파라미터의 타입제한이 Drink or Drink 하위 타입이다..
//		displayCartItemInfo2(foodCart);
//		displayCartItemInfo2(meatCart);
		displayCartItemInfo2(drinkCart);
		
		//Info3는 파라미터의 타입제한이 Meat or Meat 상위 타입이다...
		displayCartItemInfo3(foodCart);
		displayCartItemInfo3(meatCart);
//		displayCartItemInfo3(drinkCart);
	}
}

class Food{
	private String name; //이름
	private int price; //가격
	
	//생성자
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//toSring 오버라이드
	@Override
	public String toString() {
		return name + "(" + price + ")";
	}
}

class Drink extends Food{
	
	//생성자
	public Drink(String name, int price) {
		super(name, price);
	}
}


class Meat extends Food{
	public Meat(String name, int price) {
		super(name, price);
	}
}

class Juice extends Drink{
	public Juice(String name, int price) {
		super(name, price);
	}
}

class Coffee extends Drink{
	public Coffee(String name, int price) {
		super(name, price);
	}
}

class Cart<T> {
	private List<T> list;
	
	public Cart() {
		list = new ArrayList<>();
	}

	public List<T> getList() {
		return list;
	}
	
	public void addItem(T item) {
		list.add(item);
	}
}

