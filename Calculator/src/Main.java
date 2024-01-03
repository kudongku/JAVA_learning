public class Main {
    public static void main(String[] args) {
        boolean calculateEnd = false;

        while (!calculateEnd) {
            try {
                calculateEnd = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println( e.getMessage());
            } finally {
                System.out.println("끝");
            }
        }
    }
}