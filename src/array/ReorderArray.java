package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReorderArray {
	/**
	 * ����һ�����������飬����������������ƴ�������ų�һ������
	 *  ��ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
	 * ���ӡ���������������ųɵ���С����Ϊ321323��
	 * 
	 * @param numbers
	 * @return
	 */
	public String PrintMinNumber(int[] numbers) {
	        String s="";
	        if(numbers.length==0)
	        	return s;
	        ArrayList<Integer> list=new ArrayList<Integer>();
	         
	        for(int i:numbers){
	            list.add(i);//���������arrayList��
	        }
	        //ʵ����Comparator�ӿڵ�compare������������Ԫ�ذ���compare�����Ĺ����������
	        Collections.sort(list,new Comparator<Integer>(){
	         
	            @Override
	            public int compare(Integer str1, Integer str2) {
	                // TODO Auto-generated method stub         
	                    String s1=str1+""+str2;
	                    String s2=str2+""+str1;
	                    return s1.compareTo(s2);
	                }
	            });
	         
	        for(int j:list){
	            s+=j;
	        }
	        return s;
	}
}
