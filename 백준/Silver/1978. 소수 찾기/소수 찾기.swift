let N = Int(readLine()!)!
var count = 0
var isPrimeNumber = true
var arr = readLine()!.split(separator: " ").map{ Int($0)! }
for i in 0..<arr.count {
    if arr[i] == 1 {
        isPrimeNumber = false
    }else {
        for j in 2..<arr[i] {
            if arr[i] % j == 0 {
                isPrimeNumber = false
            }
        }
    }
    if isPrimeNumber == true {
        count += 1
    }
    isPrimeNumber = true
}
print("\(count)")