from functools import reduce
s = int(input())

for i in range(s):
    r,p = input().split()
    a1 = reduce(lambda x,y : x+y, [int(r)*j for j in p])
    print(a1)