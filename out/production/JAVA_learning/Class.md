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
## 객체
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
   필드와 메소드를 하나로 묶어 객체로 만든 뒤, private 으로 감추는 것,
   즉 접근 제어자를 사용하여 구현한다.
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
## 필드
필드는 고유데이터 상태데이터 객체데이터로 분류
- 고유는 변하지 않는 것
- 상태는 변하는 것
## 메서드 
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


### 인스턴스 멤버
> 메서드는 모든 인스턴스가 같은 메모리에 메소드를 두고 공유
> 
> 필드는 인스턴스 마다 저장공간을 가진다. 
> 
> 인스턴스 멤버는 객체를 생성한 후에 사용 가능

### 클래스 멤버
> static 을 사용하면 가능
> 
> 메인메소드가 이에 해당
> 
> 클래스 멤버는 객체 생성을 하지 않아도 사용가능합니다.

### 경우의 수
1. 스태틱 필드, 인스턴스 메소드? 사용가능
2. 스태틱 메소드, 인스턴스 필드? 사용불가
> 스태틱 메소드는 인스턴스화 하지 않아도 사용이 가능하기 때문에, 스태틱 메소드가 인스턴스 필드를 사용하는 것은 불가능
> 
> 인스턴스 메소드는 스태틱 필드가 저장된 후 에 사용되기 때문에 사용 가능

### 지역변수
> 메소드가 실행되면 생성
> 
> 종료되면 소멸
> 
```java
public class Main {
    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();

        System.out.println(main1.getNumber(3));
        System.out.println(main1.getNumber(3));
        System.out.println(main1.getNumber(3));
        System.out.println(main1.getNumber(3));
        System.out.println(main2.getNumber(3));
    }

    public int getNumber(int num){
        int i = 1;
        i+=num;
        return i;
    }
}

```
> 값이 누적되지 않는다
### 전역변수(static)
> 상수와 목적이 비슷하기 때문에 final static 으로 선언되기도 한다.
## 생성자
### 기본생성자
매개변수를 아무것도 받지 않는 생성자를 말한다.

작성하지 않아도 자동으로 생성되지만,

만약 한개 이상의 생성자를 이미 만든 경우에는 기본생성자를 작성해야만 생성이 된다.
### 생성자 오버로딩
```
Car car2 = new Car("GV60");
Car car3 = new Car("GV70", "Blue");
```
이 처럼, 매개인자의 개수에 따라 생성자를 여러개 두는 것을 오버롣딩이라 한다.
## this, this()
- this 는 생성자 내에서 인스턴스 자기자신을 가리킬때 사용한다.
- this()
```
public Car(String model) {
    this.model = model;
    this.color = "Blue";
    this.price = 50000000;
}

public Car(String model, String color) {
    this.model = model;
    this.color = color;
    this.price = 50000000;
}

public Car(String model, String color, double price) {
    this.model = model;
    this.color = color;
    this.price = price;
}
```
코드의 중복이 발생하기 때문에
```
public Car(String model) {
    this(model, "Blue", 50000000);
}

public Car(String model, String color) {
    this(model, color, 100000000);
}

public Car(String model, String color, double price) {
    this.model = model;
    this.color = color;
    this.price = price;
}
```
이런 식으로 코드의 중복을 피한다.

이렇게 사용할때는 this()는 첫줄에 사용되어야 한다.
## 접근 제어자
- public : 접근 제한이 전혀 없습니다.
- proteceted : 같은 패키지 내에서만, 다른 패키지이지만 자손클래스라면 접근이 가능
- default : 같은 패키지 내에서만 접근이 가능
- private : 같은 클래스 내에서만 접근이 가능
- 따로 지정이 안되면 default로 처리된다.
- 사용가능한 제어자
   - 클래스 : `public`, `default`, `final`, `abstract`
   - 메서드 :`public`, `protected`, `default`, `private`, `final`, `abstract`, `static`
   - 멤버변수 :`public`, `protected`, `default`, `private`, `final`, `static`
   - 지역변수 : `final`

- 메서드에 `static`과 `abstract`를 함께 사용할 수 없다.
- 클래스에 `abstract`와 `final`을 동시에 사용할 수 없다.
- `abstract`메서드의 접근 제어자가 `private`일 수 없다.
- 메서드에 `private`와 `final`을 같이 사용할 필요는 없다.
## package
## import
## 상속
## 오버라이딩
## super, super()
## 다형성 원리와 구현방법
## 추상클래스
- 미완성된 클래스
- abstract 제어자를 사용하여 추상클래스를 선언할 수 있다.
```java
public abstract class 추상클래스명 {

}
```
- 추상클래스에서 추상 메소드 또한 생성 가능
```java
public abstract class 추상클래스명 {
		abstract 리턴타입 메서드이름(매개변수, ...);
}
```
- 추상클래스는 자식클래스에 상속되어 완성된다.
```java
public class 클래스명 extends 추상클래스명 {
		@Override
    public 리턴타입 메서드이름(매개변수, ...) {
		       // 실행문
    }
}
```
### 예제
Car 추상 클래스
```java
public abstract class Car {
    String company; // 자동차 회사
    String color; // 자동차 색상
    double speed;  // 자동차 속도 , km/h

    public double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public abstract void horn();
}
```
Car 추상 클래스를 상속받은 ZenesisCar 클래스
```java
public class ZenesisCar extends Car {

    @Override
    public void horn() {
        System.out.println("Zenesis 빵빵");
    }
}
```
