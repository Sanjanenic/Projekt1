package at.campus02.nowa.figures;

public class FigureH extends Figure {
    public FigureH(int size) {

        faktor=size;

        symbol[0][0] = getSymbol();
        symbol[1][0] = getSymbolEmpty();
        symbol[2][0] = getSymbol();

        symbol[0][1] = getSymbol();
        symbol[1][1] = getSymbol();
        symbol[2][1] = getSymbol();

        symbol[0][2] = getSymbol();
        symbol[1][2] = getSymbolEmpty();
        symbol[2][2] = getSymbol();
    }
}
