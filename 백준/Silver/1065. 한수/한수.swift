import Foundation

let num = Int(readLine()!)!
var result = 0

//100부터 999까지의 계산은 문제의 의도에 따라 함수로 분리해 표현해주었다
func calculate(num : Int) -> Int {
    for x in 100...num {
        let firstNum : Float = Float(x / 100)
        let thirdNum : Float = Float(x % 10)
        let secondNum : Float = (Float(x % 100) - thirdNum)/10
        
        if((firstNum + thirdNum) / 2 == secondNum){
            result += 1
        }
    }
    return result + 99
}

switch num {
case 1...99:
    result = num
case 100...999:
    result = calculate(num: num)
default:
    result = calculate(num: 999)
}

print(result)