N, *lst = map(int, open(0).read().split())

ct = [0] * 51
for n in lst:
    ct[n] += 1

for i in range(50, -1, -1):
    if ct[i] == i:
        print(i)
        break
else: 
    print(-1)