package datastruct;

public class LinkedList {
    private Node head;
    private int count;

    int size() {
        return count;
    }

    void insert(int value) {
        head = new Node(value, head);
        count++;
    }

    Node find(int value) {
        Node item = head;
        while (item != null && item.getValue() != value) {
            item = item.getNext();
        }
        return item;
    }

    void deleteAt(int index) {
        if (index < count) {
            if (index == 0) {
                head = head.getNext();
            } else {
                Node item = head;
                for (int i = 0; i < index - 1; i++) {
                    item = item.getNext();
                }
                Node removingItem = item.getNext();
                item.setNext(removingItem.getNext());
            }
            count--;
        }
    }

    public void showNodes() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println("Node: " + tempNode.getValue());
            tempNode = tempNode.getNext();
        }
    }

    void clear() {
        head = null;
        count = 0;
    }

    public class Node {
        private int value;
        private Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        int getValue() {
            return value;
        }

        void setValue(int value) {
            this.value = value;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }
    }
}
