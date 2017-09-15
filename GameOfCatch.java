
public class GameOfCatch {

	private static GameOfCatch mInstance;
	
	private GameOfCatch() {}
	
	private class IntError extends Throwable
	{
		public int mInt;
		
		public IntError(int aInt)
		{
			mInt = aInt;
		}
	}
	
	public void add(int a, int b) throws IntError {
		throw new GameOfCatch.IntError(a+b);
	}
	
	public static GameOfCatch getInstance()
	{
		if(mInstance == null)
			mInstance = new GameOfCatch();
		return mInstance;
	}
	
	public static void main(String[] args) {
		try
		{
			GameOfCatch.getInstance().add(1, 2);
		}
		catch(IntError error)
		{
			System.out.println(error);
		}

	}

}
