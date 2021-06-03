package data_struct;

//根节点表示整个数组的和
//下面每一层的左右节点平分父节点所包含元素个数，计算和

public class SegmentTree {
    Node root;
    public SegmentTree(int left,int right){
        root=buildTree(left,right);
    }
    public Node buildTree(int left,int right){
        Node root=new Node(left,right);
        if(right-left>=1){
            int mid=(left+right)/2;
            root.lchild=buildTree(left,mid);
            root.rchild=buildTree(mid+1,right);
        }
        return root;
    }
    public int search(int left,int right){
        return search(root,left,right);
    }
    private int search(Node node,int left,int right){
        if(right>left) return 0;
        if(node.left==left&&node.right==right) return node.val;
        int mid=(left+right)/2;
        return search(node.lchild,left,mid)+search(node.rchild,mid+1,right);
    }
    public void update(int index,int val){
        update(root,index,val);
    }
    private int update(Node node,int index,int val){
        if(node.right==node.left&&node.right==index){
            node.val=val;
            return node.val;
        }else{
            int mid=(node.left+node.right)/2;
            if(index<=mid)
                node.val=node.rchild.val+update(node.lchild,index,val);
            else
                node.val=node.lchild.val+update(node.rchild,index,val);
            return node.val;
        }
    }
}
class Node{
    int val; //存储  left~right的和
    int left;
    int right;
    Node lchild;
    Node rchild;
    public Node(int left,int right){
        this.left=left;
        this.right=right;
        val=0;
        lchild=null;
        rchild=null;
    }
}