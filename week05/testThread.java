public class testThread extends Thread{ //1. Thread를 상속받는다.
    //2. run 메소드 생성
    @Override
    public void run() {
//        super.run();
        //3. 실제 우리가 쓰레드에서 수행할 작업을 적는다.
        System.out.println("test");
        for(int i=0; i<100; i++){
            System.out.println("*");
        }
    }
}
