package at.campus02.nowa.figures;

public abstract class Figure {
    protected int faktor =1;
    protected String[][] symbol = new String[3][3];

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // das ist einen Objekt


        for (int row = 0; row < 3; row++) {
            // For petlja za faktor po duzini/redovima
            for(int i=0; i<faktor; i++) {
                for (int col = 0; col < 3; col++) {
                    // For petlja za faktor po visini/koloni
                    for(int j=0; j<faktor; j++) {
                        sb.append(symbol[col][row]);
                    }
                }
                sb.append('\n');
            }
        }

        return sb.toString();
    }

    public String getSymbol(){

            return "X";

    }
    public String getSymbolEmpty(){


            return " ";

    }
}
