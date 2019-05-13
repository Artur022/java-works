package ru.lesson.lessons.Clinica;

public class Pacient extends Human{

        public Pet pet;
        public Integer numCard;
        public String adress;

    public Pacient(String name, Integer age, String sex) {
        super(name, age, sex);
    }

    public Pacient(String name, Integer age, String sex, Pet pet, Integer numCard, String adress) {
        super(name, age, sex);
        this.pet = pet;
        this.numCard = numCard;
        this.adress = adress;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Integer getNumCard() {
        return numCard;
    }

    public void setNumCard(Integer numCard) {
        this.numCard = numCard;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
