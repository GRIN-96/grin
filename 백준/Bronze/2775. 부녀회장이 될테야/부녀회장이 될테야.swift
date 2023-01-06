var apt:[[Int]]  = [[1,2,3,4,5,6,7,8,9,10,11,12,13,14],[],[],[],[],[],[],[],[],[],[],[],[],[],[]]

for i in 0...13{ //층
    for j in 0...13 { //호수
        var sum = 0
        for k in 0...j {
            sum = sum + apt[i][k]
//            print(k)
        }

        apt[i+1].append(sum)
    }
//    print(apt[i])
}

let input = Int(readLine()!)!
for i in 1...input {
    let k = Int(readLine()!)!
    let n = Int(readLine()!)!
    
    print(apt[k][n-1])
}