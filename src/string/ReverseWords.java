package string;

public class ReverseWords {
	/**
	 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��
	 * дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼�����磬��student.
	 * a am I���� ��������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ� ��ȷ�ľ���Ӧ���ǡ�I am a
	 * student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
	 */
	public String ReverseSentence(String str) {
		String[] arr=str.split(" ");
		if(arr.length==0) {
			return str;
		}
		StringBuilder  sb=new StringBuilder();
		for(int i=arr.length-1;i>=0;i--) {
			sb.append(arr[i]);
			sb.append(" ");
		}
		
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
}
