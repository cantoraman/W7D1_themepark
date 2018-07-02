public class Visitor {

    private String name;
    private int age;
    private double height;
    private int money;

    public Visitor(String name, int age, double height, int money) {
        this.name = name;
        this.age= age;
        this.height = height;
        this.money = money;
    }

    public String getName() {
        return name;
    }
}
