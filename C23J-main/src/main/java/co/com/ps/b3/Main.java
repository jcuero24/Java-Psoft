package co.com.ps.b3;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Colombiano colombiano = new Colombiano("1117017109","Juan","Cuero","CC","o-");
        System.out.println(colombiano.getNombre());
        colombiano.setNombre("Juanda");
        System.out.println(colombiano.getNombre());

        System.out.println(colombiano.getApellido());

// <---------------------------------------------------------------------------------->

        int edad=18;
        double fracciones =1.2;
        boolean esVerdad=false;
        short numeros=60;
        char letra='a';
        Integer edad2=20;
        Boolean esFalso=false;


        Date fecha = new Date();
        LocalDate fechaLocal= LocalDate.now();
        System.out.println(edad);

    }

}
