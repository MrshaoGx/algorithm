package Tree;

import java.util.ArrayList;
import java.util.Collections;

public class PrintTreeByZ {
	/**
	 * ��ʵ��һ����������֮���δ�ӡ�������� ����һ�а��մ����ҵ�˳���ӡ�� �ڶ��㰴�մ��������˳���ӡ�� �����а��մ����ҵ�˳���ӡ���������Դ����ơ�
	 * [[8],[10,6],[5,7,9,11]]
	 */

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		// �Ҿ��ò��û��ݷ�
		ArrayList<ArrayList<Integer>> data = new ArrayList<>();
		if (pRoot == null)
			return data;
		backTrack(data, pRoot, 0);
		
		for(int i=1;i<data.size();i+=2) {
			ArrayList<Integer> tmp=data.get(i);
			Collections.reverse(tmp);
		}
		return data;
	}

	public void backTrack(ArrayList<ArrayList<Integer>> data, TreeNode node, int level) {
		if(node==null)
			return;
		if (data.size() > level) {
			data.get(level).add(node.val);
		} else {
			ArrayList<Integer> tmpList = new ArrayList<>();
			tmpList.add(node.val);
			data.add(tmpList);
		
		}
		backTrack(data, node.left, level + 1);
		backTrack(data, node.right, level + 1);

	}
}
