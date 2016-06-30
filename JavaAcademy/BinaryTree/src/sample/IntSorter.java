package sample;

public class IntSorter {
    static void sorter(String[] input, int size) {

        int k = 0;
        int i = 0;
        String swap;
        while (i < size) {
            k = 0;
            while (k < size) {
                int nbr = Integer.parseInt(input[k]);
                int nbr2 = Integer.parseInt(input[k + 1]);
                if (nbr2 < nbr) {
                    BinaryTree.addNode(nbr, nbr2);
                }
                else
                    BinaryTree.addNode(nbr2, nbr);
                k = k + 2;
            }
            i++;
        }
        int j = 0;
        while (j < size) {
            System.out.print(input[j]);
            System.out.print(" ");
            j++;
        }
    }
}
