public abstract class ChessPiece {
    private String color;
    public boolean check = true;

    public ChessPiece(String color) {}

    public String getColor() {
        return this.color;
    }

    public abstract boolean canMoveToPosition(
        ChessBoard chessBoard,
        int line,
        int column,
        int toLine,
        int toColumn
    );

    public abstract String getSymbol();
}
