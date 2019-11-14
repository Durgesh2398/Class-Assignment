class reverseorder{
    class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left = right = null;
        }
    }
    Node root;
    reverseorder(){
        root=null;
    }
    void insert(int data){
        root=insertdata(root,data);
    }
    Node insertdata(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data>root.data){
            root.left=insertdata(root.left,data);
        }
        if(data<root.data){
            root.right=insertdata(root.right,data);
        }
        return root;
    }
    void preorder(){
        pre(root);
    }
    public static void pre(Node root){
        if(root!=null){
            System.out.print(root.data+"->");
            pre(root.left);
            pre(root.right);
        }
    }
    void inorder()
        {
          inorder1(root);
        }
        public static void inorder1(Node root)
       {
         if(root!=null)
           {
               inorder1(root.left);
                System.out.print(root.data+"->");
                inorder1(root.right);
           }
      }
      public void postorder()
        {
            postorder1(root);
        }
        public static void postorder1(Node root)
        {
            if(root!=null)
            {
                postorder1(root.left);
                postorder1(root.right);
                System.out.print(root.data+"->");
            }
        }
        public void reverse()
        {
            reverse1(root);
        }
        public static void reverse1(Node root)
        {
            if(root!=null)
            {
                postorder1(root.right);
                postorder1(root.left);
                System.out.print(root.data+"->");
            }
        }

    public static void main(String args[]){
        reverseorder rev = new reverseorder();
        rev.insert(40);
        rev.insert(30);
        rev.insert(20);
        rev.insert(35);
        rev.insert(70);
        rev.insert(50);
        rev.insert(50);
        rev.insert(80);
        System.out.print("preorder ");
        rev.preorder();
        System.out.println("");
        System.out.print("inorder ");
        rev.inorder();
        System.out.println("");
        System.out.print("postorder ");
        rev.postorder();
        System.out.println("");
        System.out.print("reverse ");
        rev.reverse();
    }
}