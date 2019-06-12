package fun.hijklmn.leetcode;

/**
 * 
 * @Desc 两数之和	
 * @author GuoFusong
 * @Datetime 2019年6月12日下午1:52:48
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		
		ListNode listNode = new ListNode(2);
		listNode.next = new ListNode(4);
		listNode.next.next = new ListNode(3);
		
		ListNode listNode2 = new ListNode(5);
		listNode2.next = new ListNode(6);
		listNode2.next.next = new ListNode(4);
		
		ListNode listNode3 = addTwoNumbers(listNode, listNode2);
		
		System.out.println(listNode3.val);
		System.out.println(listNode3.next.val);
		System.out.println(listNode3.next.next.val);
		
	}
	
	public ListNode addTwoNumbers(ListNode a, ListNode b,boolean jinwei) {
	    if(a == null && b == null){
	        if(jinwei){
	            return new ListNode(1);
	        }
	        return null;
	    }
	    int r = (a == null ? 0 : a.val) + (b == null ? 0 : b.val);
	    if(jinwei){
	        r = r + 1;
	    }
	    
	    ListNode result = new ListNode(r % 10);
	    result.next  = addTwoNumbers((a == null ? null : a.next),(b == null ? null : b.next),r >=10);
	    
	    return result;
	}
	
	private static ListNode addTwoNumbers(ListNode listNode, ListNode listNode2) {
		
		ListNode listNode3 = listNode;
		
		ListNode listNode4 = listNode2;
		
		ListNode node = null;
		
		int add = 0;
		
		while (listNode3 != null || listNode4 != null) {
			
			int tempVal = 0;
			
			if (listNode3 != null) {
				tempVal += listNode3.val;
				listNode3 = listNode3.next;
			}
			
			if (listNode4 != null) {
				tempVal += listNode4.val;
				listNode4 = listNode4.next;
			}
			
			if (node == null) {
				node = new ListNode(tempVal % 10);
			} else {
				ListNode node2 = new ListNode(tempVal % 10 + add);
				node2.next = node;
				node = node2;
			}
			
			if (tempVal >= 10) {
				add = 1;
			} else {
				add = 0;
			}
			
			if (listNode3 == null && listNode4 == null) {
				break;
			}
			
		}
		
		return node;
		
	} 
	
}

class ListNode {
	
	int val;
	
	ListNode next;
	
	ListNode(int val) {
		this.val = val;
	}
	
}