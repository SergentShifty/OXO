public enum Piece{
	RED("X", "red"),
	YELLOW("O", "yellow"),
	EMPTY(".", "empty");
	
	private String _print;
	private String _color;
	
	public Piece(String print, String color){
		_print = print;
		_color = color;
	}
	
	public String getColor(){
		return _color;
	}

	@Override
	public String toString(){
		return _print;
	}
}
