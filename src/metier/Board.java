public class Board{
	private Piece[][] _board;
	
	public Board(){
		_board = new Piece[3][3];
		for(int y = 0; y < _board.length; y++)
			for(int x = 0; x < _board.length; x++)
				_board[y][x] = Piece.EMPTY;
	}
	
	public Piece getPieceFromBoard(int y, int x){
		if(y < 0 || x < 0 || y >= _board.length || x >= _board.length){
			throw new IllegalArgumentException("Invalid arguments");
		} else return _board[y][x];
	}
	
	public boolean setPieceToBoard(int y, int x, Piece piece){
		if(y < 0 || x < 0 || y >= _board.length || x >= _board.length){
			throw new IllegalArgumentException("Invalid arguments");
		}else if(_board[y][x] == piece.EMPTY){
			_board[y][x] = piece;
			return true;
		}else return false;
	}
	
	public int getBoardLength(){
		return _board.length;
	}
	
	public boolean isBoardFull(){
		for(int y = 0; y < _board.length; y++)
			for(int x = 0; x < _board.length; x++)
				if(_board[y][x] == Piece.EMPTY)
					return false;
		return true;
	}
	
	public Piece isWinnerHorizontal(){
		boolean finish;
		for(int y = 0; y < _board.length; y++){
			finish = true;
			for(int x = 1; x < _board.length; x++){
				if(_board[y][x] != _board[y][0]) finish = false;
			}
			if(finish) return _board[y][0];
		}
		return Piece.EMPTY;
	}
	
	public Piece isWinnerVertical(){
		boolean finish;
		for(int x = 0; x < _board.length; x++){
			finish = true;
			for(int y = 1; y < _board.length; y++){
				if(_board[y][x] != _board[0][x]) finish = false;
			}
			if(finish) return _board[0][x];
		}
		return Piece.EMPTY;
	}
	
	public Piece isWinnerDiagonal(){
		boolean finish = true;
		boolean finishAnti = true;
		for(int i = 1; i < _board.length; i++){
			if(_board[i][i] != _board[0][0]){
				finish = false;
			}
		}
		if(finish) return _board[0][0];
		for(int i = 1; i < _board.length; i++){
			if(_board[i][i - _board.length - 1] != _board[0][_board.length - 1]){
				finishAnti = false;
			}
		}
		if(finishAnti) return _board[0][0];
		return Piece.EMPTY;
	}
	
	public Piece isWinner(){
		Piece horizontal = isWinnerHorizontal();
		Piece vertical = isWinnerVertical();
		Piece diagonal = isWinnerDiagonal();
		if(horizontal != Piece.EMPTY) return horizontal;
		if(vertical != Piece.EMPTY) return vertical;
		if(diagonal != Piece.EMPTY) return diagonal;
		return Piece.EMPTY;
	}

	@Override
	public String toString(){
		String text = "";
		for(int y = 0; y < _board.length; y++){
			for(int x = 0; x < _board.length; x++)
				text += _board[y][x] + " ";
			if(y < _board.length - 1) text += "\n";
		}
		return text;
	}
}
