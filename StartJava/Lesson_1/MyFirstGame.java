class MyFirstGame {

    public static void main(String[] args) {
        int hiddenNumber = 10;
        for (int i = 1; i <= 100; i++) {
            if (i == hiddenNumber) {
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (i < hiddenNumber) {
                System.out.println("This number is less than what the computer guessed");
            } else {
                System.out.println("This number is greater than what the computer guessed");
            }
        }
    }
}