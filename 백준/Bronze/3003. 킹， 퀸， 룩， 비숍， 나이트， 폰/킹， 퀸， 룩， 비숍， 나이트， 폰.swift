let arr = readLine()!.split(separator: " ").map { Int(String($0))! }
let arr2: [Int] = [1, 1, 2, 2, 2, 8]

for i in 0..<arr2.count {
    print(arr2[i] - arr[i], terminator :" ")
}