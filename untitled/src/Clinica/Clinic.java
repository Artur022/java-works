package Clinica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Clinic {

    public Integer size;
    public String name;

    public HashMap<Integer, Pacient> getJurnalPacients() {
        return jurnalPacients;
    }

    private HashMap<Integer,Pacient> jurnalPacients = new HashMap<Integer, Pacient>();

    public Clinic(String name,Integer size) {
        this.size = size;
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addPacient(Pacient pacient) {
        if (this.jurnalPacients.size()<this.size) {
            this.jurnalPacients.put(this.jurnalPacients.size() + 1, pacient);
        } else {
            System.out.println("Error size");
        }
    }

    public void delPacient(Integer id, Choose choose) throws Exception {
        if (this.jurnalPacients.size()>0) {
            switch (choose) {
                case PACIENT:
                    this.jurnalPacients.remove(id);
                    break;
                case PET:
                    this.jurnalPacients.get(id).setPet(null);
                    break;
                default:
                    throw new Exception("Error choose" + choose);
            }
        }
    }

    public void editPacient(Integer id,Pacient pacient) {
        if (this.jurnalPacients.size()>0) {
            if (this.jurnalPacients.containsKey(id)) {
                this.jurnalPacients.replace(id,pacient);
            }
        }
    }

    public void editPet(Integer id,Pet pet) {
        if (this.jurnalPacients.size()>0) {
            if (this.jurnalPacients.containsKey(id)) {
                this.jurnalPacients.get(id).setPet(pet);
            }
        }
    }

    public HashMap<Integer,Pacient> findPacient(String numCard) {
        HashMap<Integer,Pacient>  listPacients = new HashMap<>();
        int i = 0;
        for (Pacient pac:this.jurnalPacients.values()) {
            if (pac.getNumCard() == numCard) {
                listPacients.put(i,pac);
            }
            i++;
        }
        return listPacients;
    }

    public List<Pet> findPet(String name) {
        List<Pet> listPet = new ArrayList<Pet>();
        for (Pacient pacient:this.jurnalPacients.values()){
            if (pacient.getPet().name == name) {
                listPet.add(pacient.getPet());
            }
        }
        return listPet;
    }

    public void shwNamePacient(Pacient pacient) {
        System.out.println("Имя : " + pacient.getName());
    }

    public void shwAgePacient(Pacient pacient) {
        System.out.println("Возраст : " + pacient.getAge());
    }

    public void shwSexPacient(Pacient pacient) {
        System.out.println("Пол : " + pacient.getSex());
    }

    public void shwAdressPacient(Pacient pacient) {
        System.out.println("Адресс : " + pacient.getAdress());
    }

    public void shwNumCardPacient(Pacient pacient) {
        System.out.println("Номер карты : " + pacient.getNumCard());
    }

    public void shwNamePet(Pet pet) {
        System.out.println("    Имя Питомца: " + pet.name);
    }

    public void shwAgePet(Pet pet) {
        System.out.println("    Возраст Питомца: " + pet.age);
    }

    public void shwSexPet(Pet pet) {
        System.out.println("    Пол Питомца: " + pet.sex);
    }

    public void shwTypePet(Pet pet) {
        System.out.println("    Порода Питомца: " + pet.type);
    }

    public void shwPetPacient(Pacient pacient) {
        shwNamePet(pacient.getPet());
        shwAgePet(pacient.getPet());
        shwSexPet(pacient.getPet());
        shwTypePet(pacient.getPet());
    }

    public void swhAllInfPacient(Pacient pacient) {
        System.out.println("------------");
        shwNumCardPacient(pacient);
        shwNamePacient(pacient);
        shwAgePacient(pacient);
        shwSexPacient(pacient);
        shwPetPacient(pacient);
        shwAdressPacient(pacient);
        System.out.println("------------");

    }





}
