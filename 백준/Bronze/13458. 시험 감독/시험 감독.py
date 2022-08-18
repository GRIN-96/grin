N = int(input())
num = list(map(int,input().split()))
B,C = map(int,input().split())

answer = N

for i in num :
    i-=B
    if i>0 :
        if i%C :
            answer += (i//C)+1
        else :
            answer += (i//C)
        
print(answer)