package shimtaehoon;

public class Quiz6 {

	public static void main(String[] args) {

		BallPen ball = new BallPen(2, "100%", "파랑색");
		ManPen man = new ManPen(3, "80%", "몽블랑");
		
		ball.showInfo();
		man.showInfo();

	}

}

class Pen {
	int depth;
	String quantity;
	
	public Pen(int depth, String quantity) {
		super();
		this.depth = depth;
		this.quantity = quantity;
	}
	
}

class BallPen extends Pen {
	String color;
	
	public BallPen(int depth, String quantity, String color) {
		super(depth, quantity);
		this.depth = depth;
		this.quantity = quantity;
		this.color = color;
	}
	

	public void showInfo() {
		System.out.println("펜의 굵기 : " + depth + " 남은 양 : " + quantity + "볼펜의 색 : " + color);
	}

}

class ManPen extends Pen {
	String brand;
	
	public ManPen(int depth, String quantity, String brand) {
		super(depth, quantity);
		this.depth = depth;
		this.quantity = quantity;
		this.brand = brand;
	}
	
	public void showInfo() {
		System.out.println("펜의 굵기 : " + depth + " 남은 양 : " + quantity + "브랜드 : " + brand);
	}

}
