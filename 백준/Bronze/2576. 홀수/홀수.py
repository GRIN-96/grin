def odd_numbers(numbers):
    odd_nums = [num for num in numbers if num % 2 == 1]
    
    if len(odd_nums) == 0:
        answer = [-1]
    else:
        answer = sum(odd_nums), min(odd_nums)
    
    return answer

if __name__ == "__main__":
    numbers = []
    for _ in range(7):
        number = int(input())
        numbers.append(number)
    answer = odd_numbers(numbers)
    
    for num in answer:
        print(num)