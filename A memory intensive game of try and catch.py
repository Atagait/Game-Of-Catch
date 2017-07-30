#Here we make a super-simple exception class for use by the program In more complex applications you'd
#probably want a few of these because raising an exception will go to the top level except statement
#If dealing with two identical exception types.
class MessageException(Exception):
    def __init__(self, message):
        super().__init__(message)
        self.theInt = message


#Our add int1 + int 2
def add(int1 : int, int2 : int):
    #Raise the exception containing the answer
    raise MessageException(int1+int2)


#It's in a main function because I'm OLD SKOOL
def main():
    try:
        #Try our add function
        add(1,2)
    #Catch our exception
    except MessageException as e:
        #Print our answer
        print(e.theInt)    


main()
