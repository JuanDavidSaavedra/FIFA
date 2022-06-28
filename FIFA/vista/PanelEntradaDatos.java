/*La FIFA ha solicitado el diseño de una app para registrar la informacion requerida, sobre los 32 países participantes
para la copa mundial de fútbol Qatar 2022. De cada país se debe almacenarse el nombre, el continente al que pertenece,
el número de participaciones en la copa del mundo, el número de copas ganadas, los datos del director técnico actual,
la lista de los 11 jugadores titulares, y la lista de los 11 jugadores suplentes. De cada jugador se tiene que tener
informacion relacionada, con su nombre, apellidos, edad, posición en el equipo y número de goles marcados en copas
mundiales. Implemente el diagrama de clases, y la app usando el patron MVC, "usar arrays".
*/

package vista;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JLabel lbPaises;
    private JComboBox cbPaises;
    private String[] paises = {"Alemania", "Arabia Saudí", "Argentina", "Australia", "Bélgica", "Brasil", "Camerún", "Canadá", "Costa Rica", "Croacia",
    "Dinamarca", "Ecuador", "España", "Estados Unidos", "Francia", "Gales", "Ghana", "Inglaterra", "Irán", "Japón", "Marruecos", "México", "Países Bajos",
    "Polonia", "Portugal", "Qatar", "República de Corea", "Senegal", "Serbia", "Suiza", "Túnez", "Uruguay"};
    private JLabel lbContinentes;
    private JComboBox cbContinentes;
    private String[] continentes = {"Asia", "América", "África", "Europa", "Oceanía"};
    private JLabel lbParticipaciones;
    private JTextField tfParticipaciones;
    private JLabel lbCopas;
    private JTextField tfCopas;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("Qatar.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,30,266,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas
        lbPaises = new JLabel("Países Participantes = ");
        lbPaises.setBounds(276,30,250,30);
        add(lbPaises);
        
        lbContinentes = new JLabel("Continente = ");
        lbContinentes.setBounds(276,80,250,30);
        add(lbContinentes);
        
        lbParticipaciones = new JLabel("Participaciones en la Copa Mundial = ");
        lbParticipaciones.setBounds(276,130,250,30);
        add(lbParticipaciones);

        lbCopas = new JLabel("Copas ganadas = ");
        lbCopas.setBounds(276,180,250,30);
        add(lbCopas);
        
        
        //Creación y adición de campos de texto
        tfParticipaciones = new JTextField();
        tfParticipaciones.setBounds(526, 130, 120, 30);
        add(tfParticipaciones);
        
        tfCopas = new JTextField();
        tfCopas.setBounds(526, 180, 120, 30);
        add(tfCopas);

        cbPaises = new JComboBox();
        for(int i=0; i<paises.length;i++)
        {
            cbPaises.addItem(paises[i]);
        }
        cbPaises.setBounds(526,30,120,30);
        this.add(cbPaises);

        cbContinentes = new JComboBox();
        for(int i=0; i<continentes.length;i++)
        {
            cbContinentes.addItem(continentes[i]);
        }
        cbContinentes.setBounds(526,80,120,30);
        this.add(cbContinentes);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getPaises()
    {
        return (String) cbPaises.getSelectedItem();
    }

    public String getContinentes()
    {
        return (String) cbContinentes.getSelectedItem();
    }

    public String getParticipaciones()
    {
        return tfParticipaciones.getText();
    }
    
    public String getCopas()
    {
        return tfCopas.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfParticipaciones.setText("");
        tfCopas.setText("");
        cbPaises.setSelectedItem("");
        cbContinentes.setSelectedItem("");
    }
}
