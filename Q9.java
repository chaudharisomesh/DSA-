package Learning.DSA_Assignment1;

import java.util.Collections;
import java.util.Stack;

public class Q9 {

    public static void reverse(Stack<Integer> arr){
        arr.sort(Collections.reverseOrder());
        System.out.println("After Reverse");
        System.out.println(arr);

    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        for (int i=0;i<10;i++){
            stack.push(i);
        }
        System.out.println("Before reverse stack "+stack);
reverse(stack);
    }
}
