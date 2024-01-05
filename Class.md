# 클래스
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

### 필드
필드는 고유데이터 상태데이터 객체데이터로 분류
- 고유는 변하지 않는 것
- 상태는 변하는 것

### 메서드 
> 메서드 오버로딩
> 
> println 에서 많운 파라미터를 넣은 수 있는 것!!
```
public void println(char x) {
        if (getClass() == PrintStream.class) {
            writeln(String.valueOf(x));
        } else {
            synchronized (this) {
                print(x);
                newLine();
            }
        }
    }

    public void println(int x) {
        if (getClass() == PrintStream.class) {
            writeln(String.valueOf(x));
        } else {
            synchronized (this) {
                print(x);
                newLine();
            }
        }
    }

    public void println(long x) {
        if (getClass() == PrintStream.class) {
            writeln(String.valueOf(x));
        } else {
            synchronized (this) {
                print(x);
                newLine();
            }
        }
    }

```
> 메서드의 매개변수
>
> 기본형 매개변수는 값이 복사되어 넘어가기 때문에 값이 변경되지 않음
> 
> 참조형 매개변수는 주소값이 넘어가기 때문에 값이 변경
> 
```
// 기본형 매개변수
char type = 'D';
car.brakePedal(type);

// 메서드 실행 완료 후 전달할 매개값으로 지정된 type 값 확인
System.out.println("type = " + type); // 기존에 선언한 값 'D' 출력, 원본 값 변경되지 않음
// 메서드 실행 완료 후 반환된 car 인스턴스의 gear 타입 확인
System.out.println("gear = " + car.gear); // 객체 내부에서 type을 변경하여 수정했기 때문에 'P' 출력

// 참조형 매개변수
Tire tire = new Tire();
tire.company = "금호"; // 금호 타이어 객체 생성

// 차 객체의 타이어를 등록하는 메서드 호출한 후 반환값으로 차 객체의 타이어 객체 반환
Tire carInstanceTire = car.setTire(tire);

// 메서드 실행 완료 후 전달할 매개값으로 지정된 참조형 변수 tire의 company 값 확인
System.out.println("tire.company = " + tire.company); // "KIA" 출력
// 전달할 매개값으로 지정된 tire 인스턴스의 주소값이 전달되었기 때문에 호출된 메서드에 의해 값이 변경됨.

// 메서드 실행 완료 후 반환된 car 인스턴스의 tire 객체 값이 반환되어 저장된 참조형 변수 carInstanceTire의 company 값 확인
System.out.println("carInstanceTire.company = " + carInstanceTire.company); // "KIA" 출력
```
## 멤버
>멤버는 필드와 메서드를 합쳐 말한다.
> 
> 인스턴스 멤버는 인스턴스 필드, 인스턴스 메서드가 존재한다.
> 
> 클래스 멤버는 클래스 필드, 클래스 메서드를 말한다.
> 
> 인스턴스 멤버는 객체를 생성한 후에 사용 가능
> 
> 클래스 멤버는 객체 생성을 하지 않아도 사용가능합니다.


### 인스턴스 멤버
> 메서드는 모든 인스턴스가 같은 메모리에 메소드를 두고 공유
> 
> 필드는 인스턴스 마다 저장공간을 가진다. 

### 클래스 멤버
> static 을 사용하면 가능
> 
> 메인메소드가 이에 해당

### 경우의 수
1. 스태틱 필드, 인스턴스 메소드? 사용가능
2. 스태틱 메소드, 인스턴스 필드? 사용불가
> 스태틱 메소드는 인스턴스화 하지 않아도 사용이 가능하기 때문에, 스태틱 메소드가 인스턴스 필드를 사용하는 것은 불가능
> 
> 인스턴스 메소드는 스태틱 필드가 저장된 후 에 사용되기 때문에 사용 가능

## 클래스 변수, 인스턴스 변수
## 생성자, 생성자 오버로팅
## this, this()
## 접근 제어자
## package
## import
## 상속
## 오버라이딩
## super, super()
## 다형성 원리와 구현방법
## 추상클래스
## 인터페이스 역할, 구성요소, 구현방법
## 인터페이스 디폴트 메소드, static 메서드
## 인터페이스 다형성 원리 구현방필드
