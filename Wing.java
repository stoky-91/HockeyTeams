enum SideWing {L, R};
public class Wing extends Player{
    SideWing side;

    @Override
    public String toString() {
        return " \n Player "+ " number=" + number + " : " + name  + " - " + "Wing "  + side;
    }


    public Wing(SideWing side, String name, int number) {
        super(name, number);
        this.side = side;
    }

}