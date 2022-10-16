var input = readLine()!.split(separator : " ")

var a = Int(input[0])!
var b = Int(input[1])!

if a == 0 && b < 45{
    a = 23
    b += 60 - 45
    print("\(a) \(b)")
}
else if b < 45 {
    b += 60 - 45
    a -= 1
    print("\(a) \(b)")
}else {
    b -= 45
    print("\(a) \(b)")   
}