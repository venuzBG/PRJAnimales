import AnimalEcosistema.Leon;
import AnimalEcosistema.Pato;

public class App {
    public static void main(String[] args) throws Exception {
        Pato p = new Pato("Donals");
        Leon l = new Leon("Simba");
        System.out.println(p.toString());
        System.out.println(l.toString());
        l.comer(l.alimentoPatuno);
        
    }
}
