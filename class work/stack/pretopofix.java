import java.util.Stack;
import java.util.*;
public class pretopofix {

    boolean isOperator(char x){
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
    
    public String convert(String expression){

        Stack<String> stk = new Stack<String>();
        for (int i = expression.length()-1; i >=0 ; i--) {

            char c = expression.charAt(i);

            if(isOperator(c)){
                String s1 = stk.pop();
                String s2 = stk.pop();
                String temp = s1 + s2 + c;
                stk.push(temp);
            }else{
                stk.push(c+"");
            }
        }

        String result = stk.pop();
        return result;
    }

    public static void main(String[] args) {
        String prefix = "*-A/BC-/AKL";
        System.out.println("Prefix Expression: " + prefix);
        System.out.println("Postfix Expression: " + new pretopofix().convert(prefix));
    }
}