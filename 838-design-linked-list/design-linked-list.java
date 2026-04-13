class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    int length;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= length) return -1;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        length++;
    }

    public void addAtTail(int val) {
        Node newnode = new Node(val);
        if (tail == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index > length) return; 
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        if (index == length) {
            addAtTail(val);
            return;
        }

        Node newnode = new Node(val);
        Node prev = head;
       
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        newnode.next = prev.next;
        prev.next = newnode;
        length++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) return;

        if (index == 0) {
            head = head.next;
            if (length == 1) tail = null;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
            if (index == length - 1) tail = prev; 
        }
        length--;
    }
}