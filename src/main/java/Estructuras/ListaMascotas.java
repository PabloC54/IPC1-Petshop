package Estructuras;

public class ListaMascotas{
    
    private NodoMascota cabeza;
    private int size;
    
    public ListaMascotas(){
        cabeza=null;
        size=0;
    }
    
    public NodoMascota getNodoMascota(int index){
        int contador=0;
        NodoMascota temporal=cabeza;
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
    
    public void addNodoMascota(String nombre,String raza,int edad, ListaDuenos duenos){
        if(cabeza==null)
            cabeza=new NodoMascota(nombre,raza,edad,duenos);        
        else{
            NodoMascota temp=cabeza;
            NodoMascota nuevo=new NodoMascota(nombre,raza,edad,duenos);
            nuevo.linkSiguiente(temp);
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
                this.getNodoMascota(size-2).linkSiguiente(null);
            else{
                int contador=0;
                NodoMascota temporal=cabeza;
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
        size=0;
    }
    
    */
    
    public int getSize(){
        return size;
    }
}
