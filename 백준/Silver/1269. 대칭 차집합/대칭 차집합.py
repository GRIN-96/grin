a, b = map(int,input().split())

Alist = set(map(int,input().split()))

Blist = set(map(int,input().split()))

cnt = 0

for i in range(1) :
    cnt += len(list(Alist - Blist))
    cnt += len(list(Blist - Alist))
    
print(cnt)