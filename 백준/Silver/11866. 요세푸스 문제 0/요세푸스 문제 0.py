import sys

n, k = map(int,sys.stdin.readline().split())

lists = [i for i in range(1,n+1)]

idx = 0

answer = []

while lists :
    idx += k-1
    if len(lists) <= idx :
        idx = idx % len(lists)
        
    answer.append(str(lists.pop(idx)))

print("<",", ".join(answer),">", sep = "")