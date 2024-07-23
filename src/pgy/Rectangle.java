package pgy;

public class Rectangle extends Shape {

	
	
	private int width;
	private int height;
	
	public Rectangle(String name, String color, Point p, int width, int height) {
		super(name, color, p); //부모 생성자 호출 이게먼저 실행되어야함 아래보다 왜냐면 반드시 부모먼저 만들어야하기 때문에
		//생성자가 하는일 두가지
		this.width = width;
		this.height = height; //초기화
	}

	@Override
	public String draw() {
		return this.toString() + "이 그려집니다.";
		
	}
    // 오버라이딩 규칙
	// 1) 상속관계에서
	// 2) 부모의 메서드를 자식클래스에서 코드를 다시 만드는 것.
	// 3) 접근제어자는 부모의 것 보다 범위가 같거나 넓어야 한다. (public String toString() 이걸 디폴트 값으로 변환 String toString() 이렇게만 쓰면 에러 날거다.) 그리고 최상위인 오브젝트 범위를 봐야한다. 아마 찾아보면 퍼블릭일거다 앞에 아무것도 없으니깐 자바.lang을 자바 api 에 찾아보면 나온다.
	// 4) 반환값, 메서드 이름, 매개변수의 갯수나 타입 등이 모두 부모의 것과 같아야 한다.
	// 5) 예외의 갯수는 부모의 것과 같거나 더 많아야 한다.
	
	@Override
	public String toString() {
		return super.toString() + "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
//	public String toString(int a) { //메서드 오버 로딩(OVER LOADING)함 매개변수가 달라짐
//		return "Rectangle [width=" + width + ", height=" + height + "]";
//	}
//	
//	public String toString() { //여기 왼쪽 39번 옆에 초록색 삼각형 뜨는데 이건 오버라이딩 되었다는 뜻이다.
//		return null;
//	}
}
