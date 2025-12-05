package LinkedList;


class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next=null;
    }
    Node head;
    public void insert(int data){
        Node n = new Node(data);
        if(head == null){
            head=n;
            return;
        }
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next=n;
    }
    public void insertFirst(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
    public void insertIndex(int data,int index){
        Node n = new Node(data);
        Node temp =head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;

    }
    public void delete(){
        if(head == null){
            System.out.println("List is Empty");
            return ;
        }
        if(head.next == null){
            System.out.println("List Have one Node");
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteFirst(){
        if(head.next == null){
            System.out.println("List Have One Node");
            return;
        }
        Node temp = head;
        head=temp.next;
        temp=null;
    }
    public void deleteIndex(int index){
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Node n = new Node(10);
        n.insert(1);
        n.insert(2);
        n.insert(4);
        n.insert(5);
//        n.insertFirst(5);
//        n.insertFirst(5);
        n.insertIndex(3,2);
//        n.delete();
        n.deleteIndex(4);
        n.display();
    }

}
