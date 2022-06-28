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
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoDirector extends JDialog
{
    //----------------------
    //Atributos
    //----------------------
    private JLabel lbTitulo;
    private JLabel lbNombre;
    private JLabel lbAniosExp;
    private JLabel lbFechaNac;
    private JLabel lbDia;
    private JLabel lbMes;
    private JLabel lbAnio;
    private JTextField txNombre;
    private JTextField txAniosExp;
    private JTextField txDia;
    private JTextField txMes;
    private JTextField txAnio;
    private JButton btAceptar;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public DialogoDirector()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del elementos
        lbTitulo = new JLabel("Datos del director",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 15));
        lbTitulo.setBounds(0,10,600,20);
        add(lbTitulo);
        
        lbNombre= new JLabel("Nombre y apellidos = ",JLabel.LEFT);
        lbNombre.setFont(new Font("Arial", Font.BOLD, 15));
        lbNombre.setBounds(10,50,300,20);
        add(lbNombre);

        txNombre= new JTextField();
        txNombre.setFont(new Font("Arial", Font.BOLD, 15));
        txNombre.setBounds(250,50,200,20);
        add(txNombre);
        
        lbAniosExp= new JLabel("Años de experiencia = ",JLabel.LEFT);
        lbAniosExp.setFont(new Font("Arial", Font.BOLD, 15));
        lbAniosExp.setBounds(10,90,300,20);
        add(lbAniosExp);

        txAniosExp= new JTextField();
        txAniosExp.setFont(new Font("Arial", Font.BOLD, 15));
        txAniosExp.setBounds(250,90,50,20);
        add(txAniosExp);

        lbFechaNac= new JLabel("Fecha de nacimiento = ",JLabel.LEFT);
        lbFechaNac.setFont(new Font("Arial", Font.BOLD, 15));
        lbFechaNac.setBounds(10,130,200,20);
        add(lbFechaNac);

        lbDia= new JLabel("Dia",JLabel.LEFT);
        lbDia.setFont(new Font("Arial", Font.BOLD, 15));
        lbDia.setBounds(250,130,40,20);
        add(lbDia);

        txDia= new JTextField();
        txDia.setFont(new Font("Arial", Font.BOLD, 15));
        txDia.setBounds(290,130,40,20);
        add(txDia);

        lbMes= new JLabel("Mes",JLabel.LEFT);
        lbMes.setFont(new Font("Arial", Font.BOLD, 15));
        lbMes.setBounds(350,130,40,20);
        add(lbMes);

        txMes= new JTextField();
        txMes.setFont(new Font("Arial", Font.BOLD, 15));
        txMes.setBounds(390,130,40,20);
        add(txMes);

        lbAnio= new JLabel("Año",JLabel.LEFT);
        lbAnio.setFont(new Font("Arial", Font.BOLD, 15));
        lbAnio.setBounds(450,130,40,20);
        add(lbAnio);

        txAnio= new JTextField();
        txAnio.setFont(new Font("Arial", Font.BOLD, 15));
        txAnio.setBounds(490,130,40,20);
        add(txAnio);
        
        // Creación de botón aceptar
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 15));
        btAceptar.setBounds(250,190,100,30);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);
               
        //Caracteristicas de la ventana
        setTitle("Director");
        setSize(600,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public String getNombre()
    {
        return txNombre.getText();
    }
    
    public String getAniosExp()
    {
        return txAniosExp.getText();
    }

    public String getDia()
    {
        return txDia.getText();
    }

    public String getMes()
    {
        return txMes.getText();
    }

    public String getAnio()
    {
        return txAnio.getText();
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }   
}