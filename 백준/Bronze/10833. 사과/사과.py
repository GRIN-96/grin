n = int(input())

lists = []
for i in range(n):
    a, b = map(int,input().split())
    c = b%a
    lists.append(c)
    
print(sum(lists))