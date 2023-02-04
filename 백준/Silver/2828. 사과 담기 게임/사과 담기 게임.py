from re import M
n,m = map(int,input().split())

j = int(input())

lists = []
move = 0

for _ in range(j) :
    lists.append(int(input()))

end = m
start = 1

for i in range(j) :
    if (end >= lists[i] and start <= lists[i]) :
        continue
    elif (end < lists[i]) :
        move += lists[i] - end
        end = lists[i]
        start = lists[i] - (m-1)
    elif (start > lists[i]) :
        move += start - lists[i]
        start = lists[i]
        end = lists[i] + (m-1)


print(move)