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
	public static void main(String[] args) {
		Binarytree root=new Binarytree(1);
		Binarytree left=new Binarytree(2);
		Binarytree right=new Binarytree(3);
		root.right=right;
		root.left=left;
	}
}
