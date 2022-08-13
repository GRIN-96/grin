a = input()

list1 =[]  

def dial(a):     # 함수 생성
    for i in a:
        if (i == 'A') or (i == 'B') or (i == 'C') :
            list1.append(2)
        if (i == 'D') or (i == 'E') or (i == 'F') :
            list1.append(3)
        if (i == 'G') or (i == 'H') or (i == 'I') :
            list1.append(4)
        if (i == 'J') or (i == 'K') or (i == 'L') :
            list1.append(5)
        if (i == 'M') or (i == 'N') or (i == 'O') :
            list1.append(6)
        if (i == 'P') or (i == 'Q') or (i == 'R') or (i == 'S') :
            list1.append(7)
        if (i == 'T') or (i == 'U') or (i == 'V') :
            list1.append(8)
        if (i == 'W') or (i == 'X') or (i == 'Y') or (i == 'Z') :
            list1.append(9)

            
answer = 0

dial(a)
for j in list1 :
    answer += (j+1)

print(answer)

