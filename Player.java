import java.io.Serializable;

public class Player implements Serializable {
    protected String name;
    protected int number;
    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return " \n Player "+ " number=" + number + " : " + name ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}