let n = Int(readLine()!)!

for i in 1...n {
    let input = readLine()!.split(separator : " ")
    var a = Int(input[0])!
    var b = Int(input[1])!
    
    print("Case #\(i): \(a+b)")
}