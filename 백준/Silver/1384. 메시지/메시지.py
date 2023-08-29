group = []
groups = []
while True:
    num = int(input())
    if num == 0:
        break
    for i in range(num): 
        student = input().split()
        group.append(student)
    groups.append(group)
    group = []
for i in range(len(groups)):
    if i!=0:
        print()
    print("Group",i+1)
    cnt = 0
    for j in range(len(groups[i])):
        bad = -1
        if 'N' in groups[i][j]:
            nasty = groups[i][j].count('N')
            for k in range(nasty):
                bad = groups[i][j].index('N',bad+1)
                badp = (len(groups[i])+j-bad)%len(groups[i])
                print(groups[i][badp][0],"was nasty about",groups[i][j][0])
            cnt += 1
    if cnt == 0: 
        print("Nobody was nasty") 