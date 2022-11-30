let input = Int(readLine()!)!

let a = input
var sum = 1
var i = 0
while true {
    sum = sum + 6 * i
    if a <= sum {
        print(i + 1)
        break
    }

    i = i + 1
}