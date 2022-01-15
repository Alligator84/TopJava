class ConditionalStatement {

    public static void main(String[] args) {
        int age = 25;
        if (age > 20) {
            System.out.println("This is not teenager");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("This is male");
        }

        if (!isMale) {
            System.out.println("This is female");
        }

        float height = 2.02F;
        if (height < 1.80) {
            System.out.println("Average height man");
        }

        char firstLetterOfName = 'O';
        if (firstLetterOfName == 'M') {
            System.out.println("First letter of name is M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("First letter of name is I");
        } else {
            System.out.println("First letter of name not M or I");
        }
    }
}