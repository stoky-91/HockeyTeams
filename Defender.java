enum SideDefender {L, R};
public class Defender extends Player {
    SideDefender side;

    public Defender(SideDefender side, String name, int number) {
        super(name, number);
        this.side = side;
    }

    @Override
    public String toString() {
        return " \n Player "+ " number=" + number + " : " + name  + " - " + "Defender "  + side;
    }


}
