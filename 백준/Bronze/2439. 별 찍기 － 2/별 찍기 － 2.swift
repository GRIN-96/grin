let value = Int(readLine()!)!
for i in 1...value{
  for _ in stride(from: value, to: i, by: -1){
  	print(" ", terminator: "")
  }
  for _ in stride(from: 0, to: i, by: 1){
  	print("*", terminator: "")
  }
  print("")
}
