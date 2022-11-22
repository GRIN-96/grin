var set = Set<Int>()
for _ in 0 ... 9 {
    let input = Int(readLine()!)!
    set.insert(input % 42) // 중복 없이 나머지값 삽입됨
}

print(set.count)