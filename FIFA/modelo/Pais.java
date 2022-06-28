/*La FIFA ha solicitado el diseño de una app para registrar la información requerida, sobre los 32 países participantes
para la copa mundial de fútbol Qatar 2022. De cada país se debe almacenarse el nombre, el continente al que pertenece,
el número de participaciones en la copa del mundo, el número de copas ganadas, los datos del director técnico actual,
la lista de los 11 jugadores titulares, y la lista de los 11 jugadores suplentes. De cada jugador se tiene que tener
información relacionada, con su nombre, apellidos, edad, posición en el equipo y número de goles marcados en copas
mundiales. Implemente el diagrama de clases, y la app usando el patrón MVC, "usar arrays".
*/

package modelo;
public class Pais
{
    //--------------
    //-- Atributos -
    //--------------
    private String nomPais;
    private String nomContinente;
    private int numParticipacionesCopaMundial;
    private int numCopasGanadas;
    private String nombre;
    private int aniosExp;
    private int dia;
    private int mes;
    private int anio;

    //--------------
    //--- Métodos --
    //--------------


    public Pais()
    {
        nomPais = "";
        nomContinente = "";
        numParticipacionesCopaMundial = 0;
        numCopasGanadas = 0;
    }

    public Pais(String nomP, String nomCont, int numPartCopMund, int numCopGan)
    {
        nomPais = nomP;
        nomContinente = nomCont;
        numParticipacionesCopaMundial = numPartCopMund;
        numCopasGanadas = numCopGan;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }

    public String getNomContinente() {
        return nomContinente;
    }

    public void setNomContinente(String nomContinente) {
        this.nomContinente = nomContinente;
    }

    public int getNumParticipacionesCopaMundial() {
        return numParticipacionesCopaMundial;
    }

    public void setNumParticipacionesCopaMundial(int numParticipacionesCopaMundial) {
        this.numParticipacionesCopaMundial = numParticipacionesCopaMundial;
    }

    public int getNumCopasGanadas() {
        return numCopasGanadas;
    }

    public void setNumCopasGanadas(int numCopasGanadas) {
        this.numCopasGanadas = numCopasGanadas;
    }

    public void Director(String nombre, int aniosExp, int dia, int mes, int anio)
    {
        this.nombre = nombre;
        this.aniosExp = aniosExp;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}