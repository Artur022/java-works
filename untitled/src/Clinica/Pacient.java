package Clinica;

public class Pacient extends Human{

        public Pet pet;
        public String numCard;
        public String adress;

    public Pacient(String name, Integer age, String sex) {
        super(name, age, sex);
    }

    public Pacient(String name, Integer age, String sex, Pet pet, String numCard, String adress) {
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

    public String getNumCard() {
        return numCard;
    }

    public void setNumCard(String numCard) {
        this.numCard = numCard;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
