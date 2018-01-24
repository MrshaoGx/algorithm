package tree;

public class NextNode {
	/**
	 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
	 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
	 */
	TreeLinkNode GetNext(TreeLinkNode node)
    {
        if(node==null) return null;
        if(node.right!=null){    //�����������������������������ڵ�
            node = node.right;
            while(node.left!=null) node = node.left;
            return node;
        }
        while(node.next!=null){ //û�����������ҵ�һ����ǰ�ڵ��Ǹ��ڵ����ӵĽڵ�
            if(node.next.left==node) return node.next;
            node = node.next;
        }
        return null;   //�˵��˸��ڵ���û�ҵ����򷵻�null
    }
}
