package Estructuras;

public class ListaDuenos{
    
    private NodoDueno cabeza;
    private NodoDueno cola;
    private int size;
    
    public ListaDuenos(){
        cabeza=null;
        cola=null;
        size=0;
    }
    
    public NodoDueno getNodo(int index){
        int contador=0;
        NodoDueno temporal=cabeza;
        while(contador<index){
            temporal=temporal.getSiguiente();
            contador++;
        }        
        return temporal;
    }
    
    public boolean isVacia(){
        if(cabeza==null)
            return true;
        else
            return false;
    }
    
    public void addNodoDueno(String nombre){
        if(cabeza==null){
            cabeza=new NodoDueno(nombre);
            cola=cabeza;
        }
        else{
            NodoDueno temp=cabeza;
            NodoDueno nuevo=new NodoDueno(nombre);
            nuevo.linkSiguiente(temp);
            temp.linkAnterior(nuevo);
            cabeza=nuevo;
        }
        size++;
    }
    
    /*
    public void removeNodo(int index){
        if(index==0)
            cabeza=cabeza.getSiguiente();
        else{            
            if(index==size-1)                
                this.getNodo(size-2).linkSiguiente(null);
            else{
                int contador=0;
                NodoDueno temporal=cabeza;
                while(contador<index-1){
                    temporal=temporal.getSiguiente();
                    contador++;
                }
                temporal.linkSiguiente(temporal.getSiguiente().getSiguiente());
            }
        }
        size--;
    }
        
    public void removeTodo(){
        cabeza=null;
        cola=null;
        size=0;
    }

    */
    
    public int getSize(){
        return size;
    }    
}
