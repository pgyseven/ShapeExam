package pgy;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle("원","black", new Point(10,20), 5);
		System.out.println(c.getName()); //자식이 부모가 물려준 겟 네임을 쓰는게 상속이다.
		System.out.println(c.toString()); //여기 투스트링은 shape껄 물려받았다고 썻는데 오브젝트가 아닌건 쉐이프에서 오버라이딩되어 부모의 기능을 가공해서 쓴다고 했기에 여기서 쉐이프에서 받은것
		System.out.println(c.draw());
		
		Rectangle r = new Rectangle("사각형", "빨간색",  new Point(100, 200), 30, 40);
		System.out.println(r.draw());
		
		
//      추상 클래스인 shape도 클래스가 가지고 있는 추상메서드를 구현하면 객체로 만들어 질 수 있다.
//      하지만, 여기서 draw() 를 구현하지 못하는 이유는 shape가 추상적이기 때문이다.
//		추상클래스는 말 그대로 추상적이기 때문에 스스로 객체를 만들려고 만드는 클래스가 아니라...
//		추상 클래스를 상속받는 하위 자식 클래스에서 그 객체의 특성이 분명해지면 구현하려고 만드는 일종의 설계 목적의 클래스이다.
//		Shape s = new Shape("a", "b", new Point(c,d)) {//new 해서 컨트롤 스페이스 해보면  두번째 - anonymous 이름이 없는 타입으로 뜰거다
//			
//			@Override
//			public void draw() { // 니가 추상메서드를 구현하면 객체를 만드는걸 허락해준다. / 하지만 여기서는 특정 도형을 만들수는 없다 
//				sysout(this.getName()....여기서 실행되고 위에서 저장되니깐 s.이라고 호출 못함 
//				
//			}
//		};  
//		s.draw();
		
		
		
		
		Painter p = new Painter("피카소");
		p.drawShape(r); //업케스팅 자식타입이 부모타입으로 변화 렉탱글이 쉐이프로~ 그리고 쉐이프 클래스에가서 다운 캐스팅 될거임
		p.drawShape(c);
	}

}

//
