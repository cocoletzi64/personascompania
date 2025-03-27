package org.erick.examen;

import org.ericksantillan.clases.*;

public class impresioninstace {
    public static void main(String[] args) {
        Gerente erick=new Gerente("Erick","Santillan","12453","edo.mez, ecatepec, la rosa#64");
        erick.setPresupuesto(150000);
        erick.setRemuneracion(34992);
        erick.setRemuneracion(35000);
        imprimir(erick);

    }
    public static void imprimir(Persona persona){
        System.out.println(persona);
    }

}
