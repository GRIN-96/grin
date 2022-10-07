let arr1 = readLine()!.split(separator: " ")

let a = Int(arr1[0])!
let b = Int(arr1[1])!
let c = Int(arr1[2])!

print((a+b)%c)
print(((a%c)+(b%c))%c)
print((a*b)%c)
print(((a%c)*(b%c))%c)