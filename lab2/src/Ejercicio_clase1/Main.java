package Ejercicio_clase1;
public class Main {

    public static void main(String[] args) {
//Construyo los objetos
        Persona p0 = new Persona("Emilio",60,EstadoCivil.CASADO);

        Persona p1 = new Persona("Maria ",58,EstadoCivil.CASADO);

        Persona p2 = new Persona(" Juancito ",30,EstadoCivil.SOLTERO);

//Le agrego juancito como hijo al padre
        p0.agregarHijos(p2);
//Le agrego juancito como hijo a la madre
        p1.agregarHijos(p2);
//Le agrego los pardres a juancito
        p2.agregarPadre(p0);
        p2.agregarPadre(p1);

//primero extrae el nombre del padre, después busca al hijo en la lista de hijos y le busca un nombre.(get(0)) es la manera de invocar en una lista
        System.out.println(" Soy "+p0.getNombre()+ " tengo un hijo que se llama "+p0.getHijos().get(0).getNombre());
        System.out.println(" Soy "+p1.getNombre()+ " tengo un hijo que se llama "+p1.getHijos().get(0).getNombre());
//primero busca el nombre del juancito
        System.out.println("Soy "+p2.getNombre()+ " y mis padres son ");
//extrae los nombres de los padres en la array de padres. ([0] es la manera de buscar los padres en un array)
        System.out.println(p2.getPadres()[0].getNombre());
        System.out.println(p2.getPadres()[1].getNombre());



    }
}
