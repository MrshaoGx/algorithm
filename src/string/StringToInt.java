package string;

public class StringToInt {
	/**
	 * ��һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
	 * 
	 * @param str
	 * @return
	 */
	public int StrToInt(String str) {
		int res = 0, i = str.toCharArray().length-1, time = 1;
		while (i >=0) {
			if(str.charAt(i)=='+')
			{
				i--;
				continue;
			}
			else if(str.charAt(i)=='-') {
				res=-res;
				i--;
				continue;
			}else if (str.charAt(i) - 48 >= 10 || str.charAt(i) - 48 < 0) {
				res = 0;
				break;
			}
			res += (str.charAt(i--) - 48) * time;
			time *= 10;
		}

		return res;
	}
}
