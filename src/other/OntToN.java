package other;

public class OntToN {
		/**
		 * ��1+2+3+...+n��
		 * Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
		 */
	public int Sum_Solution(int n) {
		
      return sum(n,n-1);
    }
	public int sum(int origin,int cur) {
		if(cur==0)
			return origin;
		return sum(origin+cur,cur-1);
	}
}
