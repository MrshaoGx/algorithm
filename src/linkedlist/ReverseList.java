package linkedlist;

public class ReverseList {
	
	public ListNode reverseList(ListNode head) {
		ListNode cur=head;
		ListNode pre;
		ListNode tail;
		if(head==null)
			return null;
		pre=head.next;
		head.next=null;
		while(pre!=null) {
			tail=pre.next; //�Ѻ���Ľڵ������
			pre.next=cur; //�ѵ�ǰ�ڵ� �ŵ��м�ڵ�ĺ���
			cur=pre;     //�ڵ����
			pre=tail;    //�ڵ����
			
		}
		head=cur;
		head.printSelf();
		return head;
		
    }
}
