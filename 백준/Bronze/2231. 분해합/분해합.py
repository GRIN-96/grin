n = int(input())

r = 0
for i in range(1, n+1):
    sum1 = sum(list(map(int,str(i))))
    sum2 = sum1 + i
    if sum2 == n :
        print(i)
        break;
    if i == n :
        print(0)
        break;
 