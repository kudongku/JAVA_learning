# 예외처리
## 오류, 예외 는 무엇인가
만약 
1. 사용자가 숫자가 아닌 문자를 입력할 경우,
2. short 로 선언한 변수가, Long 의 사이즈를 가질 경우,
3. 컴퓨터의 메모리가 부족할 경우,
등등의 상황에서,

사전에 이런 예외사항을 정의해 둔다면, 

문제사항에 대응하여 해결할 수 있다.

>오류(에러)는 회복이 불가능한 문제, 시스템 레벨에서 발생, 환경적 이유
> 
>예외는 회복이 가능한 문제, 예상하고 대응할 수 있다. 

### 에러의 종류
1. 컴파일 에러
   1. .java 파일을 .class 로 바꾸는 것을 컴파일이라고 한다.
   2. 그 와중에서 발생하는 에러를 컴파일 에러라고 한다.
   3. 문법이 틀린 경우라서, 문법을 맞게 작성해주면 된다.
2. 런타임 에러
   1. 예외처리를 해줘야하는 에러
   2. 런타임은 프로그램이 돌아가는 시간을 의미함
   3. ex) 허용할 수 없는 데이터일 경우
   
혹은

1. checked Error
   1. 컴파일 에러와 다르다.
   2. 컴파일 시점에서 확인하는 예외
   3. 이 때 예외처리를 하지 않으면 컴파일 에러가 발생
   4. 우리가 다루는 예외처리가 이에 해당한다.
2. unchecked Error
   1. 런타임 시점에서 확인하는 예외
   2. 예상을 할 수 없다.
## 예외처리하는 방법
1. 예외를 정의하기
   1. 예외클래스를 만들어 정의한다.
   ```java
   public class BadException extends Exception {
        // Exception 이라는 상위 클래스를 상속받는다.
        public BadException(){
            super("위험한 행동에 대한 예외처리");
        }
   }
   ```
2. 예외가 발생할 수 있음을 알리기
```
private final static boolean just = true;
public void thisMethodDanger() throws BadException{
    if(just) throw new BadException();
}
```
### throw
메서드 안에서 예외 객체를 던질 때 사용
### throws
메서드 이름 뒤에 붙어서 매서드가 어떤 예외사항을 던질 수 있는지 알려준다. 

예외객체와 같이 사용
3. 예외를 핸들링 하기
```java
public class Main {
    public static void thisMethodDanger(Boolean b) throws BadException{
        if(b) throw new BadException();
    }
    public static void main(String[] args) {
//        thisMethodDanger(); //Unhandled exception: BadException

//        1. 예외 발생시
        try{
            thisMethodDanger(true); //예외가 날 수 있는 것은 try 에 넣는다.
        }catch(BadException e){ //발생할 수 있는 예외는 괄호 안에, 인스턴스도 생성해서 (e)
            System.out.println("!!!!"+e.getMessage()); //에러 메세지를 받는다.
        }finally{
            //정상실행되든 오류처리되든 여기를 거침
            System.out.println("finally");
        }
        //!!!!위험한 행동에 대한 예외처리
        //finally

//        2. 정상 실행시
        try{
            thisMethodDanger(false);
        }catch(BadException e){
            System.out.println("!!!!"+e.getMessage());
        }finally{
            System.out.println("finally");
        }
        //finally
    }
}
```
## Chained Exception
>예외는 다른 예외를 유발할 수 있다.
> 
> 예외 A 가 예외 B 를 유발하는 경우, A 는 B 의 원인 예외
> 
> 예외 연결 : 원인 예외를 새로운 예외로 등록, 다시 새로운 예외를 발생
### 왜?
여러가지 예외를 하나의 큰 분류로 묶어서 다루기 위해

checked exception 을 unchecked exception 으로 랩핑
### methods
1. initCause()
2. getCause()