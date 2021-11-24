import java.util.*;
public class Main
{
    public static class treenode
    {
        public int data;
        public ArrayList<treenode> children;
        public treenode(int data){
            this.data=data;
            children=new ArrayList<>();
            
        }
    }
    public static treenode input(Scanner s)
    {
        int data=s.nextInt();
        treenode root=new treenode(data);
        int childcount=s.nextInt();
        for(int i=0;i<childcount;i++)
        {
            treenode child=input(s);
            root.children.add(child);
        }
        return root;
        
    }
    public static void printtree(treenode root)
    {
        String s=root.data+":";
        for(int i=0;i<root.children.size();i++)
        {
            s=s+root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++)
        {
            printtree(root.children.get(i));
        }
    }
    public static treenode inputwise()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Root Data");
        int rootdata=s.nextInt();
        Queue<treenode> pendindnodes=new LinkedList<treenode>();
        treenode root= new treenode(rootdata);
        pendindnodes.add(root);
        while(!pendindnodes.isEmpty())
        {
            treenode frontnode=pendindnodes.poll();
            System.out.println("Enter num of children of "+ frontnode.data);
            int numchild=s.nextInt();
            for(int i=0;i<numchild;i++)
            {
                System.out.println("Enter"+(i+1)+"th child of "+ frontnode.data);
                int child=s.nextInt();
                treenode childnode= new treenode(child);
                frontnode.children.add(childnode);
                pendindnodes.add(childnode);
            }
        }
        return root;
        
    }
    public static int numnodes(treenode root)
    {
        if(root==null)
        {
            return 0;
        }
        int count=1;
        for(int i=0;i<root.children.size(); i++)
        {
            count+=numnodes(root.children.get(i));
        }
        return count;
    }
    public static int largest(treenode root)
    {
        if(root==null)
        {
            return -1;
        }
        int ans=root.data;
        for(int i=0;i<root.children.size();i++)
        {
            int childlargest=largest(root.children.get(i));
            if(childlargest>ans)
            {
                ans=childlargest;
            }
        }
        return ans;
    }
    public static int height(treenode root)
    {
        if(root==null)
        {
            return 0;
        }
        int count=1;
        int largest=0;
        for(int i=0;i<root.children.size();i++)
        {
            int test=height(root.children.get(i));
            if(test>largest)
            {
                largest=test;
            }
        }
        count=count+largest;
        return count;
        
    }
    public static void printatk(treenode root,int k)
    {
        if(k<0)
        {
            return;
        }
        if(k==0)
        {
            System.out.print(root.data+"--");
            return;
        }
        for(int i=0;i<root.children.size();i++)
        {
            printatk(root.children.get(i),k-1);
        }
        
        
        
    }
    public static int leafnode(treenode root)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        if(root.children.size()==0)
        {
            return 1;
        }
        else
        {
            for(int i=0;i<root.children.size();i++)
            {
                count+=leafnode(root.children.get(i));
            }
        }
        return count;
    }
    public static void preorder(treenode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        if(int i=0;i<root.children.size();i++)
        {
            preorder(root.children.get(i));
        }
        
    }
    public static void postorder(treenode root)
    {
        if(root==null)
        {
            return;
        }
        if(int i=0;i<root.children.size();i++)
        {
            preorder(root.children.get(i));
        }
        System.out.print(root.data+" ");
        
    }
	public static void main(String[] args) {
// 		Scanner s=new Scanner(System.in);
// 		treenode root=input(s);

        treenode root=inputwise();
// 		printtree(root);
// 		System.out.println("Total numbers of nodes->"+ numnodes(root));
// 		System.out.println("largest number of node->"+ largest(root));
// 		System.out.println("Height of tree->"+ height(root));
// 		printatk(root,3);
		System.out.println("total number of leaf nodes->"+ leafnode(root));
		
		
	}
}
