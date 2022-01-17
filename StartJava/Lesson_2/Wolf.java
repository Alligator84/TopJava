class Wolf {

    private boolean isMale;
    private String nickName;
    private int weight;
    private int age;
    private String color;

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age <= 8) {
            this.age = age;
        } else {
            System.out.println("Age is not correct");
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void walk() {
        System.out.println("Walks");
    }

    public void sit() {
        System.out.println("Sits");
    }

    public void run() {
        System.out.println("Runs");
    }

    public void howl() {
        System.out.println("Howls");
    }

    public void hunt() {
        System.out.println("Hunts");
    }
}