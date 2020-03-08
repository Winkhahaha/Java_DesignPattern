package 建造者模式.improve;

public class House {
    private String name;

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
