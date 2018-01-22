package Tree;

public class SymmetricTree {
	/*
	 * ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ� 
	 * ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
	 * 
	 */
	public boolean isSymmetrical(TreeNode root) {
		if (root == null)
			return true;
		return sperate(root.left,root.right);
		
	}
	public boolean sperate(TreeNode left,TreeNode right) {  // ��߱Ƚ��ұߣ�һֱ��Ҷ�ӽڵ�
		if(left==null&&right==null)
			return true;
		 if(left==null||right==null) return false;
		 if(left.val==right.val)
		 {
			 return sperate(left.left,right.right)&&sperate(left.right,right.left);
		 }
		 return false;
	}
}
