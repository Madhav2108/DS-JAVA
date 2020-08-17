import java.util.*;
import java.util.Stack;
public class potoprefix {

    static boolean isOperator(char x){
        switch (x){
            case '-':
            case '+':
            case '/':
            case '*':
            case '^':
                return true;
        }
        return false;
    }

    public static String convert(String expression){

        Stack<String> stk = new Stack<>();
        for (int i = 0; i <expression.length() ; i++) {

            char c = expression.charAt(i);

            if(isOperator(c)){
                String s1 = stk.pop();
                String s2 = stk.pop();
                String temp = c + s2 + s1;
                stk.push(temp);
            }else{
                stk.push(c+"");
            }
        }
        String result = stk.pop();
        return result;
    }

    public static void main(String[] args) {
        String postfix = "ABC/-AK/L-*";
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Prefix Expression: " + convert(postfix));
    }
}