object Main {
	def main(args: Array[String]): Unit = {
	  
	  // Function takes in two ints and returns an int
	  def add(x:Int, y:Int):Int = x+y
	  
	  // Function takes an int and returns an int
	  def square(x:Int) = x*x
	  
	  def ls = List(3, 5, 2, 7)
	  
	  // Combines all elements of a list using the input function
	  def combine(xs:List[Int], f: (Int, Int) => Int):Int = {
		  if (xs.isEmpty) return 0
		  else f(xs.head, combine(xs.tail, f))
	  }
	  
	  // Applies function to list, then combines elements using input function f
	  def apply_combine(xs:List[Int], f: (Int, Int) => Int, g: (Int) => Int):Int = {
	    if (xs.isEmpty) return 0
	    else f(g(xs.head), apply_combine(xs.tail, f, g))
	  }
	  
	  // Test
	  println("Part one output:")
	  println(combine(ls, add))

	  println("Part two output:")
	  println(apply_combine(ls, add, square))
	}
}