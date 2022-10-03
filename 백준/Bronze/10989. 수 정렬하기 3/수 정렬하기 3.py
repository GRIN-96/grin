import sys

num_list = [0]*10001

for i in range(int(sys.stdin.readline())) :
    num_list[int(sys.stdin.readline())] += 1
    
for j in range(10001):
    if num_list[j] != 0 :
        for k in range(num_list[j]):
            print(j)

