package LinkedList;
class Queue{
    int[] arr = new int[5];
    int rear = -1;
    int front = 0;
    public void Enqueue(int data){
        if(rear == arr.length-1){
            System.out.println("Stack is Full");
        }
        else {
            rear++;
            arr[rear] = data;
        }
    }
    public void display(){
        if(rear == -1){
            
        }
    }
}
public class QueueExample {
    public static void main(String[] args){
        Queue ue = new Queue();
        ue.Enqueue(10);
        ue.display();
    }
}
