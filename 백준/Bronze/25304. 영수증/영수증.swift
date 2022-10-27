let a = Int(readLine()!)!
let b = Int(readLine()!)!
var sum_: Int = 0

for _ in 1...b {
    let input = readLine()!.split(separator : " ")
    var c = Int(input[0])!
    var d = Int(input[1])!
    sum_ = sum_ + (c*d)
}

if sum_ == a {
    print("Yes")
}else {
    print("No")
}