package cl.santotomas.tarjetadecredito;

public class CardClass {
    private String Nombre;
    private String Apellido;
    private String NumTarjeta;
    private String Mes;
    private String Ano;
    private String codigo;
    private String CalleNum;
    private String Ciudad;
    private String Estado;
    private String CodigoPostal;

    public CardClass(String nombre, String apellido, String numTarjeta, String mes, String ano, String codigo, String calleNum, String ciudad, String estado, String codigoPostal) {
        Nombre = nombre;
        Apellido = apellido;
        NumTarjeta = numTarjeta;
        Mes = mes;
        Ano = ano;
        this.codigo = codigo;
        CalleNum = calleNum;
        Ciudad = ciudad;
        Estado = estado;
        CodigoPostal = codigoPostal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNumTarjeta() {
        return NumTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        NumTarjeta = numTarjeta;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCalleNum() {
        return CalleNum;
    }

    public void setCalleNum(String calleNum) {
        CalleNum = calleNum;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        CodigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "CardClass{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", NumTarjeta='" + NumTarjeta + '\'' +
                ", Mes='" + Mes + '\'' +
                ", Ano='" + Ano + '\'' +
                ", codigo='" + codigo + '\'' +
                ", CalleNum='" + CalleNum + '\'' +
                ", Ciudad='" + Ciudad + '\'' +
                ", Estado='" + Estado + '\'' +
                ", CodigoPostal='" + CodigoPostal + '\'' +
                '}';
    }
}
