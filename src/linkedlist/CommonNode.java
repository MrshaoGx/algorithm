package linkedlist;

public class CommonNode {
	/**
	 * �������������ҳ����ǵĵ�һ��������㡣
	 * 
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		while (p1 != p2) {  //һ�滻 ���˳�
			p1 = (p1 == null ? pHead2 : p1.next);  //Ϊ���滻 ��Ϊ��������һ��
			p2 = (p2 == null ? pHead1 : p2.next);
		}
		return p1;
	}
}
