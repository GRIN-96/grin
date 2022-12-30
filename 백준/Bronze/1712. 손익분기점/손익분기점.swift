let input = readLine()!
let inputSplit = input.split(separator: " ").map { Int(String($0))! }
let csb = inputSplit[2] - inputSplit[1]
if csb <= 0 {
    print(-1)
} else {
    print(inputSplit[0] / csb + 1)
}