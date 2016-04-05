package rpg.game;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

import rpg.game.Model_base.Caracter;


/**
 * Created by Bb on 2/24/2016.
 */
public class Messenger {
    public static String [] SStatus = new String[12];
    public static String [] enumStatus(Caracter.Hero caracter) {
        SStatus[0] = ("-----------------" +  caracter.class_caracter.toString() + "  " + caracter.name.toString() +"--------------\n\n");
        SStatus[1] = "" + caracter.hp + " HP" + " < --- "+  caracter.bonus_hp_from_artifact + " bonus HP from artifact\n";
        SStatus[2] = "------------------------------------------------------------------\n";
       SStatus[3] = "" + caracter.armor_level + " Armor  < --- "+  caracter.bonus_armor_from_artifact + " bonus armor from artifact\n";
        SStatus[4] = "-------------------------------------------------------------------\n";
        SStatus[5] = "" + caracter.helm_level + " bonus from Helm\n";
        SStatus[6] = "--------------------------------------------------------------------\n";
        SStatus[7] = "" + caracter.attack + " attack" + " < --- "+ caracter.bonus_attack_from_artifact + " bonus attack from artifact\n";
        SStatus[8] = "----------------------------------------------------------------------\n";
        SStatus[9] = "" + caracter.defense + " Defense" + " < --- "+ caracter.bonus_defense_from_artifact + " bonus defence from artifact\n";
        SStatus[10] = "------------------------------------------------------------\n";
        SStatus[11] = "Main weapon " + caracter.main_weapon + "\n";
        return (SStatus);

    }


    public class list_of_status{
        protected List <String> list = Arrays.asList(SStatus);

        public List<String> getList(){

            return (list);
        }
    }
    //public List <String> list = Arrays.asList(SStatus){
    //    return(SStatus);
    //}
    /* Generic tipe*/
    //public class GenericTipe <L>{
    //    public List <String> list = Arrays.asList(SStatus);
    //      public L getList(){
    //        return ();
    //    }
    //}
    /* public class GeneritcTipe <T> {
        private T list;

        public T getList(){
            Random r= new Random(  );
            if(r.nextInt()#2 == 0)

        }
    }
   /* public static void enumStatus(Vilians.Vilian caracter) {
        System.out.println("---------------------" +"\t" +  caracter.vilian_name.toUpperCase() +"\t" +  "-------------------");
        System.out.println("" + caracter.hp + " HP");
        System.out.println("--------------------------------------------------------");
        System.out.println("" + caracter.attack + " attack");
        System.out.println("--------------------------------------------------------");
        System.out.println("" + caracter.defense + " Defense" );
        System.out.println("--------------------------------------------------------");
        System.out.println("" + caracter.dropped_weapon + " Drooped artifact");
        System.out.println("--------------------------------------------------------");
        System.out.println("" + caracter.dropped_XP + " Drooped XP");
    }

  /*  public static void enumStatus(Caracter.HeroTipe.HeroElf caracter) {
        System.out.println("----------" + caracter.class_tip + "--------");
        System.out.println("" + caracter.hp + " HP" + "\t"+ "\t" + caracter.bonus_hp_from_artifact + " bonus HP from artifact");
        System.out.println("" + caracter.armor_level + " Armor"+ "\t" + "\t" + caracter.bonus_armor_from_artifact + " bonus armor from artifact");
        System.out.println("" + caracter.helm_level + "\t"+ " bonus from Helm");
        System.out.println("" + caracter.attack + " attack" + "\t"+ "\t" + caracter.bonus_attack_from_artifact + " bonus attack from artifact");
        System.out.println("" + caracter.defense + " Defense"+ "\t" + "\t" + caracter.bonus_defense_from_artifact + " bonus defence from artifact");
    }
    public static void enumStatus(Caracter.HeroTipe.HeroMage caracter) {
        System.out.println("----------" + caracter.class_tip + "--------");
        System.out.println("" + caracter.hp + " HP" + "\t"+ "\t" + caracter.bonus_hp_from_artifact + " bonus HP from artifact");
        System.out.println("" + caracter.armor_level + " Armor" + "\t"+ "\t" + caracter.bonus_armor_from_artifact + " bonus armor from artifact");
        System.out.println("" + caracter.helm_level + " bonus from Helm");
        System.out.println("" + caracter.attack + " attack"+ "\t" + "\t" + caracter.bonus_attack_from_artifact + " bonus attack from artifact");
        System.out.println("" + caracter.defense + " Defense" + "\t"+ "\t" + caracter.bonus_defense_from_artifact + " bonus defence from artifact");
    }
    public static void enumStatus(Caracter.HeroTipe.HeroKnight caracter) {
        System.out.println("----------" + caracter.class_tip + "--------");
        System.out.println("" + caracter.hp + " HP" + "\t"+ "\t" + caracter.bonus_hp_from_artifact + " bonus HP from artifact");
        System.out.println("" + caracter.armor_level + " Armor" + "\t"+ "\t" + caracter.bonus_armor_from_artifact + " bonus armor from artifact");
        System.out.println("" + caracter.helm_level + " bonus from Helm");
        System.out.println("" + caracter.attack + " attack" + "\t"+ "\t" + caracter.bonus_attack_from_artifact + " bonus attack from artifact");
        System.out.println("" + caracter.defense + " Defense" + "\t"+ "\t" + caracter.bonus_defense_from_artifact + " bonus defence from artifact");
    }
    public static void listVilian(Caracter.CreateCaracterMap CarcatersMaps){
        Caracter.CreateCaracterMap.createCaracterMap();
    }*/
}