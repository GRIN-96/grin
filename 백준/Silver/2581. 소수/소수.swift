let M = Int(readLine()!)!
let N = Int(readLine()!)!

var sum = 0
var isPrimeNumber = true
var allPrimeNumber = false
var arr: [Int] = []

for i in M...N {
    if i == 1 {
        isPrimeNumber = false
    }else {
        for j in 2..<i {
            if i % j == 0 {
                isPrimeNumber = false
            }
        }
        
        if isPrimeNumber == true {
            arr.append(i)
            allPrimeNumber = true
        }
    }
    isPrimeNumber = true
}

if allPrimeNumber {
    for k in 0..<arr.count {
        sum += arr[k]
    }
    print("\(sum)")
    print("\(arr.min()!)")
}else {
    print("-1")
}