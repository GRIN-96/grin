import Foundation

func solution(_ x: Int, _ y: Int) -> [[Int]] {
    var res = [[Int]]()
    let A = maker(x, y)
    let B = maker(x, y)
    for i in 0 ..< x {
        res.append([])
        for j in 0 ..< y {
            res[i].append(A[i][j] + B[i][j])
        }
    }
    return res
}

func maker(_ x: Int, _ y: Int) -> [[Int]] {
    var res = [[Int]]()
    for i in 0 ..< x {
        res.append([])
        res[i].append(contentsOf: readLine()!.split(separator: " ").map { Int($0)! })
    }
    return res
}

let input = readLine()!.split(separator: " ").map { Int($0)! }
let x = input[0], y = input[1]
let result = solution(x, y)
for i in 0 ..< x {
    for j in 0 ..< y {
        print(result[i][j], terminator: " ")
    }
    print()
}