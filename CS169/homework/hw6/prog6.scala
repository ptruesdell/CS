object Main {
	def main(args: Array[String]): Unit = {

		// Part One: takes two lists of integers and returns alternating lists
		def alt_list(xs1:List[Int], xs2:List[Int]): List[Int] = {
			if (xs1.isEmpty && xs2.isEmpty) return Nil
			else if (xs1.isEmpty && !xs2.isEmpty) return xs2
			else if (!xs1.isEmpty && xs2.isEmpty) return xs1
			else xs1.head :: xs2.head :: alt_list(xs1.tail, xs2.tail)
		}

    def apply_to_list(xs:List[Int], ys:List[Int], f: (Int, Int) => Int): List[Int] = {
      // Keep function from including extra elements if one list is longer than the other
      if (xs.isEmpty || ys.isEmpty) return Nil
      else f(xs.head, ys.head) :: apply_to_list(xs.tail, ys.tail, f) 
    } 

    def checkListElements(xs:List[Int], f: (Int) => Boolean): List[Int] = {
      // Return nil if list is empty
      if (xs.isEmpty) return Nil
      // If element meets condition, add it to the output list
      else if (f(xs.head)) xs.head :: checkListElements(xs.tail, f)
      // If element doesn't meet condition, continue checking the rest of the list
      else checkListElements(xs.tail, f) 
    }
		// Test
		def list1 = List(3, 5, 2, 8, 4, 23, 24, 9, 345, 53)
		def list2 = List(23, 44, 123, 90)
    
    println("Part one output: ")
		println(alt_list(list1, list2))

    println("Part two output: ")  
    println(apply_to_list(list1, list2, (x:Int, y:Int) => x+y))

    println("Part three output (condtion: even): ")
    println(checkListElements(list1, (x:Int) => {
      if ((x%2) == 0) true
      else false
    }))
    println("Part three output (condition: > 10): ")
    println(checkListElements(list1, (x:Int) => {
      if (x > 10) true
      else false
    }))

	}
}
