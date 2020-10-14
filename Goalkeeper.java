public class Goalkeeper extends Player {
    private String g="Goalkeeper";

    public Goalkeeper(String name, int number) {
        super(name, number);
    }

    @Override
    public String toString() {
        return " \n Player "+ " number=" + number + " : " + name  + " - "  + g ;
    }




}