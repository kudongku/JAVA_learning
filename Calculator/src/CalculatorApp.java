
import java.util.Scanner;
import java.util.regex.Pattern;

public class CalculatorApp {
    private static final String NUMBER_REG = "^[0-9]*$";
    private static final String OPERATION_REG = "[+\\-*/]";

    public  static boolean start() throws Exception{
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수 입력 : ");
        String firstInput = scanner.nextLine();
        if(!Pattern.matches(NUMBER_REG,firstInput)){
            throw new BadInputException("정수값");
        }

        System.out.println("연산자 : ");
        String operator = scanner.nextLine();
        if(!Pattern.matches(OPERATION_REG, operator))

        System.out.println("두 번째 수 입력 : ");
        String secondInput = scanner.nextLine();
        if(!Pattern.matches(NUMBER_REG,secondInput)){
            throw new BadInputException("정수값");
        }

        int answer = parser.calculate(firstInput, operator, secondInput);

        //연산 메소드
        System.out.println("연산 결과 : " + answer);
        return true;
    }
}
