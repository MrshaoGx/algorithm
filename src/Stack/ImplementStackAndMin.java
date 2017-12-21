package Stack;

import java.util.ArrayList;

public class ImplementStackAndMin {
	/**
	 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
	 */
	ArrayList<Integer> A=new ArrayList<>();
	public void push(int node) {
		A.add(node);
    }
    
    public void pop() {
    	if(A.size()<=0)
    		return;
        A.get(A.size()-1);
        A.remove(A.size()-1);
        
    }
    
    public int top() {
    	if(A.size()<=0)
    		return 0;
        return A.indexOf(A.size()-1);
    }
    
    public int min() {
        if(A.size()<=0)
        {
        	return 0;
        }
        int min=A.get(0);
        for(int x:A) {
        	min=min>x?x:min;
        }
        return min;
    }
}
