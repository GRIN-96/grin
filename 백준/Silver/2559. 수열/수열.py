def sequence(temperture_list, K):
    temp_k_days_list = [sum(temperture_list[:K])]
    for i in range(1, len(temperture_list) - K + 1):
        sum_k_temp = temp_k_days_list[-1] + temperture_list[i+K-1] - temperture_list[i-1]
        
        temp_k_days_list.append(sum_k_temp)
        
    return max(temp_k_days_list)

if __name__ == "__main__":
    N, K = map(int, input().split())
    temperture_list = list(map(int, input().split()))
    print(sequence(temperture_list, K))