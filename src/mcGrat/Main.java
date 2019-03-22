package mcGrat;

public class Main {
    public static void main(String[] args) {
        Person kate = new Person("Kate");
        System.out.println(kate.getName());
        ChangName(kate);



    }
    static  void ChangName (Person p){
        p.setName("asasas");
    }
}



    class Person {
        private String name;

        Person (String name){
            this.name=name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }






