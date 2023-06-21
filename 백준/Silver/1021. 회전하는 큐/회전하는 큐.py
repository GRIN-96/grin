from collections import deque
n,m = map(int, input().split())
el = list(map(int, input().split()))

lst = [i for i in range(1,n+1)]
queue = deque(lst)

cnt = 0
for e in el:
  if queue.index(e) >= (len(queue)/2):
    k = len(queue) - queue.index(e)
    cnt += k
    queue.rotate(k)
  else:
    k = queue.index(e)
    cnt += k
    queue.rotate(-k)
  queue.popleft()

print(cnt)