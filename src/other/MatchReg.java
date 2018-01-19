package other;

public class MatchReg {
	/**
	 * ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ���
	 * �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ�� ���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
	 * 
	 * @param str
	 * @param pattern
	 * @return
	 */
	public boolean match(char[] str, char[] pattern) {

		boolean[][] dp = new boolean[str.length + 1][pattern.length + 1];
		dp[0][0] = true;
		for (int i = 1; i < dp[0].length; i++) {
			if (pattern[i - 1] == '*')   //�ж��������һλ�ǲ��� *
				dp[0][i] = dp[0][i - 2];    //�������Ϊ* ��*����Ľ���ƶ���*��λ����
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {   //�����ַ����ж�
				if (pattern[j - 1] == '.' || pattern[j - 1] == str[i - 1])  //����ƥ�䣬���½ǵĴ��ݵ���ǰλ��
					dp[i][j] = dp[i - 1][j - 1];
				else if (pattern[j - 1] == '*') {   //�жϺ�һλ�Ƿ�Ϊ*
					if (pattern[j - 2] != str[i - 1] && pattern[j - 2] != '.')
						dp[i][j] = dp[i][j - 2];
					else
						dp[i][j] = dp[i][j - 1] || dp[i][j - 2] || dp[i - 1][j];
				}
			}
		}
		return dp[str.length][pattern.length];
	}
}
