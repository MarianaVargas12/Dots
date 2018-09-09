public class Node {
 private Node next;
 private Node prev;
 private Object data;

 public Node(Object data){
     this.next=null;
     this.prev=null;
     this.data=data;
 }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
