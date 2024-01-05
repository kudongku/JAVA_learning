package single;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("2번 : "+Thread.currentThread().getName());
            //출력값 = "2번 : 쓰레드1";
            for (int i = 0; i < 10000; i++) {
                System.out.println(i+" 번째 데몬");
            }
        };


        System.out.println("1번 : "+Thread.currentThread().getName());
        //출력값 = "1번 : main";

        Thread thread1 = new Thread(task);
        thread1.setName("쓰레드1");
        thread1.setDaemon(true);
        //우선순위가 낮은 데몬으로 설정할 것이냐

        thread1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i+ "번째 메인 쓰레드");
        }
    }
}
//출력값을 보면, 데몬이 반복문을 다 순회하기 전 메인메소드가 끝날 시 같이 끝나는 것이 보인다.