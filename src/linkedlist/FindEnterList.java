package linkedlist;

public class FindEnterList {
	/**
	 * һ�������а����������ҳ�������Ļ�����ڽ�㡣
	 * 
	 */
	  public ListNode EntryNodeOfLoop(ListNode pHead)
	   {
		  ListNode p=pHead;  //�Ҳ��ǿ���ָ���
		  ListNode q=pHead;  
		  while(q!=null&&p.next!=null) {
			  p=p.next;
			  q=q.next.next;
			  if(p==q)
			  {
				  p=pHead;
				  while(p!=q) {
					  p=p.next;
					  q=q.next;
				  }
				  if(p==q) return p;
			  }
		  }
		  return null;
	  }
}
