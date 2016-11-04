import sys

def fun(x,y):
	return x+y

print(fun(1, 2))
print(fun("hi", "there"))

def report(xs):
	nameList = []
	total = 0;
	for i in xs:
		# Check whether element in input array is an int
		if (isinstance(xs[i], int)) {
			nameList[i] = xs[i - 2]
			total = total + xs[i]
		}
	for j in nameList:
		sys.out.write(nameList[j] + ", ")
	sys.out.write(total / len(nameList))

report(["Jill", "Johnson", 87, "Billy", "Ray", "Cyrus", 78, "Rita", "Yeats", 94, "Bobbie", "Sue", "Palmer", 72])

#print(fun(["Jill", "Johnson", 87, "Billy", "Ray", "Cyrus", 78, "Rita", "Yeats", 94, "Bobbie", "Sue", "Palmer", 72]))


