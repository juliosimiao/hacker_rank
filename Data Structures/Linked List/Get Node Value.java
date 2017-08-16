int GetNode(Node head,int n) {
     
    Node curent = head;
    Node last = head;
    int size = 0;
    
    while(curent.next != null){
        curent = curent.next;
        size++;
    }

    if(n==0)
        return curent.data;
    
    int p = size - n;
    int i=0;
    while(i != p){
        last = last.next;
        i++;
    }
    
    return last.data;

}