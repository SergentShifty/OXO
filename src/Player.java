public class Player{
	private String _name;
	private Piece _piece;
	
	public Player(String name, Piece piece){
		_name = name;
		_piece = piece;
	}
	
	public String getName(){
		return _name;
	}
	
	public Piece getPiece(){
		return _piece;
	}
	
	public void setName(String name){
		_name = name;
	}

	@Override
	public String toString(){
		return _name;
	}
}
