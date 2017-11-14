package bean;

public class Reader extends AEntity {

    private String name;

    public Reader(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //@Override
    public String toString() {
        return getId() + " " + name;
    }
}
