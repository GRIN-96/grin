while true {
    let input = readLine()!.split(separator : " ")
    var a = Int(input[0])!
    var b = Int(input[1])!
    if a + b != 0 {
        print(a+b)
    }else {
        break
    }
}