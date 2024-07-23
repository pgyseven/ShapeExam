package pgy;

public abstract class Shape { //추상 메서드가 되는 순간 자식이 물려받은 추상메서드를 구현해야함
private String name;
private String color;
private Point p;

// 일반매서드 추상메서드 생성자 가질 수 있지만 인터페이스는 좀 더 추상적이다. 특성이 없다. 
// 널로만들면 객체 소멸 가비지 컬렉터가 안쓰는 메모리라 인식해서 수거함 즉 메모리도 소멸

public Shape() {

}
//생성자 오버로딩이게 되는 순간 기본 생성자를 덮어씀 그래서 원래 생략가능하던게 안되는거임 이렇게 오버로딩하면 기본생성자 없어서 에러난다. 즉 클래스만 호출할경우 지금 오버로딩된 네임과 컬러 포인트는 모르기 때문에 에러남 
public Shape(String name, String color, Point p) {
	super(); // Object의 기본 생성자를 호출하여 오브젝트 객체를 먼저 만들고 옴 / 부모의 기본 생성자 호출
	System.out.println("1"); //이걸로 circle  보다 먼저 만들어지는걸 알 수 있다.
	this.name = name;
	this.color = color;
	this.p = p;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Point getP() {
	return p;
}
public void setP(Point p) {
	this.p = p;
}

public abstract String draw(); // 추상메서드 하나만 가지고 있어도 클래스도 앱스트릭트 써줘야 한다. /부모가 되면 추상적으로 된다. 도형에서는 원도 아니고 사각형도 아니니깐 이 메서드를 물려주긴 해야하는데 바디를 쓸 수 없음 즉 모든 도형은 그릴수는 있다 근데 어떤 도형인지 모르니깐 여기서는 추상 메서드로만 보낸다. 
	

@Override
public String toString() {
	return "Shape [name=" + name + ", color=" + color + ", p=" + p + "]";
}


}
