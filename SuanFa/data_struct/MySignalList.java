package data_struct;

public class MySignalList {
    public ListNode head;


    public MySignalList() {
        this.head = null;
    }


    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }

    }
}

