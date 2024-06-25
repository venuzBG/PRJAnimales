package AnimalEcosistema;

import java.util.ArrayList;

import AnimalClasificacion.Ave;
import AnimalEcosistema.comportamiento.IAccion1;
import AnimalEcosistema.comportamiento.IAccion2;
import AnimalEcosistema.comportamiento.IAccion3;

public class Pato extends Ave implements IAccion1,IAccion2,IAccion3{

    public Halcon amigoHalcon;

    public Pato(String nombre){
        setNombre(nombre);
        amigoHalcon = new Halcon("Halconsillo");
    }

    @Override
    public String toString(){
        return "\n Clase:" + getClass().getName()
               +"\n nombre: " + getNombre()
               +"\n NroAlas: "  + getNroAlas();
    }

    @Override
    public void nadar() {
        System.out.println("Pato nadando .....");
    }

    @Override
    public void volar() {
        
        System.out.println("Pato volando .....");
    }

    @Override
    public void correr() {
        System.out.println("Pato esta corriendo......");
    }
}
