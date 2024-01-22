public class FechaTiempo
{
    public static void main(String[] args)
    {
        Fecha fecha = new Fecha(1,3,2023);
        Tiempo tiempo = new Tiempo(8,0,0,fecha);
        tiempo.ticTac();
        System.out.println(fecha);
    }
}