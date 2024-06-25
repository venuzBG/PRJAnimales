package AnimalClasificacion;

public abstract class Animal {
    private String nombre;

    public Animal(){
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }


}
