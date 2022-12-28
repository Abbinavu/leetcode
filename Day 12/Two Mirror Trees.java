class Solution {
    boolean areMirror(Node p, Node q) {
        // Your code here
        if(p==null && q==null)
        return true;
        if(p==null || q==null)
        return false;
        boolean left=false,right=false;
        if(p.data==q.data){
            left=areMirror(p.left,q.right);
            right=areMirror(p.right,q.left);
        }
        return (left && right);
    }
}
