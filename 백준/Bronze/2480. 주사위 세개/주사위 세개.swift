import Foundation

let line = readLine()!
let lineArr = line.split(separator: " ")

let a = (Int)(lineArr[0])!
let b = (Int)(lineArr[1])!
let c = (Int)(lineArr[2])!

let biggest = Int(lineArr.max()!)!



var price: Int

if a == b && b == c {
    price = 10000 + a * 1000
} else if (a == b && a != c) || (a == c && a != b ) || (b == c && b != a) {
    if a == b || a == c {
        price = 1000 + a * 100
    } else {
        price = 1000 + b * 100
    }
} else {
    price = biggest * 100
}

print( price)