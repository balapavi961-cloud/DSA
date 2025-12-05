package LinkedList;
class Unode{
    int data;
    Unode next;
    Unode prev;
    Unode(int data){
        this.data=data;
    }
    Unode head;
    public void insertFirst(int data){
        Unode node = new Unode(data);
        if(head == null){
            head = node;
            return;
        }
        if(head.prev == null){
            head.prev=node;
            node.next=head;
            head=node;
        }
    }
    public void insert(int data){
        Unode node = new Unode(data);
        if(head == null){
            head = node;
            return;
        }
        Unode temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }
    public void insertIndex(int data , int index){
        Unode node = new Unode(data);
        if(head == null){
            head = node;
            return;
        }
        Unode temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
    }
    public void delete(){
        Unode temp = head;
        if(head.next == null){
            System.out.println("Only One Node Here");
            return;
        }
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteFirst(){
        Unode temp = head;
        if(head == null ){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            System.out.println("You Have one Node");
            return;
        }
        head=temp.next;
        head.prev=null;
    }
    public void deleteIndex(int index){

    }
    public void display(){
        Unode temp=head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class DoublyLL {
    public static void main(String[] args){
        Unode un = new Unode(1);
        un.insertFirst(10);
        un.insertFirst(20);
        un.insert(1);
        un.insert(2);
        un.insert(3);
        un.insert(4);
        un.insert(5);

        un.display();
    }
}
