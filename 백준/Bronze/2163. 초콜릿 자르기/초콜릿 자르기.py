def chocolate(N, M):
    return (N-1) + N * (M-1)

if __name__ == "__main__":
    N, M = map(int, input().split())
    print(chocolate(N, M))
    