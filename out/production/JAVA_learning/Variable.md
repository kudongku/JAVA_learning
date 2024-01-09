# 변수
> 변수란 메모리에 데이터를 보관하는 것.
> 
>변수의 종류에는 기본형 변수와 참조형 변수가 존재한다.
> 
> 기본형 변수는 원본값이 stack 영역에 저장된다.
> 
> 하지만, 참조형 변수는 heap 영역에 원본값이 저장, heap 영역의 주소값이 stack 영역에 저장된다.
> 
> stack 은 정적이고, heap 은 동적이다.
```java
public class Var {
    public static void main(String[] args) {
        int number1; //선언
        int number2 = 10; //초기화 (선언과 동시에 저장)
        number2 = 20; //덮어쓰기
        final int number3 = 40; //상수는 변하지 않는 것. 변수와는 다른 저장공간에 저장, 덮어쓰기 불가
    }
}
```
## 기본형 변수
```java
public class Var {
    public static void main(String[] args) {
        boolean isTrue = true;
        char character = 'A'; //홑따옴표로 표기해야함

        byte b = 127; // 1 바이트 == 8 비트, 1 비트는 0,  두개의 표현 가능
        short s = 32767;
        int i = 2147483647;
        long l = 999999999L; //매우 큰값을 표기한다.

        float f = 0.123456789f;
        double d = 0.123456789123456789;
    }
}
```
## 참조형 변수
```
String name = "dongku";
int[] intArr = {1,2,3};
```
### 배열
```
//선언
int[] intarr;
int intarr2[];

//생성 (변수의 할당과 비슷한 개념), 길이를 정해줘야함.
intarr = new int[10]; //intarr = {0,0,0,0,0,0...
int[] intarr3 = new int[10];//처음에 할당되는 값은 0이다.

//초기화
Arrays.fill(intarr3, 1);
String[] stringArray = {"a", "b", "c", "d"};
for (int i = 0; i < intArray.length; i++) {
	intArray[i] = i;
}

char[] charArr = new char[3];//처음에 할당되는 값은 null 이다.

boolean[] boolArr = new boolean[3];//처음에 할당되는 값은 false 이다.

String[] strArr = new String[3];//처음에 할당되는 값은 null 이다.
```
> 배열은 참조형 변수, stack 에는 heap 영역의 주소값이 저장되는 것.
> 
> 얕은 복사와 깊은 복사가 가능해진다.
```
// 얕은 복사

int[] a = { 1, 2, 3, 4 };
int[] b = a; // 얕은 복사

b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

System.out.println(a[0]); // 출력 3  <- a 배열의 0번째 순번값도 3으로 조회됩니다.
```
```
// 깊은 복사

int[] a = { 1, 2, 3, 4 };
int[] b = new int[a.length]; 

for (int i = 0; i < a.length; i++) {
    b[i] = a[i]; // 깊은 복사
}

b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

System.out.println(a[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.


// 1. clone() 메서드
int[] a = { 1, 2, 3, 4 };
int[] b = a.clone(); // 가장 간단한 방법입니다. 
// 하지만, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작합니다!!


import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// 2. Arrays.copyOf() 메서드
		int[] a = { 1, 2, 3, 4 };
		int[] b = Arrays.copyOf(a, a.length); // 배열과 함께 length값도 같이 넣어줍니다.
	}
}
```
## 래퍼클래스
byte
Byte

short
Short

int
Integer

long
Long

float
Float

double
Double

char
Character

boolean
Boolean

> 되도록 래퍼클래스를 사용하도록 하자.
## 변수간 변환
>byte(1) → short(2) → int(4) → long(8) → float(4) → double(8)
### 명시적 형변환
```
int intN = 10;
System.out.println((float) intN); //10.0

double doubleN = 3.14;
System.out.println((int) doubleN); //3
```
### 암시적 형변환
```
int i = 3;
double d = i; //3.0
System.out.println(d);
```
## 문자열은 어떻게 저장되는가
### 문자는 아스키코드로 변환되어 숫자로 저장된다.
```
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
//97을 입력할 경우,

int asciiNumber = sc.nextInt();
//선언된 asciiNumber 에 97이 할당
char ch = (char)asciiNumber;
//asciiNumber 을 형변환하여 ch이라는 캐릭터에 저장
System.out.println(ch); //char 을 프린트해보니 a
```
즉 char은 아스키넘버로 문자를 저장한 후,
나중에 꺼낼때 다시 문자로 변환하는 것!
```
int chNum = (int) ch;
System.out.println(chNum); 
```
다시 97이 프린트 되는 것을 확인할 수 있다.

### 문자열은 문자의 배열로 저장된다.
```
String str = "abcd";
System.out.println(str.length());
```
배열의 길이를 구할 수 있다.
```
char c = str.charAt(3);
System.out.println(c);
```
배열의 원소인 char 또한 인덱스로 찾을 수 있다.

```
char[] cArr= {'a','b', 'c'};
String str = new String(cArr);
System.out.println(str);
```

### 그렇다면 String[]은?
다차원 배열..!?

> String str = "abcd";
=> char[] strArr = {'a','b','c','d'}
=> int[] strIntArr = {92, 32, 42, 43}
(숫자는 대충 입력한 것)

length()

charAt(int index)

substring(int from, int to)

equals(String str)

toCharArray()

new String(char[] charArr)

다 써보도록 하자.