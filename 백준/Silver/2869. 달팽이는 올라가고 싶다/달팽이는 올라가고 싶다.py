import sys
import math

A, B, V = map(int,input().split())

count=(V-B)/(A-B)
    
    
print(math.ceil(count))