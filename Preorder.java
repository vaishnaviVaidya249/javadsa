import java.util.*;


class Preorder{
    static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class Binarytree{
        static int i=-1;
        public Node buildTree(int[] nodes){
            i++;
            if(nodes[i]==-1)
                return null;
            
            Node newNode=new Node(nodes[i]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;



        }
    }

        public static void  preOrderTraversal(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);



        


    }

    public static void  InOrderTraversal(Node root){
        if(root==null){
            return;
        }
      
        InOrderTraversal(root.left);
        System.out.print(root.data+" ");
        InOrderTraversal(root.right);



    


}
public static void  PostOrderTraversal(Node root){
    if(root==null){
        return;
    }
  
    PostOrderTraversal(root.left);
    
    PostOrderTraversal(root.right);
    System.out.print(root.data+" ");
   }
public static void levelOrder(Node root){
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    
}


    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree b=new Binarytree();
        Node root= b.buildTree(a);
       
        preOrderTraversal(root);
        System.out.println();
        InOrderTraversal(root);
        System.out.println();
        PostOrderTraversal(root);

        
    }
}