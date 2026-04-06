class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> res = new LinkedList<>();
    if (root == null) return res;

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    boolean leftToRight = true; 

    while (!q.isEmpty()) {
        int size = q.size();
        LinkedList<Integer> lvlItems = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            TreeNode current = q.poll();

            if (leftToRight) {
                lvlItems.addLast(current.val); // Add to end
            } else {
                lvlItems.addFirst(current.val); // Add to beginning (reverses the level)
            }

            // Always add children in standard Left -> Right order for the Queue
            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }

        res.add(lvlItems);
        leftToRight = !leftToRight; // Flip the flag for the next level
    }

    return res;

        /*
        Approach 2: 
        - Using multiple stacks -> Flipping level value 0 to 1 
        - exchanging values in main and helper stack at end of level
        
        
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        
        List<Integer> currAns = new ArrayList<>();
        Stack<TreeNode> main = new Stack<>();
        Stack<TreeNode> helper = new Stack<>();
        int level = 0;
        main.push(root);
        while (main.size() > 0) {
            TreeNode currNode = main.pop();
            currAns.add(currNode.val);
            if (level == 0) {
                if (currNode.left != null) {
                    helper.push(currNode.left);
                }
        
                if (currNode.right != null) {
                    helper.push(currNode.right);
                }
            } else {
                if (currNode.right != null) {
                    helper.push(currNode.right);
                }
                if (currNode.left != null) {
                    helper.push(currNode.left);
                }
        
            }
        
            if (main.size() == 0) {
                ans.add(currAns);
                currAns = new ArrayList<>();
                level = 1 - level;
        
                main = helper;
                helper = new Stack<>();
            }
        }
        return ans;
        
        */

    }
}