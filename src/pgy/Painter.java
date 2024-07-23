package pgy;

public class Painter { //얘는 아무 상속관계도 아니다.
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Painter(String name) {
		super();
		this.name = name;
	}
	
//	public void drawCircle(Circle c) {
//		System.out.println(this.name + "가" + c.draw());
//	}
//
//	public void drawRectangle(Rectangle r) {
//		System.out.println(r.draw());
//	}

	
	
	public void drawShape(Shape s) { // 원과 사각형은 shape 는 is a 관계다 
		if(s instanceof Rectangle) { //s가 rectangle 객체냐? 참거짓 반환누구의 객체 instanceof 갤러그 아군과 적군 구분해서 누구인지 구분하여 부딪히면 터질지 안터질지 진짜로 인스턴스 오브 쓴다.
			
			System.out.println("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
			
		}
		if(s instanceof Circle) {
			System.out.println("ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
			
			
		}
		System.out.println(this.name + "가" + s.draw()); //s.draw()); 여기서 다운캐스팅 부모의 추상인데 자식이 구현한 드로우를 쓴거 부모의 이름으로 자식이 구현한 객체를 호출할 수 있다. 다형성
	}
	
	
	@Override
	public String toString() {
		return "Painter [name=" + name + "]";
	}
	

}
