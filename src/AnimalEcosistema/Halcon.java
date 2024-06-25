package AnimalEcosistema;

import java.util.ArrayList;
import java.util.List;
import AnimalClasificacion.Ave;
import AnimalEcosistema.comportamiento.IAccion2;

public class Halcon extends Ave implements IAccion2{

    public List<Pato> AmigosPatos;
    
    public Halcon(String nombre){
        setNombre(nombre);
        AmigosPatos = new ArrayList<Pato>();
    }

    @Override
    public void volar() {
        System.out.println("Halcon volando");
    }

    @Override
    public String toString(){
        return "\n Clase:" + getClass().getName()
               +"\n nombre: " + getNombre()
               +"\n NroAlas"  + getNroAlas();
    }


}
