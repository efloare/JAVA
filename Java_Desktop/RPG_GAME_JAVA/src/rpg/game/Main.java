package rpg.game;
import rpg.game.Interogate_and_insert.InterrogateAndCheckPlayer;

/**
 * Created by Bb on 2/23/2016.
 */
public class Main {
    public static void main(String[] args) {
        InterrogateAndCheckPlayer.Player player = new InterrogateAndCheckPlayer.Player();
        InterrogateAndCheckPlayer.interogateAndInsertAtributes(player);

 ;
        /*InterrogateAndCheckPlayer.Player player1 = new InterrogateAndCheckPlayer.Player();
        InterrogateAndCheckPlayer.interogateAndInsertAtributes(player1);
        System.out.println("Preparing for game");
        Caracter.NewHero(player1);
        System.out.println("Display prezented minions? \n Expected Yes or No");
        String Answer = InterrogateAndCheckPlayer.ConsoleReaderString();
        if( Answer.compareTo("Yes") == 0 ||  Answer.compareTo("y") == 0 ||  Answer.compareTo("yes") == 0) {
            Vilians.DarkMage.NewVilians(player1);
            Vilians.Devils.NewVilians(player1);
            Vilians.Goblin.NewVilians(player1);
            Vilians.Necromancer.NewVilians(player1);
        }

        Attack.attack(player1);
        //Vilian.enumAllVilians();
        ///  creatingMap(player1);
         //  runGame(player1);
         //  Game.listingVilian();
          // Game.selectVilian(player1);
         //  Game.attack(player1);
        System.out.println("Game over");
        */

    }




}