from functools import reduce

def answer(n) :
    if int(n) == 0 :
        print(1)
    else :
        lists = [i for i in range(1, (int(n)+1))]
        print(reduce(lambda x,y : x*y , lists))
        
        
answer(input())