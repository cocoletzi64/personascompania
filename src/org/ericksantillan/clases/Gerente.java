package org.ericksantillan.clases;

public class Gerente extends Empelado{
    private double presupuesto;
    //constructor
    public Gerente() {
    }

    public Gerente(String nombre, String apellido) {
        super(nombre, apellido);

    }
    public Gerente(String nombre, String apellido, String numerofiscal, String direccion) {
        super(nombre, apellido, numerofiscal, direccion);
    }
    //getter and setter

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    //metodo

    @Override
    public double getRemuneracion() {
        return super.getRemuneracion();
    }
    //toString

    @Override
    public String toString() {
        return super.toString() +
                "Presupuesto= " + presupuesto;
    }
}
