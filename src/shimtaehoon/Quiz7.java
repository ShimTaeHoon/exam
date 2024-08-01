package shimtaehoon;

import java.util.ArrayList;

public class Quiz7 {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<>();
		list.add(new Human());
		list.add(new Tiger());
		
		Animal human = new Human();
		Animal tiger = new Tiger();
		
		human.sleep();
		human.move();
		if(human instanceof Human) {
			Human a = (Human)human;
			a.read();
		}
		
		System.out.println();
		
		tiger.sleep();
		tiger.move();
		if(tiger instanceof Tiger) {
			Tiger t = (Tiger)tiger;
			t.hunt();
		}

	}

}

abstract class Animal {
	
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}
	
	abstract public void move();
	
}

class Human extends Animal {

	@Override
	public void move() {

		System.out.println("사람이 두 발로 걷습니다.");
		
	}
	
	public void read() {
		
		System.out.println("사람이 책을 읽습니다.");
		
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {

		System.out.println("호랑이가 네 발로 뜁니다.");
		
	}
	
	public void hunt() {
		
		System.out.println("호랑이가 사냥을 합니다.");
		
	}
	
}

