package _14_sort.thuc_hanh;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void bubbleSort(int[] lits){
        boolean needNextPass =true;
        for (int i = 1; i <lits.length&& needNextPass ; i++) {
            needNextPass =false;
            for (int j = 0; j <lits.length-i ; j++) {
                if (lits[j]>lits[j+1]){
                    int temp = lits[j];
                    lits[j]=lits[j+1];
                    lits[j+1]=temp;
                    needNextPass= true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i]+ " ");
        }
    }
}
