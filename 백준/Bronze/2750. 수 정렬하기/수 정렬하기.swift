let n = Int(readLine()!)!
var numberList: [Int] = []

for _ in 1...n {
    numberList.append(Int(readLine()!)!)
}

numberList.sort()

for i in numberList {
    print(i)
}