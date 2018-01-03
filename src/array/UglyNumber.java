package array;

import java.util.ArrayList;

public class UglyNumber {
	/**
	 * ��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7��
	 * ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
	 * 
	 * @param index
	 * @return
	 */
	public int GetUglyNumber_Solution(int n) {
		long time = System.currentTimeMillis();

		if (n <= 0)
			return 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int i2 = 0, i3 = 0, i5 = 0;
		while (list.size() < n)// ѭ��������
		{
			int m2 = list.get(i2) * 2;
			int m3 = list.get(i3) * 3;
			int m5 = list.get(i5) * 5;
			int min = Math.min(m2, Math.min(m3, m5));
			list.add(min);
			System.out.println(m2+" "+m3+" "+m5);
			if (min == m2)
				i2++;
			if (min == m3)
				i3++;
			if (min == m5)
				i5++;
		}
		
		System.out.println(System.currentTimeMillis() - time + "  ");
		return list.get(list.size() - 1);
	}

	public boolean isUgly(int num) {
		for (int i = 2; i < 6 && num > 0; i++)
			while (num % i == 0)
				num /= i;
		return num == 1;
	}
}
