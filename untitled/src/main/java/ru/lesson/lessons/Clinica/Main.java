package ru.lesson.lessons.Clinica;


import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String nameClinic = "Клиника Лермант";
        Integer sizeClinic = 20;
        String findPacientByName = "Артем";
        Integer findPacientByNumCard = 1235123;

        System.out.println("Создается клиника - '" + nameClinic + "' ёё размерность - " + sizeClinic + " пациентов!");

        Clinic myClinica = new Clinic(nameClinic, sizeClinic);
        try {
            myClinica.setSize(0);
        } catch (UserException e) {
            System.out.println(e.getMessage());
            System.out.println("Введите корректную вместимость!");
        }


        myClinica.addPacient(new Pacient("Артем",21,"М",new Dog("Lermant",19,"Ж", TypeAnimal.DOG),1235123,"Крутой дом"));
        myClinica.addPacient(new Pacient("Максим",22,"М",new Dog("Losos'",20,"Ж", TypeAnimal.DOG),6666666,"Крутой дом v2"));

        System.out.println("В клинику добавились пациенты: ");

        for (Pacient pacient:myClinica.getJurnalPacients().values()) {
            myClinica.swhAllInfPacient(pacient);
        }

        System.out.println("Производится поиск всех клиентов с номером карты " + findPacientByNumCard + "!");
        System.out.println("...Поиск...");
        HashMap<Integer,Pacient> sizeFindList = myClinica.findPacient(findPacientByNumCard);
        System.out.println("Найдено " + sizeFindList.size() + " клиент(ов): ");
        Pacient pacientFinders = null;
        for (int i=0;i<sizeFindList.size();i++) {
            pacientFinders = sizeFindList.get(i);
            myClinica.swhAllInfPacient(pacientFinders);
        }

        System.out.println("Удалим найденного клиента с numcard = " + findPacientByNumCard);
        






    }

}


