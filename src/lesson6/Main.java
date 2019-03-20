package lesson6;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("CatsCategory");
        Cat cat = new Cat("Barsik", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Dogs");
        Dog dog = new Dog("Sharik", 500, 10, 0.5);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}