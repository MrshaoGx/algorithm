package Tree;

public class IsBST {
	/**
	 * ����һ�ö��������жϸö������Ƿ���ƽ���������
	 */
	public boolean IsBalanced_Solution(TreeNode root) {
		if (root == null)
			return true;
		return TreeDepth(root) <= 1;
	}

	public int TreeDepth(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1
				- Math.min(TreeDepth(root.left), TreeDepth(root.right));
	}
}
