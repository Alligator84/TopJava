class WolfTest {

    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();

        firstWolf.setIsMale(true);
        System.out.println(firstWolf.getIsMale());
        firstWolf.setNickName("Volchara");
        System.out.println(firstWolf.getNickName());
        firstWolf.setWeight(67);
        System.out.println(firstWolf.getWeight());
        firstWolf.setAge(10);
        System.out.println(firstWolf.getAge());
        firstWolf.setColor("grey");
        System.out.println(firstWolf.getColor());

        firstWolf.walk();
        firstWolf.sit();
        firstWolf.run();
        firstWolf.howl();
        firstWolf.hunt();
    }
}