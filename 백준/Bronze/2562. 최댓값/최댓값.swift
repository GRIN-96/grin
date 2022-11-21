var numbers: [Int] = []

for _ in 1...9 {
    numbers.append(Int(readLine()!)!)
}

let maximum = numbers.max()!
let indexOfMaximum = numbers.firstIndex(of: maximum)! + 1
print("\(maximum)" + "\n" + "\(indexOfMaximum)")