package pgy;

public class Circle extends Shape{
//	private String name;
//	private String color;
//	private Point p;
//	getter seetter toString 까지 다 상속된것 shape 껄 상속
//	
	private int radius;
	public Circle(String name, String color, Point p, int radius) {
		// 참고로 this() 자기자신의 생성자
		super(name, color, p); //부모 생성자 호출
		
		this.radius = radius;
		System.out.println("2");
	}
	@Override
	public String draw() {
		return this.toString() + "이 그려집니다.";
		
	}
	@Override
	public String toString() {
		return super.toString() + "Circle [radius=" + radius + "]";
	}
	
	
}
