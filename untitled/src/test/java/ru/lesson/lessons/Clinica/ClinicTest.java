package ru.lesson.lessons.Clinica;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicTest {

    @Test
    public void addPacient() {
        Clinic clinic = new Clinic("Lermant",20);
        clinic.addPacient(new Pacient("Артем",21,"М",new Dog("Lermant",19,"Ж", TypeAnimal.DOG),1235123,"Крутой дом"));
        Assert.assertEquals((Integer) 1,clinic.getCountPacients());
    }


    @Test
    public void delPacient() throws Exception {

        Clinic clinic = new Clinic("Lermant",20);
        clinic.addPacient(new Pacient("Артем",21,"М",new Dog("Lermant",19,"Ж", TypeAnimal.DOG),1235123,"Крутой дом"));
        clinic.delPacient(1235123,Choose.PACIENT);
        Assert.assertEquals((Integer) 0,clinic.getCountPacients());
    }

    @Test(expected = UserException.class)
    public void setSize() throws UserException {
        Clinic clinic = new Clinic("Lermant",20);
        clinic.setSize(0);
    }
}