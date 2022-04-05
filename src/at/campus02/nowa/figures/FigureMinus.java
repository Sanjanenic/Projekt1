package at.campus02.nowa.figures;

public class FigureMinus extends Figure {
    public FigureMinus(int size) {
        faktor = size;

        symbol[0][0] = getSymbolEmpty();
        symbol[1][0] = getSymbolEmpty();
        symbol[2][0] = getSymbolEmpty();

        symbol[0][1] = getSymbol();
        symbol[1][1] = getSymbol();
        symbol[2][1] = getSymbol();

        symbol[0][2] = getSymbolEmpty();
        symbol[1][2] = getSymbolEmpty();
        symbol[2][2] = getSymbolEmpty();
    }


}
