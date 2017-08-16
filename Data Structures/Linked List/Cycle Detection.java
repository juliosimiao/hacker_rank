boolean hasCycle(Node head) {
    
    if(head == null)
        return false;
    
    ArrayList<Node> visitados = new ArrayList<>();
    
    Node curent = head;
    
    while(curent.next != null){
        for(int i=0;i<visitados.size();i++){
            if(curent.next == visitados.get(i)){
                return true;
            }
        }
        visitados.add(curent);
        curent = curent.next;
    }
    
    return false;

}