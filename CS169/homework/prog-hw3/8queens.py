import sys

# Initilize every coordinate to 0
grid = [[0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0]]

# Prints chess board state
def printBoard():
	for i in range(0, 7):
		print(str(grid[0][i])),

'''
# If given position is playable, then place queen
def playQueen(x, y):
	if isPlayable(x, y):
		grid[x][y] = 1

# Checks whether a given position on the board is playable
def isPlayable(x, y):
	def checkColumn():
		# Check if there are any queens in same column
		for i in range(0, 7):
			if grid[x][i] == 1 and i != x:
				return 0
	def checkRow():
		# Check if there are any queens in same row
		for i in range(0, 7):
			if grid[i][y] == 1 and i != x:
				return 0
	def checkDiagonals():
		# Check if there are any queens diagonal to coordinate
		# 4 for loops to iterate through each direction of diagonals
		for x in range(x, 7):
			if grid[x+1][y+1] == 1:
				return 0
		for i in range(0, x-1):
			if grid[i][]
'''

printBoard()