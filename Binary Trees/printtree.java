import java.util.*;
public class Main
{
    public static class Binarytree{
        int data;
        Binarytree left;
        Binarytree right;
        Binarytree(int data)
        {
            this.data=data;
        }
    }
    public static void printree(Binarytree root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        printree(root.left);
        printree(root.right);
    }
	public static void main(String[] args) {
		Binarytree root=new Binarytree(1);
		Binarytree left=new Binarytree(2);
		Binarytree right=new Binarytree(3);
		root.right=right;
		root.left=left;
		Binarytree right1=new Binarytree(4);
		Binarytree left1=new Binarytree(5);
		left.right=right1;
		right.left=left1;
		printree(root);
	}
}