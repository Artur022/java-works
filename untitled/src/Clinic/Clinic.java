package Clinic;

import java.util.HashMap;

public class Clinic {

    public Integer size;
    public String name;

    public HashMap<Integer, Pacient> getJurnalPacients() {
        return jurnalPacients;
    }



    private HashMap<Integer,Pacient> jurnalPacients = new HashMap<Integer, Pacient>();

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

}
