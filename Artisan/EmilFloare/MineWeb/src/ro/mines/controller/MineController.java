package ro.mines.controller;

import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import org.springframework.web.servlet.view.script.ScriptTemplateConfig;
import ro.mines.model.GameOfMineField;
import ro.mines.model.MineField;
import ro.mines.model.Point;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by Bb on 6/14/2016.
 */
@Controller
public class MineController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody String getIndex(@RequestParam(value = "param", required = false, defaultValue = "") String param) {
//        MineField field = new MineField();
//        Point[] mineLocations = new Point[5];
//        mineLocations = new Point(param.split(";"));
        GameOfMineField game = new GameOfMineField();
        Point[] mineLocations = getMineLocation(param);
        MineField field = game.getMineField(mineLocations);
        return field.toString();
    }

    private Point[] getMineLocation(String param) {
        String[] paramOfpoint = param.split(";");
        int i = 1;
        int p1 = 0;
        int p2 = 0;
        ArrayList <Point> mineLocations = null;
        while(i < paramOfpoint.length){
            String [] points = paramOfpoint[i].split(",");
            p1 = Integer.valueOf(points[1]);
            System.out.println("\n\n\n\n" + p1 + " =pq\t" + p2 + " =p2\n");
            p2 = Integer.valueOf(points[2]);
            mineLocations.add(i, new Point(p1, p2));
        }
        Point [] mines = null;
        i = 0;
//        mineLocations.subList(0, paramOfpoint.length);

        try{
            while(i < paramOfpoint.length){
                if (mineLocations != null) {

                    mines[i] = mineLocations.get(i);
                }
                i++;
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return  mines;
//        mineLocations[0] = new Point(0,0);
//        mineLocations[1] = new Point(1,0);
//        mineLocations[2] = new Point(2,0);
//        mineLocations[3] = new Point(3,0);
//        mineLocations[4] = new Point(4,0);

    }
}