package mylist;

public class MyLinkedList {
    private Node head;
    private Node tail = null;
    private int numNodes;

    public MyLinkedList(Object data){
        head = new Node(data);
        tail = new Node(data);
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;

        for (int i=0; i < index-1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data){
        Node temp = tail;
        tail = new Node(data);
        tail = tail.next;
        numNodes++;
    }

    public void remove(int index, Object data){
        Node temp = head;
        for (int i=0; i < index;i++){
            while (temp == temp.next){
                for (int j = 1; j < index - 1; j++){
                    temp = temp.next;
                }
                numNodes--;
            }
        }
    }

    public void size (int)
}
