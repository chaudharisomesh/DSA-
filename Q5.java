package Learning.DSA_Assignment1;

public class Q5 {

    static void tower(int no,char from_rod,char to_rod,char aux_rod){

        if (no==1){
            System.out.println("move disk 1 from rod"+from_rod+ " to rod "+to_rod);
            return;
        }
        tower(no-1,from_rod,aux_rod,to_rod);
        System.out.println("Move disk "+no+ "from rod "+from_rod+ " to rod "+to_rod);
        tower(no-1,aux_rod,to_rod,from_rod);
    }

    public static void main(String[] args) {

        int no=2;
        tower(no, 'A', 'C', 'B');
    }
}
