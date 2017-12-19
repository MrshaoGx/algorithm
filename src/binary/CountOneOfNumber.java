package binary;

public class CountOneOfNumber {
	/**
	 * ����һ��������1�ĸ���
	 * ˼·��������:����-1 Ҫôǰ�治��  Ҫô����ȫΪ1  ����10000B-1B =1111B
	 * @param n
	 * @return
	 */
	public int NumberOf1(int n) {
		if (n == 0)
			return 0;
		int count = 0;
		while (n!=0) {
			n=n&(n-1);
			count++;
		}

		return count;
	}
}
