package linkedlist;

public class MergeList {
	/**
	 * ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
	 */
	 public ListNode Merge(ListNode list1,ListNode list2) {
	        ListNode node=new ListNode(0);
	        ListNode temp=new ListNode(0);
	        node.next=temp;
	        while(list1!=null||list2!=null) {
	        	
	        	if(list1!=null&&list2!=null) {
	        		if(list1.val<list2.val) {
	        			temp.next=list1;
	        			list1=list1.next;
	        		}else {
	        			temp.next=list2;
	        			list2=list2.next;
	        		}
	        	}else if(list1!=null){
	        		temp.next=list1;
	        		break;
	        	}else if(list2!=null){
	        		temp.next=list2;
	        		break;
	        	}
	        	temp=temp.next;
	        }
	        
	        return node.next.next;
	}
}
