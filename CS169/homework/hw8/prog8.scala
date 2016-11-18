
//This class creates a set with only one element, elem.
class singletonSet(elem:Int) extends Set(f:Int=>Boolean) {
	//Now that we have a set with only one element, we can do better with
	//forall and exists. Implement these functions to work for ALL integers,
	//not just those in the range -1000 to 1000

	override def forall(p:Int=>Boolean):Boolean = {
		if (p(elem)) true
		else false
	}
	override def exists(p:Int=>Boolean):Boolean = {
		if (p(elem)) true
		else false
	}
}

//This class creates a set whose elements are all integers between start and end, inclusive.
class rangeSet(start:Int, end:Int) extends Set(f:Int=>Boolean) {
	//Now that we have a set with a finite number of elements, we can do better with
	//forall and exists. Implement these functions to work for ALL integers,
	//not just those in the range -1000 to 1000
	override def forall(p:Int=>Boolean):Boolean = {
		if (p)
	}
	override def exists(p:Int=>Boolean):Boolean = {

	}
}