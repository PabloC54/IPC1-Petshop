package Estructuras;

public class NodoMascota {
    
    private String nombre;
    private String raza;
    private int edad;
    private ListaDuenos duenos;
    
    private NodoMascota siguiente;
    
    public NodoMascota(String nombre, String raza, int edad, ListaDuenos duenos){  //Constructor
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
        this.duenos=duenos;
        this.siguiente=null;
    }
        
    public String getNombre(){
        return nombre;
    }
        
    public String getRaza(){
        return raza;
    }
        
    public int getEdad(){
        return edad;
    }
        
    public ListaDuenos getDuenos(){
        return duenos;
    }
    
    public void linkSiguiente(NodoMascota n){   //Apunta al siguiente NodoMascota
        siguiente=n;
    }
    
    public NodoMascota getSiguiente(){  //Obtiene el siguiente NodoMascota
        return siguiente;
    }        
}