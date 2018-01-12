package array;

import java.util.ArrayList;

public class SumofS {
	/**
	 * ����һ����������������һ������S���������в������������ǵ����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
	 * 
	 * @param array
	 * @param sum
	 * @return
	 */
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> list=new ArrayList<>();
		int head=0,tail=array.length-1;
		int min=Integer.MAX_VALUE;
		if(array.length<=0)
			return list;
		while(head<tail) {
			System.out.println(head+"     "+tail);
			int temp=array[head]+array[tail];
			if(temp==sum) {
				if(array[head]*array[tail]<min)
				{
					min=array[head]*array[tail];
					list.clear();
					list.add(array[head]);
					list.add(array[tail]);
				}
				head++;
				tail--;
			}else if(temp<sum){
				head++;
			}else {
				tail--;
			}
		}
		return list;
	}
}
