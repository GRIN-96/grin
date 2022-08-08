n, m = map(int,input().split())
a = list(map(int,input().split()))

answer = []
for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            sum1 = a[i]+a[j]+a[k]
            if sum1 <= m :
                answer.append(sum1)
result = max(answer)
print(result)