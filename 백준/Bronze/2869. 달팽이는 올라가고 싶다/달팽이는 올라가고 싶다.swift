import Foundation
let arr = readLine()!.split(separator: " ").map{Double($0)!}
let A = arr[0]
let B = arr[1]
let V = arr[2]

var x = ceil((V - B) / (A - B))
print("\(Int(x))")