package sample;

public class Main {
    public static void main(String a[]) {


        String[] input = {"1", "2", "33", "11", "13", "0" , "5", "143", "12", "12222", "-11"};
        int size = input.length;
        int j = 0;
        while (j < size) {
            System.out.print(input[j]);
            System.out.print(" ");
            j++;
        }
        IntSorter.sorter(input, size);
    }
}
