package org.ericksantillan.clases;

public class Empelado extends Persona {
    private double remuneracion;
    private int empleadoID;
    private static int iDcont;
    //constructor
    public Empelado() {
        this.empleadoID=++iDcont;
    }

    public Empelado(String nombre, String apellido) {
        super(nombre, apellido);
        this.empleadoID=++iDcont;
    }

    public Empelado(String nombre, String apellido, String numerofiscal, String direccion) {
        super(nombre, apellido, numerofiscal, direccion);
        this.empleadoID=++iDcont;
    }
    //getter and setter

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    //metodo
    public double remunera(double porcentaje){
    return (remuneracion*porcentaje)/100;
    }
    //toString

    @Override
    public String toString() {
        return super.toString() +
                "EmpleadoID= " + empleadoID+"\n"+
                "Remuneracion= "+remunera(20)+"\n";
    }
}


