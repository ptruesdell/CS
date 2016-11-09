object setObject {
	def main(args: Array[String]): Unit = {
    
	    def singletonSet(elem:Int):Int=>Boolean = {
		  def output(e2:Int):Boolean = {
		    e2==elem
		  }
		  output 
		}
		/*
		// Takes in a list of ints and returns a set consisting of all ints in the list
		def setList(elem:List[Int]):Int=>Boolean = {
			
		}
		
	    // Takes in a set S and a predicate P and returns a new set that consists of the elements of S that satisfy the predicate
	    def filter(s:Int=>Boolean, p:Int=>Boolean):Int=>Boolean = {
	    
	    }

	    // Tests whether a predicate p is true for all elements of a set s. 
	    // We will consider a predicate true for all integers if it is true for integers from -1000 to 1000
	    def forall(s:Int=>Boolean, p:Int=>Boolean):Boolean = {
	      
	    }*/

	    def list1 = List(433, 64, 6, 23, 5)
	    println(singletonSet(5))
  }
}
