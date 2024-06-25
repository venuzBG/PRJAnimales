package AnimalEcosistema;

import AnimalClasificacion.Mamifero;
import AnimalEcosistema.comportamiento.IAccion1;
import AnimalEcosistema.comportamiento.IAccionCarnivora;

public class Leon extends Mamifero implements IAccion1,IAccionCarnivora{

    public Pato alimentoPatuno;

    public Leon(String nombre){
        setNombre(nombre);
        alimentoPatuno = new Pato("Lucas");
    }

    @Override
    public String toString(){
        return "\n Clase:" + getClass().getName()
               +"\n nombre: " + getNombre();
    }

    @Override
    public void comer() {
       System.out.println("El león come ");
    }

    @Override
    public void comer(Pato alimentoPatuno) {
        System.out.println("Leon come pato : " + alimentoPatuno.toString());
    }

    @Override
    public void correr() {
        System.out.println("leon corre ....");
    }
}
