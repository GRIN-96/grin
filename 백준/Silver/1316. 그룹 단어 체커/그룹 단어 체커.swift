import Foundation

 let N = Int(readLine()!)!
 var answer = 0

 for _ in 1...N {

     var result: [Character] = []
     let word = readLine()!

     for char in word {
         if !result.contains(char) {
             result.append(char)
         } else if result.last! != char {
             result.removeAll()
             break
         }
     }

     if result.count != 0 {
         answer += 1
     }
 }

 print(answer) 