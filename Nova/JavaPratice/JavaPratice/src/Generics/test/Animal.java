package Generics.test;

public class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {}

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

    public void eat(){
        String act;
        if(this instanceof LH_Cat){
            act = "LH_Cat";
        }else if(this instanceof BS_Cat){
            act = "BS_Cat";
        }else if(this instanceof HSQ_Dog){
            act = "HSQ_Dog";
        } else if (this instanceof TD_Dog) {
            act = "TD_Dog";
        }else{
            act = "err";
        }
        System.out.println(age + "岁的" + name +"正在吃" + act);
    };
}
