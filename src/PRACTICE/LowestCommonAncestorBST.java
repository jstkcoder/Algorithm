package PRACTICE;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class LowestCommonAncestorBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        // p와 q의 값이 모두 루트보다 작으면 왼쪽 서브트리에서 LCA를 찾습니다.
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        // p와 q의 값이 모두 루트보다 크면 오른쪽 서브트리에서 LCA를 찾습니다.
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        // p와 q가 루트를 기준으로 양쪽에 위치해 있으면, 현재 루트가 LCA입니다.
        return root;
    }

    public static void main(String[] args) {
        // 이진 탐색 트리 생성
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        LowestCommonAncestorBST lca = new LowestCommonAncestorBST();

        TreeNode p = root.left; // 2
        TreeNode q = root.right; // 8
        TreeNode ancestor = lca.lowestCommonAncestor(root, p, q);
        System.out.println("LCA of 2 and 8: " + ancestor.val); // 6

        p = root.left; // 2
        q = root.left.right; // 4
        ancestor = lca.lowestCommonAncestor(root, p, q);
        System.out.println("LCA of 2 and 4: " + ancestor.val); // 2
    }
}
