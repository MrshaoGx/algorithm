package Tree;

public class BinarySearchTreeAndLinkedList {
	/*
	 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
	 */
	//˼·�����������
	public TreeNode Convert(TreeNode node) {
		if(node==null)
			return null;
		TreeNode pHead;
		inOrder(node, null);
		return node;
	}
	private TreeNode inOrder(TreeNode node,TreeNode parent) {
		if(node.left==null&&node.right==null) {
			node.left
		}
		inOrder(node.left,node);
		node.left=null;
		node.right=parent;
		inOrder(node.right,node);
		node.right=null;
		node.left=parent;
		return node;
	}
}
