import java.io.*;
import java.util.ArrayList;

public class Team implements Serializable{
    private String name;
    private ArrayList<Player> players=new ArrayList<>();
    private int countGoaltender = 0;
    private final int max = 22;
    private final int maxGoaltender = 2;

    private Line lineA=new Line("A");
    private Line lineB=new Line("B");
    private Line lineC=new Line("C");

    public Team(String name) throws Exception{
        this.name = name;
        this.deSerialize();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }


    public Line getLineA() {
        return lineA;
    }

    public void setLineA(Line lineA) {
        this.lineA = lineA;
    }

    public Line getLineB() {
        return lineB;
    }

    public void setLineB(Line lineB) {
        this.lineB = lineB;
    }

    public Line getLineC() {
        return lineC;
    }

    public void setLineC(Line lineC) {
        this.lineC = lineC;
    }

    public void addPlayerToPlayers(Player player) throws Exception{
        if(this.players.size()<max){
            if(player instanceof Goalkeeper&&countGoaltender>=maxGoaltender){
                System.out.println("The goalkeepers is already there!!!");
            }else if (player instanceof Goalkeeper){
                this.players.add(player);
                this.countGoaltender++;
                this.serialize();
            }else{
                this.players.add(player);
                this.serialize();
            }

        }else{
            System.out.println("The team is already full!!!");
        }

    }

    @Override
    public String toString() {
        return "Team " + name + "\n players: " + players + "\n " + lineA + "\n " + lineB + "\n " + lineC ;
    }

    public void serialize() throws Exception {
        // try {
        // Serializace do souboru
        ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("hockey.dat"));

        Object object = this.players;
        // jméno souboru
        out.writeObject(object);
        out.close();
        /* } catch (IOException e) {
            throw new Exception("Chyba při zápisu souboru : " + e);
        }*/

    }
    public void deSerialize() throws Exception {
        try {
            File file = new File("hockey.dat");
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(file));
            // Deserializace objektu
            this.players = (ArrayList<Player>) in.readObject();

        }
        catch (FileNotFoundException e) {
            //throw new Exception("Chyba při zápisu souboru : " + e);

        }
        catch (IOException e) {
            //throw new Exception("Chyba při zápisu souboru : " + e);

        }
    }




}
