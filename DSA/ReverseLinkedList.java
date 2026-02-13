class Node{
    int data;
    Node next;
    Node(int d){data=d;}
}

public class ReverseLinkedList {
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);

        Node prev=null,curr=head;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        while(prev!=null){
            System.out.print(prev.data+" ");
            prev=prev.next;
        }
    }
}
