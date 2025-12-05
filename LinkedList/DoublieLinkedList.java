package LinkedList;

class DDNode{
    int data;
    DDNode prev;
    DDNode next;

    DDNode(int data)
    {
        this.data=data;
    }
    DDNode head;
    public void addFirst(int data)
    {
        DDNode newnode = new DDNode(data);
        if(head == null)
        {
            head=newnode;
            return;
        }
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }
    public void add(int data)
    {
        DDNode newnode = new DDNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        DDNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }
    public void indexAdd(int data, int index) {
        DDNode newNode = new DDNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }
        DDNode temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        // Insert the new node
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }

    public void remove()
    {
        if(head == null)
        {
            System.out.println("List is Already Null");
            return;
        }
        DDNode temp = head;
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void removeFirst()
    {
        if(head == null){
            System.out.println("List is already Null");
            return;
        }
        DDNode temp = head;
        head=temp.next;
        temp.prev=null;
    }
    public void removeAtIndex(int index) {
        DDNode temp = head;
        if(index == 0){
            head=head.next;
            if(head != null){
                head.prev=null;
            }
        }
        for (int i = 0; i < index-1 && temp.next !=null; i++) {
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Index out of Bound");
        }
        DDNode nextNode = temp.next;
        temp.next=nextNode.next;

        if(nextNode.next != null){
            nextNode.next.prev=temp;
        }
        nextNode.next=null;
        nextNode.prev=null;
    }
    public int size(){
        DDNode temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void display(){
        DDNode temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}




public class DoublieLinkedList {
    public static void main(String[] args){
        DDNode dd = new DDNode(1);
        dd.add(10);
        dd.add(10);
        dd.add(10);
        dd.add(10);
        dd.indexAdd(5,2);
        dd.addFirst(3);
        dd.addFirst(11);
        dd.add(12);
        dd.add(13);
        System.out.println(dd.size());
        dd.display();
    }
}
