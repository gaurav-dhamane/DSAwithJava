package datastructures;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size=0;
    }

    public DLL(int[] arr){

        for (int i = arr.length-1; i >=0; i--) {

            insertF(arr[i]);

        }


    }
    private class Node {
        private int data;
        Node prev;
        Node next;

        private Node(int data) {
            this.data = data;
        }

        private Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

    }

        public void insertF(int data){

            Node temp = new Node(data);
            if(size!=0){
                head.prev=temp;
                temp.next=head;
                head=temp;
            }
            else {
                head=temp;
                head.prev=null;
                head.next=null;
                tail=temp;
                size++;
            }

        }

        public void insert(int data, int pos){
            Node p= get(pos);
            Node temp =new Node(data);
            temp.next=p.next;


        }


        public Node get(int pos){
            Node ptr=head;
            for (int i = 0; i < pos; i++) {
                ptr=ptr.next;
            }

            return ptr;
        }
        public void  display(){
            Node ptr= head;
            while (ptr!=null){
                System.out.print(ptr.data+" ");
                ptr=ptr.next;

            }

            System.out.println();
        }





}
