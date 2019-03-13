package lesson5;

public class Worker {
    private String name, position;
    private int  phone, salary, age;

    public Worker(String name, String position, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void outWorkerInformation (){
        System.out.println (" ФИО: " + this.name + "  Должность:   " + this.position + " Телефон " + this.phone +
                " Возраст " + age + " Зарплата: " + this.salary);

    }

    public int getAge() {
        return age;
    }
}
