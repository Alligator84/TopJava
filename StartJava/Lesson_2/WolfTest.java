class WolfTest {

    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();

        firstWolf.isMale = true;
        System.out.println(firstWolf.isMale);
        firstWolf.nickName = "Volchara";
        System.out.println(firstWolf.nickName);
        firstWolf.weight = 67;
        System.out.println(firstWolf.weight);
        firstWolf.age = 10;
        System.out.println(firstWolf.age);
        firstWolf.color = "grey";
        System.out.println(firstWolf.color);

        firstWolf.walk();
        firstWolf.sit();
        firstWolf.run();
        firstWolf.howl();
        firstWolf.hunt();
    }
}