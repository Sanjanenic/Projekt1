package at.campus02.nowa.figures;

public class FigureO2 extends Figure {
    public FigureO2(int size) {
        faktor = size;

        symbol[0][0] = getSymbolEmpty();
        symbol[1][0] = getSymbol();
        symbol[2][0] = getSymbolEmpty();

        symbol[0][1] = getSymbol();
        symbol[1][1] = getSymbolEmpty();
        symbol[2][1] = getSymbol();

        symbol[0][2] = getSymbolEmpty();
        symbol[1][2] = getSymbol();
        symbol[2][2] = getSymbolEmpty();
    }
}

