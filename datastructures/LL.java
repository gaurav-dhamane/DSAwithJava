package datastructures;



public class LL {

    private  Node head;
    private  Node tail;
    private int size=0;

    public LL(){
        this.size=0;
    }

    public LL(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            insertBack(arr[i]);

        }


    }

    public int size(){
        return this.size;
    }


    public void  insert(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;


        if(tail==null){
            tail=head;
        }

        size+=1;
    }

//    insert from back
    public void insertBack(int data){
        Node node= new Node(data);

        if(this.size==0){
            this.insert(data);

        }
        else {
            node.next = null;

            tail.next = node;
            tail = node;

        }
        size++;

    }




    public  void  display(){
        Node ptr= head;
        while (ptr !=null){

            System.out.print(ptr.data);
            System.out.print(" ");
            ptr=ptr.next;
        }
        System.out.println();
    }

    public void delete(int ind){
        if(ind>=size){
            return;
        }

        if(ind==0){
            deleteFirst();
        }
        else {
           Node prev= get(ind-1);
           prev.next=prev.next.next;
        }
        size--;
    }
    public Node get(int ind){
        Node ptr = head;
        for (int i = 0; i < ind; i++) {
            ptr = ptr.next;
        }
        return ptr;
    }

    public void deleteFirst(){
        head=head.next;
        size--;
    }


    public void insAt(int ind, int data){


        if(ind==0){
            insert(data);
        }
        else if(ind>=size){
            insertBack(data);
        }
        else {

            ind-=1;
            Node ptr = head;
            for (int i = 0; i < ind; i++) {
                ptr = ptr.next;
            }
            Node temp = new Node(data);

            temp.next = ptr.next;
            ptr.next = temp;
            size += 1;
        }
    }


    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }

        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }

    }
}
