class Calculator {

    public static void main(String[] args) {
        int firstNumber = 10;
        char mathSign = '-';
        int secondNumber = 5;
        if (mathSign == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (mathSign == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (mathSign == '*') {
            System.out.println(firstNumber * secondNumber);
        } else if (mathSign == '/') {
            System.out.println(firstNumber / secondNumber);
        } else if (mathSign == '^') {
            int result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println(result);
        } else if (mathSign == '%') {
            System.out.println(firstNumber % secondNumber);
        } else {
            System.out.println("Please, input math sign");
        }
    }
}