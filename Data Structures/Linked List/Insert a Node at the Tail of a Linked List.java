Node Insert(Node head,int data) {
    Node temp = new Node();
    temp.data = data;
    
    if(head == null){
        head = temp;
        return head;
    }
            
    Node current = head;
    while(current.next != null){
        current = current.next;
    }
    
    current.next = temp;
    return head;
  
}