public class Board{
	private Piece[][] _board;
	
	public Board(){
		_board = new Piece[3][3];
		for(int y = 0; y < _board.length; y++){
			for(int x = 0; x < _board.length; x++){
				_board[y][x] = Piece.EMPTY;
			}
		}
	}
	
	public Piece getPieceFromBoard(int y, int x){
		if(y < 0 || x < 0 || y >= _board.length || x >= _board.length){
			throw new IllegalArgumentException("Invalid arguments");
		} else {
			return _board[y][x];
		}
	}
	
	public void setBoard(int y, int x, Piece piece){
		if(y < 0 || x < 0 || y >= _board.length || x >= _board.length){
			throw new IllegalArgumentException("Invalid arguments");
		} else {
			_board[y][x] = piece;
		}
	}

	@Override
	public String toString(){
		String text = "";
		for(int y = 0; y < _board.length; y++){
			for(int x = 0; x < _board.length; x++){
				text += _board[y][x] + " ";
			}
			if(y < _board.length - 1) text += "\n";
		}
		return text;
	}
}
