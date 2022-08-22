def solution(participant, completion):
    participant.sort()
    completion.sort()
    for i,j in zip(participant, completion):   # zip 함수로 묶어 다른 것만 리턴
        if i != j:
            return i
    return participant.pop()    # 리스트의 맨 끝을 빼는 함수