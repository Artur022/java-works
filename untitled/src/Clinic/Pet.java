package Clinic;

public class Pet implements Animal {

    public String name;
    public Integer age;

    public Pet(String name, Integer age, String sex, TypeAnimal type) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.type = type;
    }

    public String sex;
    public TypeAnimal type;

    @Override
    public String Sound() {
        return null;
    }
}
