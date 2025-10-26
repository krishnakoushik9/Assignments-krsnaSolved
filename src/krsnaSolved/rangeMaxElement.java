package krsnaSolved;


public class rangeMaxElement {
    public static void buildTree(int[] arr,int[] tree,int start,int end,int i){
        if(start == end){
            tree[i] = arr[start];
            return;
        }
        int mid = start + (end - start)/2;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        buildTree(arr,tree,start,mid,leftChild);
        buildTree(arr,tree,mid + 1,end,rightChild);
        tree[i] = Math.max(tree[2*i+1] , tree[2*i+2]);
    }

    public static int query(int[] tree,int start,int end,int l,int r,int i){
        if(r < start || end < l){
            return Integer.MIN_VALUE;
        }
        if(l <= start && end <= r){
            return tree[i];
        }
        int mid = start + (end - start)/2;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int leftSum = query(tree,start,mid,l,r,leftChild);
        int rightSum = query(tree,mid+1,end,l,r,rightChild);
        return Math.max(leftSum,rightSum);
    }

    public static void main(String[] args) {
        int[] arr = {9,7,4,8,0,-1,5,23,12,55,81};
        int[] segmentTree = new int[4* arr.length];
        buildTree(arr,segmentTree,0,arr.length-1,0);
        System.out.println(query(segmentTree,0,arr.length-1,0,5,0));
    }
}
