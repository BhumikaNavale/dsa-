import java.util.*;
public class binarytreeyt
{
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static class binarytree
    {
        static int idx= -1;
        public static Node buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            System.out.print("");
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root==null)
        {
            System.out.print("");
            return ;
        }
       
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
     public static void inorder(Node root)
    {
        if(root==null)
        {
            System.out.print("");
            return ;
        }
       
        inorder(root.left);
         System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.buildtree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }
}