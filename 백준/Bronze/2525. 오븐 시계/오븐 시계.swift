import Foundation

let time = readLine()!
let timeItTakes = Int(readLine()!)!
let timeArr = time.split(separator: " ")

var a = Int(timeArr[0])!
var b = Int(timeArr[1])!

b += timeItTakes
while (b >= 60) {
    a += 1
    b -= 60
}
while (a >= 24) {
    a -= 24
}

print("\(a) \(b)")