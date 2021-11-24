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
	public static void main(String[] args) {
// 		Scanner s=new Scanner(System.in);
// 		treenode root=input(s);

        treenode root=inputwise();
		printtree(root);
		
		
	}
}
