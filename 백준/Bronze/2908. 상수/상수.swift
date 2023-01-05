import Foundation

let line = readLine() ?? ""
let lineArr = line.split(separator: " ").map { Int($0) ?? 0 }

func reverse(num: Int) -> Int {
    let value = (num%10)*100 + ((num%100)/10)*10 + (num / 100)
    return value
}
print(max(reverse(num: lineArr[0]), reverse(num: lineArr[1])))