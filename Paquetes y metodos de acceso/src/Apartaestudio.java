public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;
    /**
     *
     * @param identificadorInmobiliario
     * @param area
     * @param direccion
     * @param numeroHabitaciones
     * @param numeroBaños
     */
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion,int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    @Override
    void imprimir() {
        super.imprimir(); 
        System.out.println();
    }
}
