public class LinkedList {
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data)
        {   //step 1 create new node
            Node newNode = new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            //step 2 link the new node 
            newNode.next= head;

            //step 3 reassign head
            head = newNode;
        }
public void addLast(int data)
{
    //step 1 create a new node
    Node newNode = new Node(data);
    if(head==null)
    {
        head=tail=newNode;
        return;
    }
    //step 2 link new node to last node
    tail.next= newNode;

    //step 3 reassign tail

    tail = newNode;
}
public void add(int idx,int data)
{
    if(idx==0)
    {
        addFirst(data);
        return;
    }
    Node newNode= new Node(data);

  
    Node temp = head;

    int i =0;
    while(i<(idx-1))
    {
        temp = temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;

}
public void printList()
{
    Node temp = head;

    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
       
        
    }
    System.out.print(temp);
}



    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        
   
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.add(1, 9);
        ll.addLast(4); 
        ll.addLast(5);
        ll.printList();
    }
}

