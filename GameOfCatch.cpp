/*
A function to add two numbers together
Wait. Why does it return a void and not an int?
*/
void add(int a, int b)
{
	//WHY ARE WE THROWING THE ANSWER AS AN EXCEPTION
    throw a+b;
}

//Ah, the main function.
int main()
{
	//Error checking. It may be a simple program
	//but I can appreciate caution. Why not.
    try
    {
    	//A simple add function... wait hold on.
    	//Why aren't we assigning to a variable?
        add(1, 2);
    }
    catch (int answer) //What the fuck is going on here?
    {
    	//BUY WHY. WHY ARE YOU DOING IT THIS WAY
        cout << answer << endl;
    }
}