package array;

public class InversePairs {
	/**
	 * �������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
	 * ����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
	 * 
	 * @param array
	 * @return
	 */
	public int InversePairs(int[] array) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j])
					count++;
			}
		}
		
		return count%1000000007;
	}
}
