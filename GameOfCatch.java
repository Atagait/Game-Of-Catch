
public class GameOfCatch {

	//Wh not implement a singleton pattern?
	private static GameOfCatch mInstance;
	private GameOfCatch() {}

	//We could have made add a static function but we're not being practical to start with anyway.
	public static GameOfCatch getInstance()
	{
		if(mInstance == null)
			mInstance = new GameOfCatch();
		return mInstance;
	}
	
	//Internal-use error. In a more practical use-case you'd define this elsewhere.
	public class IntError extends Throwable
	{
		//All it is, is acontainer for an int.
		public int mInt;
		
		public IntError(int aInt)
		{
			mInt = aInt;
		}
	}
	
	//Add A+B then throw the sum.
	public void add(int a, int b) throws IntError {
		throw new GameOfCatch.IntError(a+b);
	}
	
	//Main function, hooray!
	public static void main(String[] args) {
		try
		{
			//We run our add function
			GameOfCatch.getInstance().add(1, 2);
		}
		catch(IntError error) //We catch an IntError
		{
			System.out.println(error.mint); //We print our 'error'
		}

	}

}
