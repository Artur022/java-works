package Clinic;

public class Dog extends Pet {

    public Dog(String name, Integer age, String sex, TypeAnimal type) {
        super(name, age, sex, type);
    }

    @Override
    public String Sound() {
        return "Гав-Гав";
    }
}
