package ejecutable;
import controlador.Controlador;
import modelo.Jugador;
import modelo.Pais;
import vista.VentanaPrincipal;

public class test
{
    public static void main (String[] args)
    {
        VentanaPrincipal venPrin = new VentanaPrincipal();
        Pais model = new Pais("", "", 0, 0);
        Jugador jmodel = new Jugador("", "", "", 0, "", 0);
        Controlador miControlador = new Controlador(venPrin, model, jmodel);
    }  
}
