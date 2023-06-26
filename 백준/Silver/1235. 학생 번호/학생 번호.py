n=int(input(''))
num=[]
for i in range(n):
    N=input('')
    num.append(N)
cnt=1

while(1):
    if len({i[-cnt:] for i in num})==n:
        print(cnt)
        break
    cnt=cnt+1