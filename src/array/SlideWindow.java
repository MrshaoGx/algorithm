package array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SlideWindow {
	/**
	 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ�����磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3��
	 * ��ôһ������6���������ڣ����ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� �������{2,3,4,2,6,2,5,1}�Ļ�������������6����
	 * {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}��
	 * {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
	 */
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> result = new ArrayList<>();
		if (num.length < size||size==0)
			return result;
		for(int i=0;i<num.length-size+1;i++) {
			result.add(max(num, i, size+i));
		}
		return result;

	}

	public int max(int[] num, int start, int size) {
		int max = Integer.MIN_VALUE;
		for (int i = start; i < size; i++) {
			max = max < num[i] ? num[i] : max;
		}
		return max;
	}

}
