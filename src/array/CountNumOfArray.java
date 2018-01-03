package array;

public class CountNumOfArray {
	/**
	 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡� ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������
	 * 2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
	 * 
	 * @param array
	 * @return
	 */
	public int MoreThanHalfNum_Solution(int[] array) {
		int res = 0;
		int max=Integer.MIN_VALUE;
		boolean[] visited=new boolean[array.length];
		for(int i=0;i<array.length;i++) {
			if(!visited[i]) {
				int count=0;
			
				for(int j=0;j<array.length;j++) {
					if(array[i]==array[j])
					{
						visited[j]=true;
						count++;
					}
				}
				if(count>max) {
					max=count;
					res=i;
				}
			}
		}
		return max>(array.length/2)?array[res]:0;
	}
}
