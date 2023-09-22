import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
k = int(input())

graph = [[0]*n for _ in range(n)]
for _ in range(k):
    x, y = map(int, input().split())
    graph[x-1][y-1] = 2

l = int(input())
move = [list(input().split()) for _ in range(l)]

# 우0 하1 좌2 상3
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

dir = 0
time = 0
i = 0
q = deque()
q.append((0,0))
x, y = 0, 0 # 머리의 현재 위치

while True:
    time += 1
    x += dx[dir]
    y += dy[dir]
    if x < 0 or x >= n or y < 0 or y >= n or (x, y) in q:
        break

    q.append((x, y))
    if graph[x][y] == 2:    
        graph[x][y] = 0
    else:
        q.popleft()
    
    if time == int(move[i][0]):
        if move[i][1] == 'L': # 왼쪽 90도 회전
            dir = (dir - 1) % 4 # 우0 -> 상3 / 상3 -> 좌2 / 좌2 -> 하1 / 하1 -> 우0
        else: # 오른쪽 90도 회전
            dir = (dir + 1) % 4 # 우0 -> 하1 / 하1 -> 좌2 / 좌2 -> 상3 / 상3 -> 우0
        if i + 1 < l:
            i += 1

print(time)