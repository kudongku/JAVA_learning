# 인터페이스
## 역할
> 두 객체를 연결해주는 다리
> 
> ex) 삼성티비, 엘지티비 객체를 멀티리모콘 인터페이스를 통해서 사람객체가 컨트롤
> 
## 선언
```java
public interface 인터페이스명 { 

}
```
public 과 default 접근 제어자를 지정할 수 있음

## 구성
멤버 변수 (필드) 는 public static final 이여야 한다.

생략은 가능하다.

모든 메소드는 public abstract 이어야 한다.

생략은 가능하다.

생략된 것은 컴파일러가 자동으로 추가해준다.

```
void turnOn(); // public abstract void turnOn();
```

## 구현
- 인터페이스로 인스턴스를 생성할 수 없기 때문에 클래스에 구현되어 생성된다.
```java
public class 클래스명 implements 인터페이스명 { 
			// 추상 메서드 오버라이딩
			@Override
	    public 리턴타입 메서드이름(매개변수, ...) {
			       // 실행문
	    }
}
```

## 상속
- 인터페이스는 다중 상속이 가능하다. (클래스는 다중 상속이 불가능하다.)
```
public class Main implements C {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
				System.out.println("B");
    }
}

interface A {
    void a();
}
interface B {
    void b();
}
interface C extends A, B { }
```
- main 클래스가 인터페이스 c 를 상속받아 a, b 의 추상 메소드가 오버라이드 된다.
```
public class Main extends D implements C {
    
    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    @Override
    void d() {
        super.d();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.a();
        main.b();
        main.d();
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C extends A, B {
}

class D {
    void d() {
        System.out.println("D");
    }
}
```
- 인터페이스 구현과 상속이 동시에 할 수 있다.

## 인터페이스 역할, 구성요소, 구현방법
## 인터페이스 디폴트 메소드, static 메서드
## 인터페이스 다형성 원리 구현방필드
