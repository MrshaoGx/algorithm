package tree;


public class SerializeTree {
	/*
	 * ��ʵ�������������ֱ��������л��ͷ����л�������
	 * 
	 */
	public String Serialize(TreeNode root) {
        if(root == null)
            return "";
        StringBuilder sb = new StringBuilder();
        Serialize2(root, sb);
        return sb.toString();
    }
     
	public void Serialize2(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append("#,"); //���սڵ��ʱ�����#��ʾ��β
            return;
        }
        sb.append(root.val);
        sb.append(',');
        Serialize2(root.left, sb);  //������������ӵ�������
        Serialize2(root.right, sb); //�ٽ���������ӵ�������
    }

	public TreeNode Deserialize(String str) {
		String[] arr = str.split(",");
		if (arr.length <= 0||str.length()==0)
			return null;
		return subDeserialize(arr);
	}
	int idx=-1;
	public TreeNode subDeserialize(String[] arr ) {
		idx++;
		if (idx<arr.length&&!arr[idx].equals("#")) {
			TreeNode root = new TreeNode(0);
			root.val = Integer.parseInt(arr[idx]);
			root.left = subDeserialize(arr);
			root.right = subDeserialize(arr);
			return root;
		}
		return null;

	}
}
