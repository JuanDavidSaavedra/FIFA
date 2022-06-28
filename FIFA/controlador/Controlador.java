package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Jugador;
import modelo.Pais;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Pais model;
    private Jugador jmodel;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal venPrin, Pais model, Jugador jmodel)
    {
        this.venPrin = venPrin;
        this.model = model;
        this.jmodel = jmodel;
        this.venPrin.miPanelResultados.agregarOyentesBotones(this);
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();

        if(comando.equals("jugador"))
            {   
                venPrin.crearDialogoJugador();
                this.venPrin.miDialogoJugador.agregarOyentesBotones2(this);
            }
        
        if(comando.equals("MostrarInfoPaises"))
        {
            try 
            {
                String pais = venPrin.miPanelEntradaDatos.getPaises();
                String continente = venPrin.miPanelEntradaDatos.getContinentes();
                int participaciones = Integer.parseInt(venPrin.miPanelEntradaDatos.getParticipaciones());
                int copas = Integer.parseInt(venPrin.miPanelEntradaDatos.getCopas());
                model = new Pais(pais, continente, participaciones, copas);
                venPrin.miPanelResultados.mostrarResultado("Datos del equipo: \nPais = " + model.getNomPais() + "\nContinente = " + model.getNomContinente() + "\nParticipaciones = " + model.getNumParticipacionesCopaMundial() + "\nCopas = " + model.getNumCopasGanadas());
                venPrin.miPanelOperaciones.activarBotones();
            
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(comando.equals("aceptar"))
        {
            String nombre = venPrin.miDialogoDirector.getNombre();
            int aniosExp = Integer.parseInt(venPrin.miDialogoDirector.getAniosExp());
            int dia = Integer.parseInt(venPrin.miDialogoDirector.getDia());
            int mes = Integer.parseInt(venPrin.miDialogoDirector.getMes());
            int anio = Integer.parseInt(venPrin.miDialogoDirector.getAnio());
            model.Director(nombre, aniosExp, dia, mes, anio);
            venPrin.miPanelResultados.mostrarResultado("Datos del director: \nNombre = " + model.getNombre() + "\nExperiencia = " + model.getAniosExp() + "\nFecha de nacimiento = " + model.getDia() + "/" + model.getMes() + "/" + model.getAnio());
            venPrin.miDialogoDirector.cerrarDialogo();
        }
        if(comando.equals("aceptar2"))
        {
            String nom = venPrin.miDialogoJugador.getNombre();
            String ap = venPrin.miDialogoJugador.getApellidos();
            int ed = Integer.parseInt(venPrin.miDialogoJugador.getEdad());
            String po = venPrin.miDialogoJugador.getPosicion();
            int nGol = Integer.parseInt(venPrin.miDialogoJugador.getGoles());
            String tJugador = venPrin.miDialogoJugador.getTipoJugador();
            jmodel = new Jugador(tJugador, nom, ap, ed, po, nGol);
            venPrin.miPanelResultados.mostrarResultado("Datos del Jugador: \nNombre = " + jmodel.getNombre() + "\nApellidos = " + jmodel.getApellidos() + "\nEdad = " + jmodel.getEdad() + "\nPosicion = " + jmodel.getPosicionEquipo() + "\nGoles = " + jmodel.getNumGolesMarcadosCopasMundiales() + "\nJuega de " + jmodel.getTipoJugador());
            venPrin.miDialogoJugador.cerrarDialogo();          
        }

        if(comando.equals("director"))
        {   
            venPrin.crearDialogoDirector();
            this.venPrin.miDialogoDirector.agregarOyentesBotones(this);
        }

        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
        }

        if(comando.equals("limpiar"))
        {
            this.venPrin.miPanelResultados.limpiar();
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
        
    }
}