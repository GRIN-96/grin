a, b = map(int, input().strip().split(' '))
count = 0
while True :
    print('{}'.format('*'*a))
    count+=1
    if count == b:
        break