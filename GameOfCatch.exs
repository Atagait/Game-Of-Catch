defmodule MyError do
	@moduledoc """
	MyError class, a 'base exception' class for the Game of Catch.
	Although a runtime error would do just fine, having control over your
	exceptions is good practice, and if you were to try do something more
	complex with this, you'd want the actual exception class to have something
	utility built into it.
	"""
    defexception message: "Default"
end


defmodule GameOfCatch do
	@moduledoc """
	Because OOP. This probably is messy, I'm not super experienced in Elixir
	and would love for someone to give me advice on cleaning this up.
	"""
    def sum(a, b) do
    	@doc "Our generic 'add a+b' function for Game of Catch"
        raise MyError, message: a+b
    end

    def main() do
    	@doc "Our main function's purpose is basically to have a try/catch."
    	try do
    		@doc "We don't need to really asign anything, as the result is raised."
			sum(1,2)
		rescue
			@doc "And here we capture the result, and print it."
		    e in MyError -> IO.puts(e.message)
		end
	end
end

@doc "And here we invoke our main function."
GameOfCatch.main()