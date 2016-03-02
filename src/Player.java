public class Player{
	private String _name;
	private Piece _piece;
	
	public Player(String name, Piece piece){
		if(piece == Piece.EMPTY) throw new IllegalArgumentException("Invalid arguments");
		_name = name;
		_piece = piece;
	}
	
	public String getName(){
		return _name;
	}
	
	public Piece getPiece(){
		return _piece;
	}

	@Override
	public String toString(){
		return _name + " (" + _piece.getColor() + ")";
	}
}
