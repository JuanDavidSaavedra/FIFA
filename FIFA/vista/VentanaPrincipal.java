package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoDirector miDialogoDirector;
    public DialogoJugador miDialogoJugador;


    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,660,250);
        add(miPanelEntradaDatos);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,260,660,80);
        add(miPanelOperaciones);
        
        //Creación y adición del PanelOperaciones
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,340,660,310);
        add(miPanelResultados);
        
        //Caracteristicas de la ventana
        setTitle("Lista de paises participantes Copa Mundial de Fútbol Qatar 2022");
        setSize(700,700);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    //Crear ventana dialogo Mover
    public void crearDialogoJugador()
    {
        miDialogoJugador = new DialogoJugador();
    }

    public void crearDialogoDirector()
    {
        miDialogoDirector = new DialogoDirector();
    }
}