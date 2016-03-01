public class Player{
	private String _name;
	
	public Player(String name){
		_name = name;
	}
	
	public String getName(){
		return _name;
	}
	
	public void setName(String name){
		_name = name;
	}

	@Override
	public String toString(){
		return _name;
	}
}
