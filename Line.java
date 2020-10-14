import java.io.*;
import java.util.ArrayList;

public class Line implements Serializable {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();;
    private int countGoaltender = 0;
    private final int max = 6;

    public Line(String name) throws Exception {
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
    public boolean controlPlayer(Player player,Team team){
        boolean isplayer=false;
        for(Player p: team.getPlayers()){
            if(p.getNumber()==player.getNumber()){

                isplayer= true;
            }
        }
        return isplayer;
    }
    public void addPlayer(Player player, Team team) throws Exception{



        if(!(controlPlayer(player, team))){
            System.out.println("This player is not on the team!!!");
        } else{


            if(this.players.size()<=max){
                if(player instanceof Goalkeeper&&countGoaltender>0){
                    System.out.println("The goalkeeper is already there!!!");
                }else if (player instanceof Goalkeeper){
                    this.players.add(player);
                    this.countGoaltender++;
                    this.serialize();
                }else{
                    this.players.add(player);
                    this.serialize();
                }

            }else{
                System.out.println("The line is already full!");
            }
        }
    }

    @Override
    public String toString() {
        return "Line "  + name + ", players: \n" + players ;
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