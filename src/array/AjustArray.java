package array;

public class AjustArray {
	/**
	 * ����һ���������飬ʵ��һ�����������������������ֵ�˳�� ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ����
	 * ��ĺ�벿�֣�����֤������������ż����ż��֮������λ �ò��䡣
	 */
	public void reOrderArray(int[] array) {
		int[] arr=new int[array.length];
		int i=0;
		for(int x:array)
			if(x%2==1)
				arr[i++]=x;
		for(int y:array)
			if(y%2==0)
				arr[i++]=y;
		i=0;
		for(int k:arr)
			array[i++]=k;
	}
}
