/*La FIFA ha solicitado el diseño de una app para registrar la informacion requerida, sobre los 32 países participantes
para la copa mundial de fútbol Qatar 2022. De cada país se debe almacenarse el nombre, el continente al que pertenece,
el número de participaciones en la copa del mundo, el número de copas ganadas, los datos del director técnico actual,
la lista de los 11 jugadores titulares, y la lista de los 11 jugadores suplentes. De cada jugador se tiene que tener
informacion relacionada, con su nombre, apellidos, edad, posición en el equipo y número de goles marcados en copas
mundiales. Implemente el diagrama de clases, y la app usando el patron MVC, "usar arrays".
*/

package vista;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoJugador extends JDialog
{
    //Atributos
    private JLabel lbTitulo;
    private JLabel lbSelecTipoJugador;
    private JLabel lbNombre;
    private JLabel lbApellidos;
    private JLabel lbEdad;
    private JLabel lbPosicionEquipo;
    private JLabel lbGolesMarcadosCopasMundiales;
    private JTextField txNombre;
    private JTextField txApellidos;
    private JTextField txEdad;
    private JTextField txGolesMarcadosCopasMundiales;
    private JComboBox cbPosicionEquipo;
    private JComboBox cbSelecTipoJugador;
    private String[] posiciones = {"Portero", "Central Derecho", "Central Izquierdo","Lateral Izquierdo","Lateral Derecho","Mediocentro","Interior Izquierdo",
    "Interior Derecho", "Extremo Izquierdo","Extremo Derecho"};
    private String[] seleccionar = {"Titular", "Suplente"};
    private JButton btAceptar;

    public DialogoJugador()
    {
        //Definición del contenedor de la ventana
        setLayout(null);

        //Creación y adición de elementos
        lbTitulo = new JLabel("Datos Jugador",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setBounds(150,5,300,40);
        add(lbTitulo);

        lbNombre= new JLabel("Nombre = ",JLabel.RIGHT);
        lbNombre.setFont(new Font("Arial", Font.BOLD, 15));
        lbNombre.setBounds(10,50,80,20);
        add(lbNombre);

        lbApellidos = new JLabel("Apellidos = ",JLabel.RIGHT);
        lbApellidos.setFont(new Font("Arial", Font.BOLD, 15));
        lbApellidos.setBounds(10,80,90,20);
        add(lbApellidos);

        lbEdad = new JLabel("Edad = ",JLabel.RIGHT);
        lbEdad.setFont(new Font("Arial", Font.BOLD, 15));
        lbEdad.setBounds(10,110,60,20);
        add(lbEdad);

        lbPosicionEquipo = new JLabel("Posicion = ",JLabel.RIGHT);
        lbPosicionEquipo.setFont(new Font("Arial", Font.BOLD, 15));
        lbPosicionEquipo.setBounds(10,140,85,20);
        add(lbPosicionEquipo);

        lbGolesMarcadosCopasMundiales = new JLabel("Goles = ",JLabel.RIGHT);
        lbGolesMarcadosCopasMundiales.setFont(new Font("Arial", Font.BOLD, 15));
        lbGolesMarcadosCopasMundiales.setBounds(15,170,60,20);
        add(lbGolesMarcadosCopasMundiales);

        lbSelecTipoJugador = new JLabel("Seleccionar = ",JLabel.RIGHT);
        lbSelecTipoJugador.setFont(new Font("Arial", Font.BOLD, 15));
        lbSelecTipoJugador.setBounds(300,50,130,20);
        add(lbSelecTipoJugador);

        txNombre = new JTextField();
        txNombre.setFont(new Font("Arial", Font.BOLD, 15));
        txNombre.setBounds(110,50,140,20);
        add(txNombre);

        txApellidos = new JTextField();
        txApellidos.setFont(new Font("Arial", Font.BOLD, 15));
        txApellidos.setBounds(110,80,140,20);
        add(txApellidos);

        txEdad = new JTextField();
        txEdad.setFont(new Font("Arial", Font.BOLD, 15));
        txEdad.setBounds(110,110,30,20);
        add(txEdad);

        cbPosicionEquipo = new JComboBox();
        for(int i=0; i<posiciones.length;i++)
        {
            cbPosicionEquipo.addItem(posiciones[i]);
        }
        cbPosicionEquipo.setBounds(110,140,180,20);
        this.add(cbPosicionEquipo);

        cbSelecTipoJugador = new JComboBox();
        for(int i=0; i<seleccionar.length;i++)
        {
            cbSelecTipoJugador.addItem(seleccionar[i]);
        }
        cbSelecTipoJugador.setBounds(440,50,80,20);
        this.add(cbSelecTipoJugador);

        txGolesMarcadosCopasMundiales = new JTextField();
        txGolesMarcadosCopasMundiales.setFont(new Font("Arial", Font.BOLD, 15));
        txGolesMarcadosCopasMundiales.setBounds(110,170,30,20);
        add(txGolesMarcadosCopasMundiales);


        // Creación de botón aceptar
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 25));
        btAceptar.setBounds(200,220,200,25);
        btAceptar.setActionCommand("aceptar2");
        add(btAceptar);

        //Caracteristicas de la ventana
        setTitle("Datos Jugador");
        setSize(600,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public String getNombre()
    {
        return txNombre.getText();
    }

    public String getApellidos()
    {
        return txApellidos.getText();
    }

    public String getEdad()
    {
        return txEdad.getText();
    }

    public String getPosicion()
    {
        return (String) cbPosicionEquipo.getSelectedItem();
    }

    public String getTipoJugador()
    {
        return (String) cbSelecTipoJugador.getSelectedItem();
    }

    public String getGoles()
    {
        return txGolesMarcadosCopasMundiales.getText();
    }

    public void agregarOyentesBotones2(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }         
}

