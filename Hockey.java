public class Hockey {
    public static void main(String[] args) throws Exception {
        // Men
        Team men = new Team("Metalurg");
        // Team men = new Team("Avangard");

       try {
       Goalkeeper goaltender=new Goalkeeper("Alex", 23);
       Goalkeeper goaltender2=new Goalkeeper("Michail", 16);
       Goalkeeper goaltender3=new Goalkeeper("Danil", 56);

       Forward forvard=new Forward("Pavel", 11);
       Forward forvard2=new Forward("Ivan", 3);
       Forward forvard3=new Forward("Matvej", 19);

       Defender defender=new Defender(SideDefender.L, "Maks", 12);
       Defender defender2=new Defender(SideDefender.L, "Sergej", 33);
       Defender defender3=new Defender(SideDefender.R, "Andrej", 9);
       Defender defender4=new Defender(SideDefender.R, "Oleg", 28);
       Defender defender5=new Defender(SideDefender.R, "Konstantin", 20);

       Wing wing = new Wing(SideWing.L, "Sasha", 4);
       Wing wing2 = new Wing(SideWing.L, "Anatolij", 37);
       Wing wing3 = new Wing(SideWing.R, "Nikita", 7);
       Wing wing4 = new Wing(SideWing.R, "Vladislav", 15);
       Wing wing5 = new Wing(SideWing.L, "Vladimir", 25);
       // Team
       men.addPlayerToPlayers(goaltender);
       men.addPlayerToPlayers(goaltender2);
       men.addPlayerToPlayers(forvard);
       men.addPlayerToPlayers(forvard2);
       men.addPlayerToPlayers(forvard3);

       men.addPlayerToPlayers(defender);
       men.addPlayerToPlayers(defender2);
       men.addPlayerToPlayers(defender3);
       men.addPlayerToPlayers(defender4);
       men.addPlayerToPlayers(defender5);

       men.addPlayerToPlayers(wing);
       men.addPlayerToPlayers(wing2);
       men.addPlayerToPlayers(wing3);
       men.addPlayerToPlayers(wing4);
       men.addPlayerToPlayers(wing5);

       // A
      // men.getLineA().addPlayer(goaltender3, men); // Player not in team!!!

       men.getLineA().addPlayer(goaltender, men);
       men.getLineA().addPlayer(forvard, men);
       men.getLineA().addPlayer(wing5, men);
       men.getLineA().addPlayer(wing, men);
       men.getLineA().addPlayer(defender, men);
       men.getLineA().addPlayer(defender3, men);
       // B
       men.getLineB().addPlayer(goaltender2, men);
      // men.getLineB().addPlayer(goaltender2, men); // second Goalkeeper
       men.getLineB().addPlayer(forvard2, men);
       men.getLineB().addPlayer(wing2, men);
       men.getLineB().addPlayer(wing3, men);
       men.getLineB().addPlayer(defender4, men);
       men.getLineB().addPlayer(defender5, men);
       // C
       men.getLineC().addPlayer(goaltender, men);
        men.getLineC().addPlayer(forvard3, men);
       men.getLineC().addPlayer(wing4, men);
       men.getLineC().addPlayer(wing, men);
       men.getLineC().addPlayer(defender, men);
       men.getLineC().addPlayer(defender4, men);

        } catch (Exception ex) {
            System.out.println("Chyba při zadávání");
            //Logger.getLogger(DatovéStruktury.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println( men.toString());
        //System.out.println( men.getLineB().toString());


        // Woman
        /*
       Team woman = new Team("Romaska");

        try {
       goaltender=new Goalkeeper("Alina", 23);
       goaltender2=new Goalkeeper("Sonja", 16);

       forvard=new Forward("Olga", 11);
       forvard2=new Forward("Anna", 3);


       defender=new Defender(SideDefender.L, "Nastja", 12);
       defender2=new Defender(SideDefender.L, "Maria", 33);
       defender3=new Defender(SideDefender.R, "Ksenija", 9);
       defender4=new Defender(SideDefender.R, "Irina", 28);

       wing = new Wing(SideWing.L, "Sasha", 4);
       wing2 = new Wing(SideWing.L, "Kristina", 37);
       wing3 = new Wing(SideWing.R, "Svetlana", 7);
       wing4 = new Wing(SideWing.R, "Elena", 15);

       // Team
       woman.addPlayerToPlayers(goaltender);
       woman.addPlayerToPlayers(goaltender2);
       woman.addPlayerToPlayers(forvard);
       woman.addPlayerToPlayers(forvard2);

       woman.addPlayerToPlayers(defender);
       woman.addPlayerToPlayers(defender2);
       woman.addPlayerToPlayers(defender3);
       woman.addPlayerToPlayers(defender4);

       woman.addPlayerToPlayers(wing);
       woman.addPlayerToPlayers(wing2);
       woman.addPlayerToPlayers(wing3);
       woman.addPlayerToPlayers(wing4);

       // A

       woman.getLineA().addPlayer(goaltender, woman);
       woman.getLineA().addPlayer(forvard, woman);
       woman.getLineA().addPlayer(wing, woman);
       woman.getLineA().addPlayer(wing3, woman);
       woman.getLineA().addPlayer(defender, woman);
       woman.getLineA().addPlayer(defender3, woman);
       // B

        woman.getLineB().addPlayer(goaltender2, woman);
        woman.getLineB().addPlayer(forvard2,  woman);
        woman.getLineB().addPlayer(wing2,  woman);
        woman.getLineB().addPlayer(wing3,  woman);
        woman.getLineB().addPlayer(defender4,  woman);
        woman.getLineB().addPlayer(defender5,  woman);
       // C

         } catch (Exception ex) {
            System.out.println("Chyba při zadávání");
            //Logger.getLogger(DatovéStruktury.class.getName()).log(Level.SEVERE, null, ex);
        }
       System.out.println( woman.toString());
       //System.out.println(woman.getLineA().toString());
      */

    }

}