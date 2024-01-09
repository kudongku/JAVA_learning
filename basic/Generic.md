# 제네릭
### 왜?
1. 중복되거나 필요없는 코드를 줄여주는 것.
   1. 자바스크립트나 파이썬은 변수 타입을 선언하지 않는다.
   2. 메소드의 리턴값도 선언해주지 않는다. 
   3. 자바의 경우는 println 만 봐도, 메소드 오버로딩을 통해 여러개 구현해야한다.
2. 그러면서도 타입 안정성은 해치지 않는 것.
   1. ```public Object plusReturnFunction(Object a,Object b) { ... }```
   2. 이 코드는 코드를 줄일 수는 있지만 타입 안정성은 해친다.
   3. 메소드 안에서 모든 타입에 대해 대처해야된다.
   4. ex) 1 + "안녕"
   5. 타입은 정해둬야 버그가 발생하지 않는다.
## 기본 문법
```java
// 1. 제네릭은 클래스나 메서드 둘다 사용가능
public class Generic<T> { //<T>는 제네릭임을 알려준다.
		// 2.<> 안에 들어가야 할 타입을 명시
    private T t;
    // 3.return 값도 바뀐다.
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
				// 4. <> 안에 String 이 들어가 있으므로, string 타입이구나!
        Generic<String> generic = new Generic<>();
				// 5.모두 String 타입으로 바뀜
        generic.set("Hello World");
				
        String str = generic.get();

        System.out.println(str);
    }
}
```
1. Generic<T> : 제네릭 클래스
2. T : 타입 변수
3. Generic 클래스 : 원시 타입
4. static 멤버는 사용 불가
   1. static T  get(){...} 에러발생
5. 다수의 타입변수 사용 가능 Generic<T,U,E>
   1. Generic<Long, Integer, Boolean> 
6. 상속은 그대로 적용
7. wildCard : 다형성
   1. <? extends T> : T 와 그 자손들만 사용 가능
    2. <? super T> : T와 그 조상들만 가능
    3. <?> : 제한 없음
    4. ex)
    ```public class parkinglot <T extends Car>{...}```
    5. ```parkinglot<BMW> bmwParkingLot = new parkinglot();``` 정상작동
   6.  ```parkinglot<iphone> iParkingLot = new parkinglot();``` 에러
   7. iphone 은 Car 의 자손이 아니기 때문

## Collection 다시 이해하기
### 리스트
```
ArrayList<Integer> arrList = new ArrayList<>();
```
> 리스트는 순서를 가지고 있다. (set 과 다르게)
> 
> 리스트는 import 해줘야 한다. (배열은 프로그래밍 언어에서 지원하는 자료형)
> 
> 배열과 리스트 둘다 조회는 빠름, 추가 혹은 삭제는 느리다.
> 

> 리스트는 interface, ArrayList 는 
> 
> class ArrayList< E> extends AbstractList< E> implements List< E>
> 
> interface 에서 구현하지 않는 메소드 리턴값을, class 에서 구현해 놓음 