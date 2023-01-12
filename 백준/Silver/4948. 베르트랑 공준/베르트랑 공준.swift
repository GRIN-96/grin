import Foundation

while true {
    
    let n = Int(readLine()!)!
    let n2 = n * 2
    var count = 0

    if n == 0 { break }

    var prime = [Bool](repeating: true, count: n2 + 1)
    prime[1] = false

    for i in 2...n2 {
        if !prime[i] { continue }

        for j in stride(from: i + i, through: n2, by: i) {
            prime[j] = false
        }
    }

    for i in n+1...n2 {
        if prime[i] { count += 1 }
    }

    print(count)
}