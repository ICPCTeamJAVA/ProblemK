import sys

icpc = []
outside = []
mismatches = True
res = []

for i in sys.stdin:
	
	lin = i.split()
	if mismatches == True:
		for x in res:
			print(res) 
	else:
		print("No mismatches.")
