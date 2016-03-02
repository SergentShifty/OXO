public class Main{
	public static void main(String[] args){
		Game game = new Game("Mehdi", "Maurad");
		System.out.println("=====================");
		System.out.println("======== OXO ========");
		System.out.println("=====================\n");
		System.out.println(game);
		while(!game.getIsFinished()){
			game.setPieceToBoard(Util.askIntMax("y : ", game.getLengthBoard()), Util.askIntMax("x : ", game.getLengthBoard()));
			System.out.println(game);
		}
	}
}
