let num_x = readLine()!
let num_y = readLine()!

let x = Int(num_x)!
let y = Int(num_y)!

if x > 0 && y > 0 {
    print("1")
}
if x < 0 && y > 0 {
    print("2")
}
if x < 0 && y < 0 {
    print("3")
}
if x > 0 && y < 0 {
    print("4")
}