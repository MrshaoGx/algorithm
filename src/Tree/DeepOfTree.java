package Tree;

public class DeepOfTree {
	/**
	 * ����һ�ö����������������ȡ� 
	 * �Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·���� 
	 * �·���ĳ���Ϊ������ȡ�
	 */
	public int TreeDepth(TreeNode root) {
		if(root==null)
			return 0;
		return Math.max(TreeDepth(root.left), TreeDepth(root.right))+1;
	}
}
