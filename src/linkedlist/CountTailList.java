package linkedlist;

public class CountTailList {
	/**
	 * ����һ����������������е�����k����㡣
	 */
	public ListNode FindKthToTail(ListNode head, int k) {
		ListNode temp=head;
		int len=0;
		while(temp!=null) {
			temp=temp.next;
			len++;
		}
		if(len<k) {
			return null;
		}
		k=len-k;
		temp=head;
		while(k>0) {
			temp=temp.next;
			k--;
		}
		return temp;
	}
	
	
}
