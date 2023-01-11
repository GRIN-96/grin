let limit = 10000

func getPrime() -> [Bool]{
	var prime = [false,false] + Array(repeating: true, count: limit-1)
	for i in 2...limit {
		if prime[i] {
			for j in stride(from: i*2, to: limit+1, by: i) {
				prime[j] = false
			}
		}
	}
	return prime
}

let primes = getPrime()

let t = Int(readLine()!)!

for _ in 0..<t {
	let n = Int(readLine()!)!
	let list = primes[...n].enumerated().filter{$0.element && $0.offset <= n/2}.map{$0.offset}
	
	for a in list.reversed() {
		let b = n - a
		if primes[a] && primes[b] {
			print(a,b)
			break
		}
	}
}