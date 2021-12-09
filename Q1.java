package Learning.DSA_Assignment1;

public class Q1 {

    static void array(int arr[],int inputNumber){
        System.out.println("element of pair and their sum :");

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]+arr[j]==inputNumber){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+inputNumber);
                }


            }        }
    }

    public static void main(String[] args) {
       array(new int[]{2, 7, 4, -5, 11, 5, 20}, 15);
    array(new int[]{14, -15, 9, 16, 25, 45, 12, 8}, 30);
    array(new int[]{12,22,33,4,5,6,-9},10);
    }
}
