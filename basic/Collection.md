# 자료구조
### 다차원 배열, 가변배열
배열안에 배열을 다차원 배열이라 한다.
```
int[][] doubleArr;
doubleArr = new int[3][];
doubleArr[0] = new int[3]; //다차원 배열을 가변배열로 활용할 수 있다.
//doubleArr[1][] = new int[3][]; 가변배열을 할 때에는 다차원으로 할 수는 없다.
int[][][] triArr; //3차원 배열도 가능하다.
//doubleArr = {{1,2,3,4}, {},{}}; 초기화를 다시하는 것은 불가능
```
## List
리스트는 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다.
### ArrayList
array와 달리 길이를 몰라도 됨. 동적배열이라고도 한다. array는 정적배열이라 함.
```
ArrayList<Integer> intList = new ArrayList<>();
intList.add(1);
System.out.println(intList.get(0));
intList.set(0,2);
intList.remove(0);
System.out.println(intList.toString());
```

### LinkedList
linkedList 메모리에 남는 공간을 요청해서 여기 저기 값을 나누어 담는다.
조회속도는 느리나, 값을 추가하거나 삭제하는것은 빠르다.
```
LinkedList<Integer> linkedList = new LinkedList<>();
linkedList.add(1);
System.out.println(linkedList.get(0));
linkedList.set(0,30);
System.out.println(linkedList.toString());
```
## Stack, Queue
### Stack
stack은 쌓아둔다.
first in last out
 ```
 Stack<Integer> intStack = new Stack<Integer>();
intStack.push(1);
intStack.push(2);
intStack.push(3);

while(!intStack.isEmpty()){
	System.out.println(intStack.pop());
} // 출력은 3, 2, 1 순

intStack.push(4);
intStack.push(5);
System.out.println(intStack.peek()); //출력은 5로 나온다. 
 ```
### Queue
que 는 원통형 모양
first in first out
```
Queue<Integer> que = new LinkedList<>();
// que 는 생성자가 따로 없다. 
que.add(1);
que.add(2);
que.add(3);

while (!que.isEmpty()){
	System.out.println(que.poll());
} // 출력은 1, 2, 3 순

que.add(4);
que.add(5);
System.out.println(que.peek()); // 출력은 4
System.out.println(que.size());
```
## Set
집합, 순서 없고, 중복 없다.
set으로만 쓸 수도 있지만, hashSet TreeSet으로도 사용이 가능하다.
set 또한 생성자가 없는 껍데기라서 바로 생성할 수 없다.
```
		Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(22);
        intSet.add(3);
        intSet.add(43);
        intSet.add(5);

        for(Integer value: intSet){
            System.out.println(value);
        }//순서대로 출력되는것을 확인
        System.out.println(intSet.contains(2)); //false
```
## Map
맵은 키로 밸류를 찾는다.
이것도 생성자가 없어서 해시맵으로 생성한다.
```
		Map<String, Integer> intMap = new HashMap<>();

        intMap.put("one", 1);
        intMap.put("one", 13);
        intMap.put("two", 2);
        intMap.put("three", 3);

        for(String key: intMap.keySet()){
            System.out.println(key);
        }//one, two, three

        for(int val: intMap.values()){
            System.out.println(val);
        }//13, 2, 3 출력

        System.out.println(intMap.get("three")); //3
```

> collection은 기본형 변수가 아닌, 참조형 변수를 저장한다.
Integer, Long, Double, String(원래 참조형 변수이다.)
래퍼클래스라고도 함