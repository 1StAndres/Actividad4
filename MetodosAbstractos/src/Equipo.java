import java.util.*;
public class Equipo {
    private String nombre; /* Atributo que define el nombre del equipo
    de ciclismo */
    private static double totalTiempo; /* Atributo que define el tiempo
    total obtenido por el equipo */
    private String pais; /* Atributo que define el pais al que pertenece el
    equipo */
    Vector listaCiclistas; // Atributo que define un vector de objetos ciclista
    /**
    * Constructor de la clase Equipo
    * @param nombre Parámetro que define el nombre del equipo
    * @param pais Parámetro que define el pais del equipo
    */
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
        listaCiclistas = new Vector(); /* Se crea el vector de ciclistas que
        conforma el equipo */
    }
    /**
    * Método que devuelve el nombre del equipo
    * @return El nombre del equipo
    */
    public String getNombre() {
        return nombre;
    }
    /**
    * Método que establece el nombre de un equipo
     * @param nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    * Método que devuelve el pais del equipo
    * @return El pais del equipo
    */
    private String getpais() {
        return pais;
    }
    /**
    * Método que establece el pais de un equipo
    * @param Parámetro que especifica el pais de un equipo
    */
    private void setpais(String pais) {
        this.pais = pais;
    }
    /**
    * Método que añade un ciclista al vector de ciclistas de un equipo
    */
    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
    }
    /**
    * Método que muestra en pantalla los nombres de los ciclistas que
    * conforman un equipo
    */
    void listarEquipo() {
    /* Se recorre el vector de ciclistas y para cada elemento se
    imprime el nombre del ciclista */
    for (int i = 0; i < listaCiclistas.size(); i++) {
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se aplica
        casting para extraer el elemento */
        System.out.println(c.getNombre());
    }
    }
    /**
    * Método que busca un ciclista ingresado por teclado
    */
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in); /* Se solicita texto
        ingresado por teclado */
        String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclistas.size(); i++) { /* Se recorre el vector
        de ciclistas */
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se obtiene
        un elemento del vector */
        if (c.getNombre().equals(nombreCiclista)) { /* Si el nombre
            ingresado se encuentra */
            System.out.println(c.getNombre());
        }
    }
    }
    /**
    * Método que calcula el tiempo total de un equipo acumulando el
    * tiempo obtenido por cada uno de sus ciclistas
    */
    void calcularTotalTiempo() {
    for (int i = 0; i < listaCiclistas.size(); i++) { // Se recorre el vector
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se obtiene
        un elemento del vector */
        // Se acumula el tiempo del ciclista en el tiempo del equipo
        totalTiempo = totalTiempo + c.getTiempoAcumulado();
    }
    }
    /**
    * Método que muestra en pantalla los datos de un equipo
    */
    void imprimir() {
    System.out.println("Nombre del equipo = " + nombre);
    System.out.println("País = " + pais);
    System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}
