import Foundation

var count: Int = Int(readLine()!)!

for _ in 0..<count{
    var result: Int = 0
    var numArr: [Int] = readLine()!.split(separator: " ").map{ Int($0)!}
    let studentNum: Int = numArr[0]
    numArr.removeFirst()
    
    for i in 0..<studentNum{
        if numArr[i] > numArr.reduce(0, { $0 + $1}) / studentNum{
            result += 1
        }
    }
   

    print(String(format: "%.3f", Float(result) / Float(studentNum) * 100),"%",separator: "")
}