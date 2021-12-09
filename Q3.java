package Learning.DSA_Assignment1;

import java.util.IllegalFormatCodePointException;

public class Q3 {

    public static boolean checkRotation(String s1,String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        String s3=s1+s1;
        if (s3.contains(s2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s1="RunOrun";
        String s2="RunOrun";

        System.out.println("::::::::Checking if a String is rotation of another::::::::::::");
        if (checkRotation(s1,s2)) {
            System.out.println("Yes Rotation " + s2 + "   is rotation of " + s1);
        }
        else {
            System.out.println("No  Rotation : "+s2+"   is not rotation of "+s1);
        }
        }
    }

