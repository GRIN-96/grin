import sys
import math


def solution(x1, y1, r1, x2, y2, r2):
    if x1 == x2 and y1 == y2 and r1 == r2:
        return -1

    distance = math.sqrt(abs(x1-x2)**2 + abs(y1-y2)**2)

    if distance + r1 < r2 or distance + r2 < r1:  
        return 0
    elif distance + r1 == r2 or distance + r2 == r1:  
        return 1
    elif distance > r1 + r2:      
        return 0
    elif distance == r1 + r2:   
        return 1
    else:  
        return 2


n = int(input())

for _ in range(n):
    _x1, _y1, _r1, _x2, _y2, _r2 = map(int, sys.stdin.readline().split())
    print(solution(_x1, _y1, _r1, _x2, _y2, _r2))