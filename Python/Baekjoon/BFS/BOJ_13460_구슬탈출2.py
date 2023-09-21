from collections import deque
import sys
input = sys.stdin.readline # 빠른 입출력을 위한 코드

n, m = map(int, input().split())
graph = []
for i in range(n):
    graph.append(list(input()))
    for j in range(m):
        if graph[i][j] == 'R':
            rx, ry = i, j
        elif graph[i][j] == 'B':
            bx, by = i, j

# 상 하 좌 우
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(rx, ry, bx, by):
    q = deque()
    q.append((rx, ry, bx, by))
    visited = [] # 방문 여부 확인용
    visited.append((rx, ry, bx, by))
    count = 0
    
    while q:
        for _ in range(len(q)):
            rx, ry, bx, by = q.popleft()
            
            if count > 10: # 움직인 횟수 10 초과 -1 출력한다.
                print(-1)
                return
            
            if graph[rx][ry] == 'O': # 현재 빨간 구슬 위치가 구멍이라면 이동 횟수를 출력한다.
                print(count)
                return
            
            for i in range(4): # 상 하 좌 우
                nrx, nry = rx, ry
                while True: # 벽이나 구멍을 만날때까지 움직인다.
                    nrx += dx[i]
                    nry += dy[i]
                    if graph[nrx][nry] == '#': # 현재 위치가 벽인 경우 한칸 뒤로 이동시킨다.
                        nrx -= dx[i]
                        nry -= dy[i]
                        break
                    if graph[nrx][nry] == 'O':
                        break
                
                nbx, nby = bx, by
                while True:
                    nbx += dx[i]
                    nby += dy[i]
                    if graph[nbx][nby] == '#':
                        nbx -= dx[i]
                        nby -= dy[i]
                        break
                    if graph[nbx][nby] == 'O':
                        break
                
                if graph[nbx][nby] == 'O': # 파란색 구슬이 먼저 나가거나 빨간색 구슬과 동시에 나가는 경우 무시한다.
                    continue
                
                if nrx == nbx and nry == nby: # 이동후 구슬의 위치가 겹치는 경우
                    if abs(nrx - rx) + abs(nry - ry) > abs(nbx - bx) + abs(nby - by): # 이동거리가 더 큰 구슬이 더 늦게 도착했으므로 한칸 뒤로 이동한다.
                        nrx -= dx[i]
                        nry -= dy[i]
                    else:
                        nbx -= dx[i]
                        nby -= dy[i]
                
                if (nrx, nry, nbx, nby) not in visited: # 각 구슬 이동 후 도착 위치가 방문하지 않은 위치라면 q에 현재 위치를 추가한다.
                    q.append((nrx, nry, nbx, nby))
                    visited.append((nrx, nry, nbx, nby))
        count += 1 # q에 들어있는 모든 인자가 한번씩 다 이동을 한 후에야 count를 증가시켜야 한다.
    print(-1) # q가 다 비었을 경우 도착할 수 없는 상태이므로 -1 출력한다.

bfs(rx, ry, bx, by)


