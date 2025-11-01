import java.util.Scanner;
interface LinearDs{
    int MAXSIZE = 100;
    void add(int element);
    int remove();
    void displayElement();
}

class MyStack implements LinearDs{
    int top = -1;
    int arr[] = new int[MAXSIZE];
    public void add(int element){
        if(top == MAXSIZE - 1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = element;
    }

    public int remove(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int element = arr[top];
        top--;
        return element;
    }

    public void displayElement(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        int start = top;
        System.out.println(".Elements Of Stack are :- ");
        while(start != -1){
            System.out.print(arr[start] + " ");
            start--;
        }
    }
}

class MyQueue implements LinearDs{
    int rear = -1;
    int front = -1;
    int size = 0;
    int arr[] = new int[MAXSIZE];
    public void add(int element){
        if(size == MAXSIZE){
            System.out.println("Queue is Full");
            return;
        }
        else if(size == 0){
            front = rear = 0;
            arr[front] = element;
        }
        else{
            rear = (rear + 1) % MAXSIZE;
            arr[rear] = element;
        }
        size++;
    }

    public int remove(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int element = arr[front];
            front = (front + 1)  % MAXSIZE;
            size--;
            return element;
        }
    }

    public void displayElement(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Element Of Queue are :- ");
        if(rear > front){
            for(int i = front ; i <= rear ; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            for(int i = front ; i < MAXSIZE ; i++){
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i < rear ; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
public class LinearDataStructure{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();
        int choice;
        System.out.println("Menu:");
        System.out.println("1. Push to Stack");
        System.out.println("2. Pop from Stack");
        System.out.println("3. Display Stack");
        System.out.println("4. Enqueue to Queue");
        System.out.println("5. Dequeue from Queue");
        System.out.println("6. Display Queue");
        System.out.println("7. Exit");
        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int sElem = sc.nextInt();
                    stack.add(sElem);
                    break;
                case 2:
                    int element = stack.remove();
                    System.out.println("Element removed is : " + element);
                    break;
                case 3:
                    stack.displayElement();
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Enter element to enqueue: ");
                    int qElem = sc.nextInt();
                    queue.add(qElem);
                    break;
                case 5:
                    int ele = queue.remove();
                    System.out.println("Element removed is : " + ele);
                    break;
                case 6:
                    queue.displayElement();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 7);
        sc.close();
    }
}
