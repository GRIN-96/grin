let input = readLine()!
let inputArr = input.split(separator:" ")
let a = Int(inputArr[0])!
let b = Int(inputArr[1])!

if a > b {
    print(">")
}else if a < b {
    print("<")
}else if a == b {
    print("==")
}