public class doubleLinkedList {
    private Node head;
    private int size;
    public Node next;
    public Node prev;

    public doubleLinkedList(){
        this.head=null;
        this.size=0;
    }

    public void insert(Object data){
        Node newNode=new Node(data);
        Node tmp=this.head;
        if (this.head==null){
            this.head=newNode;
        }
        else {
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
            newNode.setPrev(tmp);
            newNode.setNext(null);
            this.size++;
        }
    }



    public Node find(Object value){
        Node current=this.head;
        while(current!=null){
            if(current.getData().equals(value)){
                return current;
            }
            else{
                current = current.getNext();
            }
        }
        return null;
    }


}