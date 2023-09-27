# https://www.acmicpc.net/problem/14502
# BFS
import sys
import copy
from collections import deque
input = sys.stdin.readline

# 우 하 좌 상
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

def makeWall(count):
    if count == 3:
        infect()
        return
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 0:
                graph[i][j] = 1
                makeWall(count + 1)
                graph[i][j] = 0

def infect():
    global ans
    copyGraph = copy.deepcopy(graph)
    que = deque()
    for i in range(n):
        for j in range(m):
            if copyGraph[i][j] == 2:
                que.append((i, j))
    while que:
        x, y = que.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if (0 <= nx < n) and (0 <= ny < m):
                if copyGraph[nx][ny] == 0:
                    copyGraph[nx][ny] = 2
                    que.append((nx, ny))
    count = 0
    for i in range(n):
        for j in range(m):
            if copyGraph[i][j] == 0:
                count += 1
    ans = max(ans, count)

n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]
ans = 0

makeWall(0)
print(ans)