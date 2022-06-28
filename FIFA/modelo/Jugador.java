/*La FIFA ha solicitado el diseño de una app para registrar la informacion requerida, sobre los 32 países participantes
para la copa mundial de fútbol Qatar 2022. De cada país se debe almacenarse el nombre, el continente al que pertenece,
el número de participaciones en la copa del mundo, el número de copas ganadas, los datos del director técnico actual,
la lista de los 11 jugadores titulares, y la lista de los 11 jugadores suplentes. De cada jugador se tiene que tener
informacion relacionada, con su nombre, apellidos, edad, posición en el equipo y número de goles marcados en copas
mundiales. Implemente el diagrama de clases, y la app usando el patron MVC, "usar arrays".
*/

package modelo;
public class Jugador
{
    //--------------
    //-- Atributos -
    //--------------
    private String tipoJugador;
    private String nombre;
    private String apellidos;
    private int edad;
    private String posicionEquipo;
    private int numGolesMarcadosCopasMundiales;

    //--------------
    //--- Métodos --
    //--------------
    public Jugador()
    {
        tipoJugador = "";
        nombre = "";
        apellidos = "";
        edad = 0;
        posicionEquipo = "";
        numGolesMarcadosCopasMundiales = 0;
    }

    public Jugador(String tJugador, String nom, String ap, int ed, String po, int nGol)
    {
        tipoJugador = tJugador;
        nombre = nom;
        apellidos = ap;
        edad = ed;
        posicionEquipo = po;
        numGolesMarcadosCopasMundiales = nGol;
    }

    public String getTipoJugador() {
        return tipoJugador;
    }

    public void setTipoJugador(String tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicionEquipo() {
        return posicionEquipo;
    }

    public void setPosicionEquipo(String posicionEquipo) {
        this.posicionEquipo = posicionEquipo;
    }

    public int getNumGolesMarcadosCopasMundiales() {
        return numGolesMarcadosCopasMundiales;
    }

    public void setNumGolesMarcadosCopasMundiales(int numGolesMarcadosCopasMundiales) {
        this.numGolesMarcadosCopasMundiales = numGolesMarcadosCopasMundiales;
    }
}