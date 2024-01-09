# JAVA

## java 는 어떻게 동작하는가
> main.java 라는 코드 (소스파일) 가 IDE 에서 작성된다
> 
> =>
> 
> 자바 컴파일러를 거치면 main.class (바이트 코드) 로 번역된다.
> 
> =>
> 
> main.class 파일을 클래스로더가 메모리 영역에 담는다.
> 
> 이떄 메모리 영역은 JVM 이 운영체제에게 할당받는다.
> 
> =>
> 
> JVM 에서 main.class 가 기계어로 번역이 되고, 
> 
> 이 기계어 코드는 OS 에서 실행되며, 하드웨어로 표현된다.

## JVM
> JAVA VIRTUAL MACHINE 
>


## JRE , JDK
### JRE
- JAVA runtime environment
- 자바을 실행할 수 있는 환경
### JDK
- JAVA development kit
- 자바를 개발할 수 있는 키트
- JRE 를 포함하고 있다.

## Main class 
```java
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
}
```

### public class Main
- public 은 접근 제어자
- class 는 객체
- Main 은 클래스 이름
### public static void main
- static 은 컴파일러가 바이트 코드로 변환할 때, 미리 정의되게 해줍니다.
- void 는 이 메소드가 return 을 안하는 것으로 정의해줍니다.
- main 은 메소드 이름
### (String[] args)
- String 은 문자열
- [] 은 배열임을 표기
- args 는 문자열 배열의 이름
- 괄호 안에 있다는 것은 main 메소드가 이 문자열 배열을 매개변수로 받았다는 것.
### System.out.println("Hello world!");
- print 와 println, printf 등이 있는데 잘 섞어서 사용해야 됨.
- System.out.println("Hello world!") = System.out.print("Hello world!\n")

## 객체 지향 프로그래법
### 객체
> 객체는 필드와 메소드로 구성됨
> 
> 객체를 설계하는 것은 객체 모델링
>
> 객체의 메서드 안에 파라미터를 넣을 수 있다. 
> 
> 메소드는 return 을 할 수도, void 일 수도
> 
### 객체 간의 관계
1. 사용관계 (order 과 drink)
2. 포함관계 (drink 와 drinkType)
3. 상속관계 (menu 와 drink)

### 객체 지향의 속성
1. 캡슐화 :
    필드와 메소드를 하나로 묶어 객체로 만든 뒤, private 으로 감추는 것
2. 상속 :
   부모의 필드와 메서드를 자식에게 상속
3. 다향상:
   상속받은 메서드 등을 재구성 하는 것
4. 추상화 :
   객체간의 공통된 부분을 모아 상위 개념으로 선언하는 것

### 객체와 클래스, 인스턴스
> 객체를 생성하기 위한 설계도 == 클래스
> 
> 클래스로 생성된 객체 == 인스턴스

### 클래스를 설계하는 법
1. 클래스를 선언하기
2. 필드를 정의하기
3. 생성자 정의하기
4. 메서드 정의하기

### 객체를 생성해보기
```
new Car(); // Car클래스 객체 생성

Car car1 = new Car(); // Car클래스의 객체인 car1 인스턴스 생성
Car car2 = new Car(); // Car클래스의 객체인 car2 인스턴스 생성
```