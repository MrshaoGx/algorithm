package other;

public class Add {
	/**
	 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
	 * @param num1
	 * @param num2
	 * @return
	 */
	  public int Add(int num1,int num2) {
		  while (num2!=0) {
	            int temp = num1^num2;   //���  �൱�ڲ�ͬλ��� ��ͬλ������λ
	            num2 = (num1&num2)<<1;  //���� �ҳ���ͬλ���н�һ�������������ͬ����ɸ�ֵ �Ƴ�ѭ��
	            num1 = temp;          
	        }
	        return num1;
	    }
}
