import Foundation
var word = readLine()!
let m = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

for i in 0...m.count - 1 {
    word = word.replacingOccurrences(of: m[i], with: "a")
}
print("\(word.count)")