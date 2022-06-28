package vista;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton btCalcularPlan;
    public JButton btJugador;
    public JButton btDirector;
    public JButton btBorrar;
    public JButton btSalir;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        btCalcularPlan = new JButton("Mostrar info pais");
        btCalcularPlan.setFont(new Font("Arial", BOLD, 12));
        btCalcularPlan.setBounds(10, 30, 140, 30);
        add(btCalcularPlan);
        btCalcularPlan.setActionCommand("MostrarInfoPaises");

        btJugador = new JButton("Mostrar info jugador");
        btJugador.setFont(new Font("Arial", BOLD, 12));
        btJugador.setBounds(160, 30, 150, 30);
        add(btJugador);
        btJugador.setActionCommand("jugador");

        btDirector = new JButton("Mostrar info director");
        btDirector.setFont(new Font("Arial", BOLD, 12));
        btDirector.setBounds(320, 30, 160, 30);
        add(btDirector);
        btDirector.setActionCommand("director");

        //Crear y agrear boton Borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setFont(new Font("Arial", BOLD, 12));
        btBorrar.setBounds(490, 30, 80, 30);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        //Crear y agrear boton Salir
        btSalir = new JButton("Salir");
        btSalir.setFont(new Font("Arial", BOLD, 12));
        btSalir.setBounds(580, 30, 70, 30);
        this.add(btSalir);
        btSalir.setActionCommand("salir");
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btCalcularPlan.addActionListener(pAL);
        btDirector.addActionListener(pAL);
        btJugador.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
    
    public void activarBotones()
    {
        btCalcularPlan.setEnabled(true);
        btDirector.setEnabled(true);
        btJugador.setEnabled(true);
        btBorrar.setEnabled(true);
        btSalir.setEnabled(true);
    }
}
