let s = Array(readLine()!)
for i in Character("a").asciiValue!...Character("z").asciiValue! {
     var char = Character(UnicodeScalar(i))
    if s.contains(char){
        print("\(s.index(of: char)!)",terminator: " ")
    }else{
    print("-1", terminator: " ")
    }
}