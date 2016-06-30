package rpg.game.Storage;

import rpg.game.Interogate_and_insert.InterrogateAndCheckPlayer;
import rpg.game.Model_base.Caracter;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Read_Hero_from_file implements Runnable {
    public static String path = "C:/Users/Bb/Desktop/TRAINING JAVA/Day 2/RPG_GAME/src/rpg/game/Storage/Saved_heroes.ser";

    synchronized public static Caracter.Hero readHeroFromFile() {
        Object hero = null;
        /*while ((hero  != null) {
            try {
                FileInputStream fis = new FileInputStream( path );
                ObjectInputStream ois = new ObjectInputStream( fis );
                hero = ois.readObject();
                Hero newhero = (Hero) hero;
                System.out.print( newhero.main_weapon );
                ois.close();
            } catch (Exception e) {
                System.out.print( e.getMessage() );
                e.printStackTrace();
            }
        }*/
        try {
            ObjectInputStream objIn = new ObjectInputStream( new FileInputStream( path ) );
            Object object = objIn.readObject();
            Caracter.Hero newhero = (Caracter.Hero) object;
            System.out.println( "TRY" );
            if (newhero != null) {
                System.out.println( newhero.name );
                System.out.println( newhero.start_level );
                System.out.println( newhero.difficulty );
                System.out.println( newhero.number_of_slot_inventory );
                System.out.println( newhero.id );
                System.out.println( newhero.level );
                System.out.println( newhero.class_caracter );
                System.out.println( newhero.main_weapon );
                System.out.println( newhero.inventory );
                System.out.println( newhero.bonus_attack_from_artifact );
                System.out.println( newhero.bonus_defense_from_artifact );
                System.out.println( newhero.bonus_armor_from_artifact );
                System.out.println( newhero.bonus_hp_from_artifact );
                System.out.println( newhero.armor_level );
                System.out.println( newhero.hp );
                System.out.println( newhero.attack );
                System.out.println( newhero.defense );
                System.out.println( newhero.helm_level );
            }
            objIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

//       String [] ss = Messenger.enumStatus(hero);
//       int i = 0;
//       while(i < 13){
//           System.out.println(ss[i]);
//           i++;
//
//       }
//       System.out.print(ss[1]);

        return new Caracter.Hero();
    }
    public static class EndOfStreamSignal implements Serializable {
        public static ArrayList<Caracter.Hero> heroes = null;
        public static ArrayList<Caracter.Hero> try_to_add_hero_to_list() {
            FileInputStream fis = null;
            try {
                fis = new FileInputStream( path );
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream( fis );
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            while (true) {
                try {
                    Caracter.Hero hero = (Caracter.Hero) ois.readObject();
                    heroes.add( hero );
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                return (heroes);
            }

        }
    }

    public static Caracter. Hero readHeroes(){
        Caracter. Hero hero = null;
        int i = 0;
    try {
        FileInputStream fis = new FileInputStream( path );
        ObjectInputStream ois = new ObjectInputStream(fis);
        hero = (Caracter. Hero) ois.readObject();
//        Collections.EMPTY_LIST.add( i, hero );
        if (hero != null){
            {
                Caracter.Hero newhero = hero;
                System.out.println( newhero.name );
                System.out.println( newhero.start_level );
                System.out.println( newhero.difficulty );
                System.out.println( newhero.number_of_slot_inventory );
                System.out.println( newhero.id );
                System.out.println( newhero.level );
                System.out.println( newhero.class_caracter );
                System.out.println( newhero.main_weapon );
                System.out.println( newhero.inventory );
                System.out.println( newhero.bonus_attack_from_artifact );
                System.out.println( newhero.bonus_defense_from_artifact );
                System.out.println( newhero.bonus_armor_from_artifact );
                System.out.println( newhero.bonus_hp_from_artifact );
                System.out.println( newhero.armor_level );
                System.out.println( newhero.hp );
                System.out.println( newhero.attack );
                System.out.println( newhero.defense );
                System.out.println( newhero.helm_level );
                System.out.println( i );
                i++;
            }
        }
        i++;
        ois.close();
    }

    catch (Exception e) {
        e.printStackTrace();
    }
//        Collections.EMPTY_LIST.add( i, hero );

        return(hero);
    }
}