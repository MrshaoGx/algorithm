package Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VerifySquenceOfBST {
	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0) {
			return false;
		}
		/*
		 * �����������е��ص㣬1234 6789 5 ��ȷ�������һλ 
		 */

		ArrayList<Integer> arr=new ArrayList<>();
		for(int i:sequence) arr.add(i);
		 return IsBST(arr);
	}

	private boolean IsBST(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		if(arr.size()==0||arr.size()==1) {
			return true;
		}
		int root=arr.get(arr.size()-1);
		ArrayList<Integer> left=new ArrayList<>();
		ArrayList<Integer> right=new ArrayList<>();
		int i=0;
		for(;i<arr.size()-1;i++) {  //�ѱ����һλ��С������ȫ���ӵ������� ֱ�������ȸ����
			if(arr.get(i)<=root) {
				left.add(arr.get(i));
			}else
				break;
		}
		for(;i<arr.size()-1;i++) {  //����������
			if(arr.get(i)>root) {
				right.add(arr.get(i));
			}else
				return false;
		}
		
		return IsBST(left)&&IsBST(right);
	}

}
