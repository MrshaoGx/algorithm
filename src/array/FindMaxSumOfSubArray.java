package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxSumOfSubArray {
	/**
	 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ�� ��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,
	 * ������Ҫ��������������������,������ȫΪ������ʱ��, ����ܺý��������,��������а�������,�Ƿ�Ӧ�ð���ĳ������,
	 * �������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2}, ����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
	 * ��᲻�ᱻ������ס��(�������ĳ���������1)
	 */
	public int FindGreatestSumOfSubArray(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				list.add(sum);
			}
		}
		if (list.size() == 0)
			return 0;
		Collections.sort(list);

		return list.get(list.size() - 1);
	}
	/** ��̬�滮
	 *   if(array.length==0) return 0;
        int sum = array[0], tempsum = array[0]; //ע���ʼֵ ������Ϊ0 ��ֹֻ�и���
        for(int i = 1; i < array.size(); i++) //��1��ʼ ��Ϊ0������ڳ�ʼ��ʱ�����
        {
            tempsum = (tempsum < 0) ? array[i] : tempsum + array[i];
            sum = (tempsum > sum) ? tempsum : sum;
        }
        return sum;
	 */
}
