package Estructuras;

public class NodoDueno {
    
    private String nombre;
    private NodoDueno siguiente;
    private NodoDueno anterior;
    
    public NodoDueno(String nombre){  //Constructor
        this.nombre=nombre;
        this.siguiente=this;
    }
        
    public String getNombre(){   //Regresa el valor 1 de un nodo
        return nombre;
    }
        
    public void setNombre(String nombre){   //Regresa el valor 1 de un nodo
        this.nombre=nombre;
    }
    
    public void linkSiguiente(NodoDueno n){   //Apunta al siguiente nodo
        siguiente=n;
    }    
        
    public void linkAnterior(NodoDueno n){   //Apunta al anterior nodo
        anterior=n;
    }
    
    public NodoDueno getSiguiente(){  //Obtiene el siguiente nodo
        return siguiente;
    }      
    
    public NodoDueno getAnterior(){  //Obtiene el siguiente nodo
        return anterior;
    }    
}