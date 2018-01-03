package array;

import java.util.ArrayList;

public class ContinueSqeuence {
	/**
	 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�, �����Ͼ�д������ȷ����100�����������������ڴ�,
	 * �����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)�� û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
	 * ���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck! �������: ������к�ΪS�������������С�
	 * �����ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
	 */
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int start = 1;
		while (start < (sum + 1) / 2) {
			int tmpSum = start;
			ArrayList<Integer> tmp = new ArrayList<>();
			tmp.add(start);
			int j = start + 1;
			while (tmpSum != sum && j <=(sum + 1) / 2) {
				if (tmpSum > sum&&tmp.size()>0) {
					// �ƶ�ͷ
					tmp.remove(0);
				} else {
					tmpSum += j;
					tmp.add(j);
				}
				j++;
			}
			if(tmpSum==sum)
				res.add(tmp);
			start++;
		}
		return res;
	}
}
