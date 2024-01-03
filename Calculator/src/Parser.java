import java.util.regex.Pattern;

public class Parser {

    public int calculate(String firstInput, String operator, String secondInput) throws Exception{
        int num1 = Integer.parseInt(firstInput);
        int num2 = Integer.parseInt(secondInput);
        int answer = 0;

        switch (operator){
            case "+":
                answer = num1+num2;
                break;
            case "-":
                answer = num1-num2;
                break;
            case "*":
                answer = num1*num2;
                break;
            case "/":
                answer = num1/num2;
                break;
        }
        return answer;
    }
}
