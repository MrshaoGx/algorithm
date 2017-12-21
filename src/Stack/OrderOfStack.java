package Stack;

import java.util.Stack;

public class OrderOfStack {
	/**
	 * ���������������У���һ�����б�ʾջ��ѹ��˳�� ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
	 * ��������1,2,3,4,5��ĳջ��ѹ��˳�� ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
	 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
	 */
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if(pushA.length==0||popA.length==0) {
			return false;
		}
		Stack<Integer> mStack=new Stack<Integer>();
		int j=0;
		for(int i=0;i<pushA.length;i++) {                      //��������ջ
			mStack.push(pushA[i]);                               
			while(j<popA.length&&mStack.peek()==popA[j]) {    //����ջ��Ԫ�غͶ�Ӧ�ĳ�ջ˳��Ƚϣ�ջ��Ԫ�����ջ˳����������γ�ջ�����������ջ ����
				mStack.pop();						
				j++;
			}
		}
		return mStack.isEmpty();  //������γ�ջ��� ��֤������ƥ��
		
	}
}
