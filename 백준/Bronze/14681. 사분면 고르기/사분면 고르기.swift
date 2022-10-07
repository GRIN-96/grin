let num_x = readLine()!
let num_y = readLine()!

let a = Int(num_x)!
let b = Int(num_y)!

if a > 0 && b > 0 {
    print("1")
}
if a < 0 && b > 0 {
    print("2")
}
if a < 0 && b < 0 {
    print("3")
}
if a > 0 && b < 0 {
    print("4")
}