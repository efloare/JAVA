package rpg.game.Model_base;

import rpg.game.Interogate_and_insert.InterrogateAndCheckPlayer;

import java.io.*;
import java.util.HashMap;
/* Sigleton FACTORY
// Factory == contructor for all;
private  Factory instance{
private Factory(){

}
}
public  Factry getFactory()
if (instance == null)
instance = new Factory;
return (instance);
else
retunr (instance);
}
/* Enum the hero*/
/**
 * Created by Bb on 2/24/2016.
 */
public  class Caracter implements Serializable {
    public  String path = "C:/Users/Bb/Desktop/TRAINING JAVA/Day 2/RPG_GAME/src/rpg/game/Storage/Saved_heroes.ser";
    public static class Hero implements Serializable {
        public  String name = "Hero name";
        public  int start_level = 1;
        public  int difficulty = 1;
        public  int number_of_slot_inventory;
        public  int id = Caracter.Hero.class.hashCode();
        public  int level = 1;
        public  String class_caracter = InterrogateAndCheckPlayer.Player.class_caracter;
        public  String main_weapon;
        public  String[] inventory;
        public  int bonus_attack_from_artifact = 0;
        public  int bonus_defense_from_artifact = 0;
        public  int bonus_armor_from_artifact = 0;
        public  int bonus_hp_from_artifact = 0;
        public  int armor_level = 1 + bonus_armor_from_artifact;
        public  int hp = +1 + bonus_hp_from_artifact;
        public  int attack = +1 + bonus_attack_from_artifact;
        public  int defense = +1 + bonus_defense_from_artifact;
        public  int helm_level = 1;

        public static void setdifficulty(int value, Hero newcaracter) {
            newcaracter.difficulty = value;
        }

        public static void get_name(String text, Hero newcaracter) {
            newcaracter.name = text;
        }

        public static void set_class(String s, Hero newcaracter) {
            newcaracter.class_caracter = s;
        }

        public static void name_add(String text, Hero newcaracter) {
            newcaracter.name = text;
        }
    }

    public static void NewHero(Caracter.Hero player1) {
            if (player1.class_caracter.compareTo( "Orc" ) == 0 ){
                player1.armor_level = player1.start_level;
                player1.helm_level = player1.start_level;
                player1.attack = 100 * player1.start_level;
                player1.defense = 100 * player1.start_level;
                player1.hp = 100 * player1.start_level;
                player1.main_weapon = "Axe";
                System.out.println("Orc selected");
            }
            if (player1.class_caracter.compareTo( "Elf" ) == 0) {
                player1.armor_level = player1.start_level;
                player1.helm_level = player1.start_level;
                player1.attack = 180 * player1.start_level;
                player1.defense = 80 * player1.start_level;
                player1.hp = 80 * player1.start_level;
                player1.main_weapon = "Bow";
                System.out.println("Elf selected");
            }
            if (player1.class_caracter.compareTo( "Mage" ) == 0) {
                player1.armor_level = player1.start_level;
                player1.helm_level = player1.start_level;
                player1.attack = 200 * player1.start_level;
                player1.defense = 60 * player1.start_level;
                player1.hp = 60 * player1.start_level;
                player1.main_weapon = "Staff";
                System.out.println("Mage selected");
            }
            if (player1.class_caracter.compareTo( "Knight" ) == 0) {
                player1.armor_level = player1.start_level;
                player1.helm_level = player1.start_level;
                player1.attack = 130 * player1.start_level;
                player1.defense = 120 * player1.start_level;
                player1.hp = 120 * player1.start_level;
                player1.main_weapon = "Sword";
                System.out.println("selected Knight");
            }
        }

        public void saveHeroToFile() {
            try {
                FileOutputStream fout = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fout);
                oos.writeObject(this);
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public  Hero readHeroFromFile() {
            Hero hero = null;
            try {
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                hero = (Hero) ois.readObject();
                ois.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return (hero);
        }
    }

//    public  class CreateCaracterMap{
//    public  void createCaracterMap() {
//            HashMap<Caracter, Class> caracterMap = new HashMap<Caracter, Class>();
//        }
//        //Map.Entry StockVilian = new Key; StockVilian;
//        // Map StockCaracter;
//    }
//}
