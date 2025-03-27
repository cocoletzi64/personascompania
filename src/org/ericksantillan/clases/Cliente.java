package org.ericksantillan.clases;

public class Cliente extends Persona{
    private int clinteID;
    private static int Idcliente;

    //constructor

    public Cliente() {
        clinteID=++Idcliente;
    }

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    //getter and setter
    public int getClinteID() {
        return clinteID;
    }


    @Override
    public String toString() {
        return super.toString()+
                "clinteID=" + clinteID ;
    }
}
