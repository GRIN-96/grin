let count = Int(readLine()!)!
for _ in 0 ..< count {
    let result = readLine()!.map { String ($0) }
    var previousScore = 0
    var totalScore = 0
    for i in result {
        if i == "O" {
            previousScore += 1
            totalScore += previousScore
        } else {
            previousScore = 0
        }
    }
    
    print(totalScore)
}