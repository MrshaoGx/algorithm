package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintTreeUptoDown {
	/**
	 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
	 */
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		List<ArrayList<Integer>> data = new ArrayList<>();
		ArrayList<Integer> res=new ArrayList<>();
		if (root == null)
			return res;
		bfs(data, root, 0);
		for(int i=0;i<data.size();i++) {
			ArrayList<Integer> tmp=data.get(i);
			Collections.reverse(tmp);
			res.addAll(tmp);
		}
		return res;
	}

	private void bfs(List<ArrayList<Integer>> data, TreeNode root, int level) {
		if (root == null) {
			return;
		}
		if (data.size() > level) // �еĻ�ȡ���������ݷŽ�ȥ�ͺ���
		{
			ArrayList<Integer> tmp = data.get(level);
			tmp.add(root.val);
			data.set(level, tmp);
		} else { 				// ?û�У��´���һ����
			ArrayList<Integer> tmp = new ArrayList<>();
			tmp.add(root.val);
			data.add(tmp);
		}

		bfs(data, root.left, level + 1);
		bfs(data, root.right, level + 1);

	}

}
