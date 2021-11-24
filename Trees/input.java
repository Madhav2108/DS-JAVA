import java.util.*;
public class input
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
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		treenode root=input(s);
		printtree(root);
		
		
	}
}
