package test.SortTest;

public class Person {
    private String name;
    private int age;
    private Double height;

    public Person(String name, int age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return Person.class.getSimpleName() + " [name=" + name + ", age=" + age + ", height=" + height + "]";
    }
}
