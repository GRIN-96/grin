import math as m

n, a, b = map(int, input().split())
q = m.sqrt(n**2 / (a**2 + b**2))
print(int(q*a), int(q*b))