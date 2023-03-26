n = int(input())
li1 = sorted(list(map(int, input().split())))
m = int(input())
li2 = list(map(int, input().split()))

cnt = {}
for i in li1 :
    if i in cnt :
        cnt[i] += 1
    else :
        cnt[i] = 1
        
for i in li2 :
    if i in cnt :
        print(cnt[i], end=" ")
    else :
        print(0, end=" ")