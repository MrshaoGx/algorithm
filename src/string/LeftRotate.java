package string;

public class LeftRotate {
	/**
	 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ���������������һ���������ַ�����S��
	 * �������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ����
	 * ����XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
	 */
	public String LeftRotateString(String str, int n) {
		if(str.length()==0)
			return "";
		StringBuffer sb = new StringBuffer();
		int start=(n%str.length());
		int len=0;
		while(len!=str.length()) {
			if(start==str.length())
			{
				start=0;
			}
			sb.append(str.charAt(start));
			start++;
			len++;
		}
		return sb.toString();
	}
}
