package org.ericksantillan.clases;

public class Persona {
    private String  nombre;
    private String apellido;
    private String numerofiscal;
    private String direccion;
    //constructor
    public Persona() {

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, String numerofiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerofiscal = numerofiscal;
        this.direccion = direccion;
    }

    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumerofiscal() {
        return numerofiscal;
    }

    public void setNumerofiscal(String numerofiscal) {
        this.numerofiscal = numerofiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //tostring

    @Override
    public String toString() {
        return
                "Nombre= " + nombre + '\n' +
                "Apellido= " + apellido + '\n' +
                "Numerofiscal= " + numerofiscal + '\n' +
                "Direccion= " + direccion+"\n"
                ;
    }
}
