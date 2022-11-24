var result = Int(readLine()!)!

var i = 2
while true {
    if result == 1 {
        break
    }

    if result % i != 0 {
        i = i + 1
    }else {
        //i로 나눠질때
        print(i)
        result = result / i
        if result == 1 {
            break
        }
    }

}