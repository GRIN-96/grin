# 읽어온 숫자 리스트로 만들기
n = int(input())
num_list = list(map(int, input().split()))

#  정렬 및 중복제거 과정
num_list1 = list(set(num_list))
num_list1.sort()

#  num_list 길이에 맞는 리스트 생성
num_list2 = [i for i in range(len(num_list1))]

#  dict 만들기
num_dic = dict(zip(num_list1, num_list2))


for i in num_list :
    print(num_dic[i], end = " ")