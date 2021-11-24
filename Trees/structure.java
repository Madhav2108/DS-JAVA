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
	public static void main(String[] args) {
		treenode root=new treenode(2);
		treenode node1=new treenode(4);
		treenode node2=new treenode(3);
		treenode node3=new treenode(1);
		treenode node11=new treenode(9);
		treenode node12=new treenode(8);
		treenode node13=new treenode(7);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node1.children.add(node11);
		node1.children.add(node12);
		node1.children.add(node13);
		
		System.out.print(root.children.get(0).data);
		
	}
}
