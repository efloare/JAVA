package rpg.game.Interogate_and_insert;
import rpg.game.Game.Game;
import rpg.game.Model_base.Caracter;
import rpg.game.Viewer.Go_game;
import rpg.game.Viewer.Panel1New_Continue;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Bb on 2/23/2016.
 */
public class InterrogateAndCheckPlayer {


    public static class Player {
        public static int start_level;
        public static String class_caracter;
        public static int difficulty;
        static String New_Old;
    }

    public static int ConsoleReaderInteger() {
        Scanner reader = new Scanner( System.in );
        int num = 0;
        boolean loop = true;
        while (loop) {
            try {
                num = reader.nextInt();
                loop = false;
            } catch (java.util.InputMismatchException e) {
                System.out.println( "Invalid value!" );
                reader.next(); // this consumes the invalid token
            }
        }
        return num;
    }

    public static String ConsoleReaderString() {
        Scanner reader = new Scanner( System.in );
        String line = null;
        boolean loop = true;
        while (loop) {
            try {
                line = reader.nextLine();
                loop = false;
            } catch (java.util.InputMismatchException e) {
                System.out.println( "Invalid value!" );
                reader.next(); // this consumes the invalid token
            }
        }
        return line;
    }

    public static void save_frame(Panel1New_Continue frame){
    }

    public static void interogateAndInsertAtributes(Player player1) {
        Panel1New_Continue Panel1 = new Panel1New_Continue();
        Panel1.run();
    }
    public static void continue_after_insertion(Caracter.Hero seted_player, JFrame used_frame) {
        Go_game new_game = new Go_game();
        used_frame.setContentPane(new_game);
        used_frame.revalidate();
        Game.go_game(seted_player);
    }


}
        //NewPlayer Panel = new NewPlayer();
       // Panel.NewPlayer();/*
           /* if (Panel1.this_player_new_old == 1) {
                System.out.println("Please insert desire start level for Hero: ");
                Panel1.getContentPane().remove(Panel1);
                Panel1.add(new NewPlayer());
                Panel1.getContentPane().invalidate();
                Panel1.getContentPane().validate();
                //break;

            }
            if (Panel1.this_player_new_old == 2) {
                System.out.println("OOOlddd");

                //checklist(player1);
               // break;
            }*/



        //Panel1.add(new JPanel());
        //  frame.getContentPane().invalidate();
        // frame.getContentPane().validate();
        /*
        System.out.println("Please insert desire start level for Hero: ");
        player1.start_level = ConsoleReaderInteger();
        System.out.println("Please insert class start level: Orc?, Elf?, Knight?, Mage?");
        player1.class_caracter = ConsoleReaderString();
        System.out.println("Please insert desire start level of difficulty: ");
        player1.difficulty = ConsoleReaderInteger();
        boolean jj = checkAtributes(player1);
        if (!jj) {
            return (false);
        }
                return (true);
    }

    public static boolean checkAtributes(Player player1) {

        if (player1.start_level < 1){
            System.out.println("Error inserting Player level: level < 1 ? Your level must be at last 1");
            interogateAndInsertAtributes(player1);
        }
        if (player1.class_caracter.compareTo("Orc") == 0 || player1.class_caracter.compareTo("Elf") == 0 || player1.class_caracter.compareTo("Knight") == 0 || player1.class_caracter.compareTo("Mage") == 0) {
            System.out.println("You have selected " + player1.class_caracter + " from level " + player1.start_level);
            return (true);
        }
        else {
            System.out.println("You have failed selecting your character! You typed Orc? Elf? etc ? \n Try again? (Y/N)");
            Scanner s = new Scanner(System.in);
            String choise = s.nextLine();
            if (choise.compareTo("Y") == 0 || choise.compareTo("y") == 0)
                interogateAndInsertAtributes(player1);
            else
                return (false);
        }
            return(false);
        }
    }

*/