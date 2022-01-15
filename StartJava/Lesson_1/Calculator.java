import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.String;

class Calculator {

    public static void main(String[] arg) {
        System.out.println("Example of a mathematical expression: 2 + 3. Spaces are required!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int firstNumber = Integer.parseInt(tokenizer.nextToken());
            String mathSign = tokenizer.nextToken();
            int secondNumber = Integer.parseInt(tokenizer.nextToken());
            if (mathSign.equals("+")) {
                System.out.println(firstNumber + secondNumber);
            } else if (mathSign.equals("-")) {
                System.out.println(firstNumber - secondNumber);
            } else if (mathSign.equals("*")) {
                System.out.println(firstNumber * secondNumber);
            } else if (mathSign.equals("/")) {
                System.out.println(firstNumber / secondNumber);
            } else if (mathSign.equals("^")) {
                int result = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println(result);
            } else if (mathSign.equals("%")) {
                System.out.println(firstNumber % secondNumber);
            } else {
                System.out.println("Please, input math sign");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}