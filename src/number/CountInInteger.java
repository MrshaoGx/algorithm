package number;

public class CountInInteger {
	/**
	 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
	 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
	 * ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯, ���Ժܿ���������Ǹ�����������1���ֵĴ�����
	 */
	public int NumberOf1Between1AndN_Solution(int n) {
		int ones = 0;
	    for (long m = 1; m <= n; m *= 10)
	        ones += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
	    return ones;
	}
}
