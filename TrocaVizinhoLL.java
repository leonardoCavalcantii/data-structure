import java.util.Scanner;
    class TrocaVizinhoLL{

    public static void main(String[] args){
        
        LeoList lista = new LeoList();
        Scanner sc = new Scanner(System.in);
         String[] seq = sc.nextLine().split(" ");
         int x = sc.nextInt();


         for (int i = 0; i < seq.length; i++) {
            lista.addLast(Integer.parseInt(seq[i]));
            }
            
            lista.swap(x);
            
            System.out.println(lista.toString().trim());
         

    
    }

}
class LeoList{
        
        Node head;
        Node tail;

        public void addLast(int x){
            Node node = new Node(x);
            
            if(head == null){
                head = node;
                tail = node;
            
            }else{
                
                tail.next = node;
                node.pre = tail;
                tail = node;

            }

        }

        public void swap(int i){

            Node auxA = head;
            
            for (int j = 0; j < i; j++) {
             auxA = auxA.next;   
            }
            
            Node auxB = auxA.next;
            
            auxA.next = auxB.next;
            auxB.pre = auxA.pre;
            
            if(auxB.next!= null){
                auxB.next.pre = auxA;    
                
            }else{
                tail = auxA;
            }
            
            auxA.pre = auxB;
            auxB.next = auxA;
            
            if(auxB.pre != null){
                auxB.pre.next = auxB;
            
            }else{
                head = auxB;
            
            }

        }
        @Override
        public String toString(){
            
            String lista = "";
            Node aux = head;
            
            while(aux != null){
                lista += aux.value + " ";
                aux = aux.next;

            }
            
            return lista;

        }

    
    
    }


    class Node{
        
        int value;
        Node pre;
        Node next;

        public Node(int x){
            value = x;
        }

    
    }