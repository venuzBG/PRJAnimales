package AnimalEcosistema;
import AnimalClasificacion.Ave;
import AnimalEcosistema.comportamiento.IAccion1;

public class Correcaminos extends Ave implements IAccion1{
    
    public Correcaminos(String nonbre){
        setNombre(nonbre);

    }

    @Override
    public void correr() {
        System.out.println("El correcaminos corre muy rápido");
    }

    @Override
    public String toString(){
        return "\n Clase:" + getClass().getName()
               +"\n nombre: " + getNombre()
               +"\n NroAlas"  + getNroAlas();
    }
}
