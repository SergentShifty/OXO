public class Game{
	private Player _player1;
	private Player _player2;
	private Board _board;
	private boolean _isFinished;
	private Player _currentPlayer;
	
	public Game(String namePlayer1, String namePlayer2){
		_player1 = new Player(namePlayer1, Piece.RED);
		_player2 = new Player(namePlayer2, Piece.YELLOW);
		_board = new Board();
		_isFinished = false;
		if((int)(Math.random()) == 0) _currentPlayer = _player1;
		else _currentPlayer = _player2;
	}
	
	public String getNamePlayer1(){
		return _player1.getName();
	}
	
	public String getNamePlayer2(){
		return _player2.getName();
	}
	
	public Piece getPieceFromBoard(int y, int x){
		try{
			return _board.getPieceFromBoard(y, x);
		} catch (IllegalArgumentException e) {
			System.err.println("Internal error !\nThe game will end !");
			_isFinished = true;
			return Piece.EMPTY;
		}
	}
	
	public void setPieceToBoard(int y, int x){
		try{
			_board.setPieceToBoard(y, x, _currentPlayer.getPiece());
		} catch (IllegalArgumentException e) {
			System.err.println("Invalid arguments");
		}
	}
	
	public int getLengthBoard(){
		return _board.getBoardLength();
	}
	
	public boolean getIsFinished(){
		return _isFinished;
	}

	@Override
	public String toString(){
		return _board.toString();
	}
}
