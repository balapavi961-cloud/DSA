package LinkedList;
class Stacks{
    int[] arr = new int[5];
    int top = -1;
    public void push(int data){
        if(top == arr.length-1){
            System.out.println("Stack is Full");
        }else {
            top++;
            arr[top] = data;
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Poped Element " + arr[top]);
            top--;
        }
    }
    public void peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Peek Element " + arr[top]);
        }
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
public class Stack {
    public static void main(String[] args){
        Stacks st = new Stacks();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.push(50);
        st.peek();

//        st.display();
    }

}
