a,b = input().split()

a1=a[-1::-1]
b1=b[-1::-1]

if a1<b1 :
    print(b1)
elif a1>b1 :
    print(a1)