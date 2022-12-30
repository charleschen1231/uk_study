package leetcode_demo;
/*
   输入一个链表，输出这个链表的倒数第K个节点
 */



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode append(ListNode node1,int m){
        ListNode node2= new ListNode( m );
        ListNode cur=node1;
        while(cur !=null){
            cur=cur.next;
        }
        cur.next=node2;
        return node1;
    }

}
public class KLastNode {




 public static ListNode klastNode(ListNode head,int k){
        // 首先 count出链表的长度，然后 n-k+1 这个值就是链表的倒数的k节点
      ListNode cur=null;
      int len=0;
      while(cur!=null){
          cur=cur.next;
          len+=1;
      }
      int m=len-k+1;
      while (cur!=null){
          if(cur.val==m){
              return cur;
          }
          cur=cur.next;
      }
      return cur;

 }
    public static void main(String[] args) {
        final ListNode listNode = new ListNode( 1 );
        final ListNode append = listNode.append( listNode, 5 );
        System.out.println(append);

    }

}
