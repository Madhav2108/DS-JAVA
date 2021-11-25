import java.util.*;
public class Main
{
    public static class Binarytree
    {
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
     public static void printreesystem(Binarytree root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null)
        {
            System.out.print("L"+root.left.data);
        }
        if(root.right!=null)
        {
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        printreesystem(root.left);
        printreesystem(root.right);
    }
    public static Binarytree takeinput()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter root data");
        int rootdata=s.nextInt();
        if(rootdata==-1)
        {
            return null;
        }
        Binarytree root=new Binarytree(rootdata);
        System.out.println("left->");
        Binarytree leftchild=takeinput();
        System.out.println("right->");
        Binarytree rightchild=takeinput();
        root.left=leftchild;
        root.right=rightchild;
        return root;
    }
    public static Binarytree codzeninput(boolean isroot,int parentData,boolean isleft)
    {
        Scanner s=new Scanner(System.in);
        if(isroot)
        {
        System.out.println("Enter root data");
        }
        else
        {
            if(isleft)
            {
                System.out.println("Enter leftchild of"+parentData);
            }
            else
            {
                System.out.println("Enter rightchild of"+parentData);
            }
        }
        int rootdata=s.nextInt();
        if(rootdata==-1)
        {
            return null;
        }
        Binarytree root=new Binarytree(rootdata);
        Binarytree leftchild=codzeninput(false,rootdata,true);
        Binarytree rightchild=codzeninput(false,rootdata,false);
        root.left=leftchild;
        root.right=rightchild;
        return root;
    }
    public static int numnodes(Binarytree root)
    {
        if(root==null)
        {
            return 0;
        }
        int count=1;
        count+=numnodes(root.left);
        count+=numnodes(root.right);
        return count;
    }
    public static int nodessum(Binarytree root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.data+nodessum(root.left)+nodessum(root.right);
    }
    public static void preorder(Binarytree root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Binarytree root)
    {
        if(root==null)
        {
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inorder(Binarytree root)
    {
        if(root==null)
        {
            return;
        }
        
        postorder(root.left);
        System.out.print(root.data+" ");
        postorder(root.right);
        
    }
    public static int largest(Binarytree root)
    {
        if(root==null)
        {
            return -1;
        }
        int large=0;
        int largeLeft=largest(root.left);
        int largrRight=largest(root.right);
        if(largeLeft>largrRight)
        {
            large=largeLeft;
        }
        else
        {
            large=largrRight;
        }
        if(large>root.data)
        {
            return large;
        }
        else
        {
            return root.data;
        }
    }
    public static int largestthenX(Binarytree root,int X)
    {
        
        if(root==null)
        {
            return 0;
        }
        int count=0;
        if(root.data>X)
        {
            count++;
        }
        return count+largestthenX(root.left,X)+largestthenX(root.right,X);
    }
    public static int height(Binarytree root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        if(leftheight>rightheight)
        {
            return 1+leftheight;
        }
        else
        {
            return 1+rightheight;
        }
    }
    public static int leafnodes(Binarytree root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null)
        {
            return 1;
        }
        return leafnodes(root.left)+leafnodes(root.right);
    }
    public static void deapthatk(Binarytree root,int K)
    {
        if(root==null)
        {
            return;
        }
        if(k==0)
        {
            System.out.print(root,data);
            return;
        }
        deapthatk(root.left,k-1);   
        deapthatk(root.right,k-1);  
        
        
    }
    public static void replaceleafwithdeapth(Binarytree root,int level)
    {
        if(root==null)
        {
            return;
        }
        root.data=level;
        replaceleafwithdeapth(root.left,level+1);
        replaceleafwithdeapth(root.right,level+1);
    }
    public static boolean isnodepre(Binarytree root,int ele)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==ele)
        {
            return true;
        }
        return (isnodepre(root.left,ele)||isnodepre(root.right,ele));
    }
    public static void nonsblingnode(Binarytree root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right!=null)
        {
            System.out.print(root.right.data+" ");
        }
        if(root.right==null&&root.left!=null)
        {
            System.out.print(root.left.data+" ");
        }
        nonsblingnode(root.left);
        nonsblingnode(root.right);
    }
    public static Binarytree removeleafnode(Binarytree root)
    {
        if(root==null)
        {
            return null;
        }
        if(root.left==null&&root.right==null)
        {
            return null;
        }
        root.left=removeleafnode(root.left);
        root.right=removeleafnode(root.right);
        return root;
    }
	public static void main(String[] args) {
// 		Binarytree root=new Binarytree(1);
// 		Binarytree left=new Binarytree(2);
// 		Binarytree right=new Binarytree(3);
// 		root.right=right;
// 		root.left=left;
// 		Binarytree right1=new Binarytree(4);
// 		Binarytree left1=new Binarytree(5);
// 		left.right=right1;
// 		right.left=left1;
        Scanner s=new Scanner(System.in);
        Binarytree root=codzeninput(true,0,true);
		printreesystem(root);
		System.out.println("Total number of nodes in the tree->"+numnodes(root));
		System.out.println("Total sum of nodes in the tree->"+nodessum(root));
		System.out.println("Largest nodes in the tree->"+Largest(root));
		System.out.println("Enter number to find largest nodes from->");
		int X=s.nextInt();
		System.out.println("Largest nodes in the tree from X->"+largestthenX(root,X));
		System.out.println("Height of the tree->"+height(root));
		System.out.println("number of leafnodes  of the tree->"+leafnodes(root));
		System.out.println("Enter deapth->");
		int K=s.nextInt();
		System.out.println("nodes  of the tree at depth K->"+deapthatk(root,K));
		replaceleafwithdeapth(root,0);
		printreesystem(root);
		System.out.println("Enter ele->");
		int ele=s.nextInt();
		System.out.println(isnodepre(root,ele));
		System.out.println("nodes with no sibling in  the tree->"+nonsblingnode(root,));
		System.out.println("removing leaf nodes");
		root=removeleafnode(root);
		printreesystem(root);
		
		
		
		
	}
}
