def solution(n):
    x = n**(1/2)
    x = round(x)
    if n == x**2:
        return (x+1)**2
    elif n != x**2 :
        return -1