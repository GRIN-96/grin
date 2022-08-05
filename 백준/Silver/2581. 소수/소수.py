m = int(input())
n = int(input())

answer1 = []
for i in range(m,n+1):
    for j in range(2,i+1) :
        if i==j :
            answer1.append(i)
        if i%j == 0 :
            break
if not answer1:
	print(-1)
else:
	print(sum(answer1))
	print(min(answer1))  