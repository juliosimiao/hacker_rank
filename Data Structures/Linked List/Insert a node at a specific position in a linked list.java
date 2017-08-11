Node InsertNth(Node head, int data, int position) {
    
    Node tmp = new Node();
    tmp.data = data;
    
    if(head == null){
        head = tmp;
        return head;
    }
    
    if(position == 0){
        tmp.next = head;
        return tmp;
    }
    
    int count = 0;
    Node curent = head;
    
    while(count < position - 1){
        curent = curent.next;
        count++;
    }
    
    tmp.next = curent.next;
    curent.next = tmp;
    
    return head;
    
}