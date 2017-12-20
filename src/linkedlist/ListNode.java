package linkedlist;

public class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
	public ListNode(int[] arr) {
		if(arr.length<=0) {
			return;
		}
		this.val=arr[0];
		ListNode node=new ListNode(arr[1]);
		this.next=node;
		for(int i=2;i<arr.length;i++) {
			node.next=new ListNode(arr[i]);
			node=node.next;
		}
		
	}
	/**
	 * ��ӡ�Լ�
	 */
	public void printSelf() {
		ListNode node=this;
		System.out.println("��ǰ����:");
		while(node!=null) {
			System.out.print(" "+node.val);
			node=node.next;
		}
	}
}
