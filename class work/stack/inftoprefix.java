import java.util.Stack;
import java.util.*;
public class inftoprefix {
 
    public static void main(String args[]){
        String infix = "((a+b)*(z+x))";
        System.out.println("Prefix : " + printPreFix(infix));
 
    }
 
    public static String printPreFix(String str){
        Stack stack = new Stack();
        String prefix = "";
        for(int i=str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                prefix = ((Character)c).toString() + prefix;
            }
            else if(c == '('){
                prefix = ((Character)stack.pop()).toString() + prefix;
            }
            else if(c == ')'){
                continue;
            }
            else{
                stack.push(c);
            }
        }
        return prefix;
 
    }
}