package Learning.DSA_Assignment1;

public class Q4 {

    public static void main(String[] args) {
        String s1="soiips";

        System.out.println("Given String "+s1);

        for (int i=0;i<s1.length();i++){
            boolean b=true;

            for (int j=0;j<s1.length();j++){

                if (i!=j&& s1.charAt(i)==s1.charAt(j)){
                    b=false;
                    break;
                }
            }
            if (b){
                System.out.println("The first non repeated in string :::::  "+s1.charAt(i));
            break;
            }
        }
    }
}
