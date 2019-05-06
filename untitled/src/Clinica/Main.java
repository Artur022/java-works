package Clinica;

public class Main {

    public static void main(String[] args) {

        String nameClinic = "Клиника Лермант";
        Integer sizeClinic = 20;
        String findPacientByName = "Артем";
        String findPacientByNumCard = "1235123";

        System.out.println("Создается клиника - '" + nameClinic + "' ёё размерность - " + sizeClinic + " пациентов!");
        Clinic myClinica = new Clinic(nameClinic, sizeClinic);


        myClinica.addPacient(new Clinica.Pacient("Артем",21,"М",new Clinica.Dog("Lermant",19,"Ж", TypeAnimal.DOG),"1235123","Крутой дом"));
        myClinica.addPacient(new Clinica.Pacient("Максим",22,"М",new Clinica.Dog("Losos'",20,"Ж", TypeAnimal.DOG),"6666666","Крутой дом v2"));

        System.out.println("В клинику добавились пациенты: ");

        for (Pacient pacient:myClinica.getJurnalPacients().values()) {
            myClinica.swhAllInfPacient(pacient);
        }

        System.out.println("Производится поиск всех клиентов с номером карты " + findPacientByNumCard + "!");
        System.out.println("...Поиск...");
        Integer sizeFindList = myClinica.findPacient(findPacientByNumCard).size();
        System.out.println("Найдено " + sizeClinic + " клиентов: ");

        /*for (int i=0;i<=sizeFindList;i++) {
            Pacient pacientFinders = myClinica.findPacient(findPacientByNumCard).get(i);
            myClinica.swhAllInfPacient(pacientFinders);
        }
        */




    }

}


