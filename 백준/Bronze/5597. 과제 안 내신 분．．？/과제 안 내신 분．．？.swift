import Foundation

var base = [Int]()

for i in 1...30 {
    base.append(i)
}

for _ in 1...28 {
    let input = Int(readLine() ?? "") ?? 0
    if base.contains(input) == true {
        base.remove(at: base.firstIndex(of: input)!)
    }
}

for i in 0..<base.count {
    print(base[i])
}