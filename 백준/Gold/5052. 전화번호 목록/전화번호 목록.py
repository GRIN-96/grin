import sys
n = int(sys.stdin.readline())
real = False

for _ in range(n):
    n_call = int(sys.stdin.readline())

    cl = list(sys.stdin.readline().rstrip() for _ in range(n_call))
    cl.sort()
    
    for i in range(len(cl)-1):

        if cl[i] in cl[i+1][:len(cl[i])]:
            print("NO")
            real = True
            break
    if real == False:
        print("YES")
    real = False