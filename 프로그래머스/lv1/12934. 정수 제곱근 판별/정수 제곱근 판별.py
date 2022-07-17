def solution(n):
    x = int(n**(1/2))
    if n == x**2:
        return (x+1)**2
    elif n != x**2 :
        return -1