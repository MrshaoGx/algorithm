package linkedlist;

public class DeleteRepeatNode {
	/**
	 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬
	 * �ظ��Ľ�㲻��������������ͷָ�롣 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
	 */
	 public ListNode deleteDuplication(ListNode pHead)
	    {
		 if(pHead==null||pHead.next==null)
			 return pHead;
		 			//�����˫ָ������ �õ�һ���ڵ���Ϊ��׼����Ľڵ��Դ�ѭ���������ڵ�ǰ�ڵ�Ϊֹ
		 ListNode r=new ListNode(-1);
		 ListNode pre=null;  //��������ͷ���
		 ListNode q=pHead.next;//������һ���ڵ�
		 ListNode p=pHead;
		 r.next=p;
		 while(q!=null) {
			 if(q.val==p.val)
			 {
				 while(q!=null&&q.val==p.val) {
					 q=q.next;
				 }
				 //���qΪ�� ���Ѿ��ܵ����յ���
				 p=q;
				 if(pre==null)
					 r.next=q;
				 else
					 pre.next=p;
				 if(q==null)
					 continue;
				 q=q.next;
				
				
			 }else
			 {
				 pre=p;
				 p=p.next;
				 q=q.next;
			 }
		 }
		 
		 return r.next;
	    }
	 
}
