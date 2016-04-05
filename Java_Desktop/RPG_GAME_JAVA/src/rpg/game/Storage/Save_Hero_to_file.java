package rpg.game.Storage;
import rpg.game.Messenger;
import rpg.game.Model_base.Caracter;
import rpg.game.Model_base.Caracter.Hero;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class Save_Hero_to_file implements Runnable {

    public static String path = "C:/Users/Bb/Desktop/TRAINING JAVA/Day 2/RPG_GAME/src/rpg/game/Storage/Saved_heroes.ser";
    private static ArrayList<Caracter.Hero> HeroesList = new ArrayList<>();

    synchronized public static void saveHeroToFile(Hero hero) {
        ObjectOutputStream oos_heroes = null;
        try {
            FileOutputStream fout = new FileOutputStream( "C:/Users/Bb/Desktop/TRAINING JAVA/Day 2/RPG_GAME/src/rpg/game/Storage/Saved_heroes.ser" );
            ObjectOutputStream oos = new ObjectOutputStream( fout );
            oos.writeObject( hero );
            //oos.
            oos.close();
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        read_herooo();
        //        readHeroFromFile();
    }

    public static void read_herooo() {
        Read_Hero_from_file.readHeroFromFile();
    }
}
