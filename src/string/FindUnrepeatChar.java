package string;

import java.util.LinkedHashMap;

public class FindUnrepeatChar {
	
	LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
	/**
	 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
	 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
	 * ��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
	 * 
	 * �����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
	 * @param ch
	 */
	public void Insert(char ch)
    {
		map.put(ch, map.getOrDefault(ch, 0)+1);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	char x='#';
    	for(char key:map.keySet()) {
    		if(map.get(key)==1)
    		{
    			x=key;
    			break;
    		}
    	}
    	return x;
    }
}
