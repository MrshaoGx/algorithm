package array;

public class CountNumInArray {
	/**
	 * ͳ��һ�����������������г��ֵĴ�����
	 */
	public int GetNumberOfK(int[] array, int k) {
		int result = 0;
		for(int x:array) {
			result+=x==k?1:0;
		}
		return result;
	}
}
