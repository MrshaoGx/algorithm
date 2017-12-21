package Tree;

public class TreeNode {
	int val;
	public TreeNode left = null;
	public TreeNode right = null;

	public TreeNode(int x) {
		val = x;
	}
	/**
	 * ����һ�Ŷ�����
	 * @param arr
	 */
	public TreeNode(char[] arr) {
		
	}

	public void printSelf() {
		System.out.print("�������Ϊ:");
		printPreTree(this);
		System.out.println();

		System.out.print("�������Ϊ:");
		printInTree(this);
		System.out.println();

		System.out.print("�������Ϊ:");
		printTailTree(this);
		System.out.println();
	}

	/**
	 * �������
	 * 
	 * @param root
	 */
	private void printPreTree(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		printPreTree(root.left);
		printPreTree(root.right);
	}

	/**
	 * �������
	 * 
	 * @param root
	 */
	private void printInTree(TreeNode root) {
		if (root == null)
			return;
		printInTree(root.left);
		System.out.print(root.val + " ");
		printInTree(root.right);
	}

	/**
	 * �������
	 * 
	 * @param root
	 */
	private void printTailTree(TreeNode root) {
		if (root == null)
			return;
		printTailTree(root.left);
		printTailTree(root.right);
		System.out.print(root.val + " ");
	}

}
