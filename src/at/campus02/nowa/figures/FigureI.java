package at.campus02.nowa.figures;

public class FigureI extends Figure {
    public FigureI(int size) {
        faktor = size;

        symbol[0][0] = getSymbolEmpty();
        symbol[1][0] = getSymbol();
        symbol[2][0] = getSymbolEmpty();

        symbol[0][1] = getSymbolEmpty();
        symbol[1][1] = getSymbol();
        symbol[2][1] = getSymbolEmpty();

        symbol[0][2] = getSymbolEmpty();
        symbol[1][2] = getSymbol();
        symbol[2][2] = getSymbolEmpty();
    }
}
