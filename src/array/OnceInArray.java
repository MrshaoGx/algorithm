package array;

import java.util.HashMap;

public class OnceInArray {
	// num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
	// ��num1[0],num2[0]����Ϊ���ؽ��
	/**
	 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
	 */
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int x : array) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		boolean flag = false;
		for (int key : map.keySet()) {
			if (map.get(key) == 1) {
				if (flag)
					num1[0] = key;
				else
					num2[0] = key;
				flag = true;
			}
		}
	}
}
