let N = Int(readLine()!)!

var cycle = 0
var newN = N

repeat {
    let l = newN / 10
    let r = newN % 10
    let sum = l + r
    
    newN = r * 10 + sum % 10
    cycle += 1
} while (N != newN)

print(cycle)