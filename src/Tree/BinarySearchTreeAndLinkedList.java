package Tree;

public class BinarySearchTreeAndLinkedList {
	/*
	 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
	 */
	// ˼·�����������
	public TreeNode Convert(TreeNode node) {
		if (node == null)
			return null;
		
		return inOrder(node);
	}

	protected TreeNode leftLast = null;

	private TreeNode inOrder(TreeNode root) {
		if (root == null)
			return null;
		if (root.left == null && root.right == null) {
			leftLast = root;// ����һ���ڵ����Ϊ���Ҳ��Ҷ�ڵ�
			return root;
		}
		// 1.�������������˫��������������ͷ�ڵ�
		TreeNode left = inOrder(root.left);
		// 3.�������������Ϊ�յĻ�������ǰroot׷�ӵ�����������
		if (left != null) {
			leftLast.right = root;
			root.left = leftLast;
		}
		leftLast = root;// �����ڵ�ֻ��������ʱ����ø��ڵ�Ϊ���һ���ڵ�
		// 4.�������������˫��������������ͷ�ڵ�
		TreeNode right = inOrder(root.right);
		// 5.�������������Ϊ�յĻ�����������׷�ӵ�root�ڵ�֮��
		if (right != null) {
			right.left = root;
			root.right = right;
		}
		return left != null ? left : root;
	}
}
