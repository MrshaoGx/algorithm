package array;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RepeatNumberInArray {
	/**
	 * ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�
	 * Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡� ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}��
	 * ��ô��Ӧ������ǵ�һ���ظ�������2��
	 * 
	 * @param numbers
	 * @param length
	 * @param duplication
	 * @return
	 */
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<length;i++) {
			map.put(numbers[i], map.getOrDefault(numbers[i], 0)+1);
		}	
		for(int key:map.keySet()) {
			if(map.get(key)>1) {
				duplication[0]=key;
				return true;
			}
		}
		return false;
	}
}
