Node Delete(Node head, int position) {
    
    if(head == null)
        return head;
    
    if(position == 0){
        Node prox = head.next;
        head.next = null;
        head = prox;
        return head;
    }
    
    Node curent = head;
    int count = 0;
    
    while(count < position -1){
        curent = curent.next;
        count++;
    }
    
    Node delete = curent.next;
    Node ahead = delete.next;
    curent.next = ahead;

    return head;
}