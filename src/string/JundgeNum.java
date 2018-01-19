package string;

public class JundgeNum {
	/**
	 * ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
	 * ���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ��
	 * ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
	 */
	//-.123  5e+6  1+23  1.2.3 +-5  12e+5.4 ���������ύ��ʱ��δ��ȫ�˽�����
	public boolean isNumeric(char[] str) {
		if (str.length == 0)
			return false;
		boolean isVaild = false;
		for (int i = 0; i < str.length; i++) {
			if (i == 0 && (str[i] == '+' || str[i] == '-'))
				continue;
			else if ((str[i] == '+' || str[i] == '-') && (isNum(str[i - 1])||(str[i-1]=='-'||str[i-1]=='+'))) {
				return false;
			}
			if (str[i] == '.') {
				if(isVaild)	
					return false;
				if ( !(i + 1 < str.length && isNum(str[i + 1])))
					return false;
				isVaild = true;
			}
			if (str[i] == 'e' || str[i] == 'E') {
				isVaild=true;
				if (i - 1 >= 0 && isNum(str[i - 1]) && i + 1 < str.length) {

					if (!isNum(str[i + 1]) && str[i + 1] != '-' && str[i + 1] != '+')
						return false;
				} else
					return false;
			} else if (!isNum(str[i]) && str[i] != '.' && str[i] != '+' && str[i] != '-')

				return false;
		}
		return true;
	}

	public boolean isNum(char c) {
		return c >= '0' && c <= '9';
	}

}
