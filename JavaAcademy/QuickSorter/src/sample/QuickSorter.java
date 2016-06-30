package sample;

public class QuickSorter{
    static void sorter(String[]input,int size){

        int k = 0;
        int i = 0;
        int result = 0;
        String swap;
        while(i < size)
        {
            k = 0;
            while(k < size)
            {
                result = input[k].compareTo(input[i]);
                if(result > 0)
                {
                    swap = input[k];
                    input[k] = input[i];
                    input[i] = swap;
                }
                k++;
            }
            i++;
        }
        int j=0;
        while(j<size){
            System.out.print(input[j]);
            System.out.print(" ");
            j++;
        }
    }
}
