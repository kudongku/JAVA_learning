public class TestRunnable implements Runnable {
    @Override
    public void run() {
        //Thread에서 수행할 작업을 정의
        for(int i=0; i<100; i++){
            System.out.println("#");
        }
    }
}
