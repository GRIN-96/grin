var num: Int = Int(readLine()!)!

for _ in 1...num{

  var array: [Int] = []

  array = (readLine()?.split(separator: " ").map { Int($0)! })!

  print(array[0] + array[1])

}