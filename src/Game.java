public class Game{
	private Player _player1;
	private Player _player2;
	private Board _board;
	private boolean _isFinished;
	
	public Game(String namePlayer1, String namePlayer2){
		_player1 = new Player(namePlayer1);
		_player2 = new Player(namePlayer2);
		_board = new Board();
		_isFinished = false;
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
			System.err.println("Internal error !");
			_isFinished = true;
			return Piece.EMPTY;
		}
	}

	@Override
	public String toString(){
		return _board.toString();
	}
}
