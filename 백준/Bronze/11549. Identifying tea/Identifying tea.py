n = int(input())

lists = list(map(int,input().split()))

score = 0

for i in lists :
    if i == n :
        score += 1
print(score)