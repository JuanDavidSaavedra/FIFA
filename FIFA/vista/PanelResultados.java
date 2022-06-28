package vista;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;


public class PanelResultados extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;
    public JButton btLimpiar;

    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelResultados()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20, 560, 280);
        add(spResultado);
       
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);

        //Crear y agrear boton Borrar
        btLimpiar = new JButton("Borrar");
        btLimpiar.setFont(new Font("Arial", BOLD, 12));
        btLimpiar.setBounds(573,130, 80, 30);
        this.add(btLimpiar);
        btLimpiar.setActionCommand("limpiar");
    }
    
    //Mostrar resultado
    public void mostrarResultado(String msg)
    {
        taResultado.append(msg + "\n");
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btLimpiar.addActionListener(pAL);
    }

    //Borrar los resultados
    public void limpiar()
    {
        taResultado.setText("");
    }
}