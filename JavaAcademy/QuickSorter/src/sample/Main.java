package sample;

import com.sun.javafx.css.StringStore;
import com.sun.javafx.runtime.SystemProperties;

public class Main {
    public static void main(String a[]) {


        String[] input = {"z", "c", "saa", "a", "ab", "ab" , "a", "abc", "a", "fabxxxxxxxxxxxxxxxxxxxxxxxxc", "aa"};
       int i = input.length;
       QuickSorter.sorter(input, i);
        }
    }
