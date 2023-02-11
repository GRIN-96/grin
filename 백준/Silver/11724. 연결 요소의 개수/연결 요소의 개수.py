import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

def dfs(v):
    visited[v] = 1
    for i in adjList[v]:
        if not visited[i]:
            dfs(i)

n, m = map(int, input().split())
visited = [0 for _ in range(n+1)]
adjList = [[] for _ in range(n+1)]
con_com = 0 #연결 요소 개수
for _ in range(m):
    n1, n2 = map(int, input().split())
    adjList[n1].append(n2)
    adjList[n2].append(n1)

for i in range(1, n + 1):
    if not visited[i]:
        dfs(i)
        con_com += 1
print(con_com)