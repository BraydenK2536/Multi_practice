package Generics.test;
import java.util.ArrayList;


public class test {
    public static void main(String[] args) {
        ArrayList<Animal> pet = new ArrayList<>();
        pet.add(new LH_Cat("A",1));
        pet.add(new BS_Cat("B",2));
        pet.add(new TD_Dog("C",3));
        pet.add(new HSQ_Dog("D",4));
        keepPet(pet);
    }

    public static void keepPet(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
