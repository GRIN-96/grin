X = int(input())
N = int(input())
sell = []
for i in range(N):
    a,b = map(int,input().split())
    sell.append(a*b)
    
if sum(sell) == X :
    print('Yes')
else :
    print('No')