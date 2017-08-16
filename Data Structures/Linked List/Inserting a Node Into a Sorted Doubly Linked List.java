Node SortedInsert(Node head,int data) {
    
    Node tmp = new Node();
    tmp.data = data;
    
    if(head == null){
        head = tmp;
        return head;
    }
    
    Node curent = head;
    
    while(curent.next != null){
        if(tmp.data < curent.next.data){
            Node x = curent.next;
            x.prev = tmp;
            curent.next = tmp;
            tmp.next = x;
            return head;
        }
        curent = curent.next;
    }
    
    tmp.prev = curent;
    curent.next = tmp;
    
    
    return head; 
}