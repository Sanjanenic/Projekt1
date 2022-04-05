package at.campus02.nowa;

import java.util.Scanner;

/* Diese Datei NICHT ändern! */

public class Main {
    public static  void main (String[] args){
        Scanner input = new Scanner(System.in);
        App app = new App(input, System.out);  //unsere Program
        app.Run();
        input.close();
        System.out.println("Das Programm wird beendet ...");
    }
}

/* Diese Datei NICHT ändern! */