//package rpg.game.Storage;
//
//import rpg.game.Interogate_and_insert.InterrogateAndCheckPlayer;
//import rpg.game.Model_base.Caracter;
//
//import java.io.*;
//import java.util.ArrayList;
//
//public class Test {
//    public static String path = "C:/Users/Bb/Desktop/TRAINING JAVA/Day 2/RPG_GAME/src/rpg/game/Storage/Saved_heroes.ser";
//    public static class Hero implements Serializable {
//        public   static String name = "Hero name";
//        public static int start_level = 1;
//        public static int difficulty = 1;
////        public static int number_of_slot_inventory = Caracter.Hero.start_level * Caracter.Hero.difficulty;
////        public   static int id = Caracter.Hero.class.hashCode();
////        public    static int level = Caracter.Hero.start_level;
//        public static String class_caracter = InterrogateAndCheckPlayer.Player.class_caracter;
//        public   static String main_weapon;
//        public     static String [] inventory;
//        public    static int bonus_attack_from_artifact = 0;
//        public    static int bonus_defense_from_artifact = 0;
//        public      static int bonus_armor_from_artifact = 0;
//        public       static int bonus_hp_from_artifact = 0;
//        public      static int armor_level = 1 + bonus_armor_from_artifact;
//        public      static int hp =+ 1 + bonus_hp_from_artifact;
//        public     static int attack =+ 1 + bonus_attack_from_artifact;
//        public     static int defense =+ 1 + bonus_defense_from_artifact;
//        public      static int helm_level = 1;
//
//        @Override
//        public String toString() {
//            return "Customer{" + "name=" + name + '}';
//        }
//    }
//
//    private ArrayList<Caracter.Hero> customerList = new ArrayList<>();
//
//    public void writeCustomers(String path) {
//        ObjectOutputStream oos_Customer = null;
//        try {
//            oos_Customer = new ObjectOutputStream( new FileOutputStream( path ) );
//            oos_Customer.writeObject( customerList );
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            if (oos_Customer != null) { // old-style safe closing when done
//                try {
//                    oos_Customer.close();
//                } catch (IOException e) {
//                }
//            }
//        }
//    }
//
//    public void readCustomers(String path) {
//        try (ObjectInputStream ois_Customer = new ObjectInputStream( new FileInputStream( path ) )) { // new-style safe closing when done
//
//            customerList = (ArrayList<Caracter.Hero>) ois_Customer.readObject();
//
//        } catch (ClassNotFoundException | IOException | ClassCastException e) {
//            e.printStackTrace();
//        }
//    }
//}
