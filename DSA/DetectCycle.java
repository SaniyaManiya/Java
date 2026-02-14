class ListNode{
    int val;
    ListNode next;
    ListNode(int v){val=v;}
}

public class DetectCycle {
    public static void main(String[] args){
        ListNode a=new ListNode(1);
        a.next=new ListNode(2);
        a.next.next=a;

        ListNode slow=a,fast=a;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }

        System.out.println(cycle);
    }
}
