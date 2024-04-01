/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static int pairsViolatingBST(int n, Node root) {
        // code here
        Stack<Node> stk = new Stack<>();
        int[] pre = new int[n];
        Node t = root;
        int i = 0;
        int count=0;
        while(t != null || !stk.isEmpty()){
            while(t != null){
                stk.push(t);
                t=t.left;
            }
          t=  stk.pop();
            pre[i++] = t.data;
            t=t.right;
        }
        for(int k = 0 ; k < n ; k++){
            for(int j = k+1;j<n;j++){
                if(pre[k]>=pre[j]){
                    count++;
                }
            }
        }
        return count;
    }
}