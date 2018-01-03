package array;

import java.util.ArrayList;

public class FindKInArray {
	/** ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,�� */
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> arr = new ArrayList<>();
		boolean [] visited=new boolean[input.length];
		int min=Integer.MAX_VALUE;
		if(k>input.length)
			return arr;
		while(k-->0) {
			int pos=0;
			for(int i=0;i<input.length;i++) {
				if(input[i]<min&&!visited[i]) {
					min=input[i];
					pos=i;
				}
			}
			arr.add(min);
			visited[pos]=true;
			min=Integer.MAX_VALUE;
		}
		return arr;
	}
}
