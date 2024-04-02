class Solution
{
    
    int absolute_diff(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<al.size()-1; i++){
            ans = Math.min(Math.abs(al.get(i) - al.get(i+1)), ans);
        }
        return ans;
    }
    void inorder(Node root, ArrayList<Integer> al){
        if(root == null){
            return;
        }
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right, al);
    }
}