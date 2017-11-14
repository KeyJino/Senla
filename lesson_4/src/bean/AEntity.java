package bean;

import utility.IdGenerator;

public abstract class AEntity {

    public int id;

    public AEntity() {
        this.id = IdGenerator.setID();
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    //public String toString(){
   //     return " ";
    //}
}
