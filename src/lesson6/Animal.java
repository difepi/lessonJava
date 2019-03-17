package lesson6;

public class Animal {
    public String name;
    public int run;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();

    }
}

class Cat extends Animal {

    protected boolean sweem;
    int jump;

    public Cat(String name, int run, boolean sweem, int jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    public void catInfo() {
        System.out.println("Кота зовут: " + name + " /RunLimit: " + run + " meters/" + " /Sweem:" + sweem + " /Jump: " + jump + " meters/");
    }
}

    class Dog extends Animal {

        public double jump;
        public int sweem;


        public Dog(String name, int run, int sweem, double jump) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }

        public void dogInfo() {
            System.out.println("DogName: " + name + " /RunLimit: " + run + " meters/" + " /Sweem:" + sweem + " /Jump: " + jump + " meters/");
        }
    }




