package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;  // wen setze auch true Program beendet
    private int figureNr;
    private int figureGrosse;
    private Figure figure;

    // Konstruktor
    // input wird verwendet um Daten vom Benutzer einzulesen (verwendet scanner)
    // output wird verwendet um Text auf der Konsole auszugeben (verwendet sysout)
    public App(Scanner input, PrintStream output){
        this.input = input;
        this.output = output;
    }

    //die Gameloop
    public void Run() {
        initialize();  //karte erzeugen,spieler anlegen ->das mach mn nur einmal
        printState(); //dan get es los mit spiel

        while(!exit) {
            readUserInput();  //lesen imput
            updateState(); //verarbeiten imput
            printState();  //ausgeben
        }
    }

    private void initialize() {
        //TODO: Initialisierungen hier durchführen
    }

    private void readUserInput() {  //solte ienlesen was solle ich tun
        //TODO: Alle Eingaben der Benutzer einlesen
        inputFigure();
    }

    private void updateState() {
        //TODO: Benutzereingaben verarbeiten

        switch (figureNr){
            case 1:
                figure = new FigureH(figureGrosse);
                break;
            case 2:
            figure = new FigureL(figureGrosse);
            break;
            case 3:
                figure = new FigureO(figureGrosse);
                break;
            case 4:
                figure = new FigureO2(figureGrosse);
                break;
            case 5:
                figure = new FigureI(figureGrosse);
                break;
            case 6:
                figure = new FigureMinus(figureGrosse);
                break;
            default: break;
        }
    }

    private void printState() {
        //TODO: Ausgabe des aktuellen Zustands
        if (figure != null){
            output.println(figure);
        }
    }

    private void inputFigure() {
        // Hier sehen Sie ein Pattern für Benutzereingaben
        // Solange kein gültiger Wert eingegeben wurde, wird die Eingabe wiederholt
        do {
            output.println("Welche Grafik möchten Sie anzeigen (1-6)");
            figureNr = input.nextInt();
            if (figureNr < 1 || figureNr > 6) {
                output.println("Dies ist keine gültige Grafik!");
            }

            output.println("Grosse (1-3)");
            figureGrosse = input.nextInt();
            break;
        } while (true);
    }
}
