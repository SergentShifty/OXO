public enum Piece{
	RED("X"),
	YELLOW("O"),
	EMPTY(".");
	
	private String _print;
	
	public Piece(String print){
		_print = print;
	}

	@Override
	public String toString(){
		return _print;
	}
}
