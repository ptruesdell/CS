import sys

# A simple print function
def print_int(n):
	for i in range(0, len(str(n))):
		sys.stdout.write(str(n)[i])
	print(" \n")

def partition(input, p, r):
	pivot = input[r]
	while (p < r):
		while (input[p] < pivot):
			p = p + 1
		while (input[r] > pivot):
			r = r - 1
		if (input[p] == input[r]):
			p = p + 1
		elif (p < r):
			tmp = input[p]
			input[p] = input[r]
			input[r] = tmp
	return r

def quicksort(list, p, r):
    if p < r:
        j = partition(list, p, r)
        quicksort(list, p, j-1)
        quicksort(list, j+1, r)
    else:
        return

inputList = [500, 700, 800, 100, 300, 200, 900, 400, 1000, 600]
print("Input: ")
print_int(inputList)
quicksort(inputList, 0, 9)
print("Output: ")
print_int(inputList)