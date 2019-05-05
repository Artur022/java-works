package Clinic;

public class Cat extends Pet {


    public Cat(String name, Integer age, String sex, TypeAnimal type) {
        super(name, age, sex, type);
    }

    @Override
    public String Sound() {
        return "Мяу";
    }
}
