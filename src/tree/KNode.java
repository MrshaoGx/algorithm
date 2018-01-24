package tree;

public class KNode {
	/*
	 * 
	 * ����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣 ���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4��
	 */
	int count = 0;

	public TreeNode KthNode(TreeNode root, int k) {  //�������
		if (root != null) {
			TreeNode node = KthNode(root.left, k);
			if (node != null)
				return node;
			count++;
			if (count == k)
				return root;
			node = KthNode(root.right, k);
			if (node != null)
				return node;
		}
		return null;
	}
}
