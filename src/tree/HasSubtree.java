package tree;

public class HasSubtree {
	/**
	 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
	 * 
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if (root2 == null ||root1==null) {
			return false;
		}
		return isSubTree(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2); //�жϸ��ڵ���ж�������ͬ���

	}

	private boolean isSubTree(TreeNode node1,TreeNode node2) {  //���ж��������������
		if(node2==null) return true; //����Ҷ�ӽڵ�
		if(node1==null) return false; //A����B����֧��һ��
		if(node1.val==node2.val) 
			return isSubTree(node1.left, node2.left)&&isSubTree(node1.right, node2.right); //���еݹ����������ȶԽڵ��Ƿ�һ��
		else
			return false;
	}
}
