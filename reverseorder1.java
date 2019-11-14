class reverseorder1{
    class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left = right = null;
        }
    }
    Node root;
    reverseorder1(){
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
    /*    public void reverse()
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
        }*/
        void print()
    {
        int h = height(root);
        System.out.print("\n"+h+ " \n");
        for(int i = h; i>=1 ;i-- )
        {
            printlev(root,i);
        }
    }
    int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if(lheight>rheight)
            {
                return (lheight+1);
            }
            else
            {
                return (rheight+1);
            }
        }
    }
    void printlev(Node root , int level)
    {   
        if(root == null)
        {
            return;
        }
        if(level == 1)
        {
            System.out.print(root.data + " ");
        }
        else if(level > 1)
        {
            printlev(root.right, level-1);
            printlev(root.left, level-1);
        }
    }

    public static void main(String args[]){
        reverseorder1 rev = new reverseorder1();
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
       // rev.reverse();
        rev.print();
    }
}