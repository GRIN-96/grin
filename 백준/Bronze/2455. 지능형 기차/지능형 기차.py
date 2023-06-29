arr = []
result = 0

for i in range(4):
    a, b = map(int, input().split()) 
    
    result = result - a + b
    arr.append(result)
        
print(max(arr))