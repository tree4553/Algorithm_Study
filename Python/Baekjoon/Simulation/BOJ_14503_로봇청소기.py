# https://www.acmicpc.net/problem/14503
# Simulation

import sys
input = sys.stdin.readline

n, m = map(int, input().split())
x, y, dir = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]
# 북(0) 동(1) 남(2) 서(3)
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
ans = 0
while True:
    if graph[x][y] == 0: # 현재 위치 청소
        ans += 1
        graph[x][y] = 2
    unclean = False
    for i in range(4):  # 주변의 청소 안 된 칸이 있는지 확인
        nx = x + dx[i]
        ny = y + dy[i]
        #if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 0:
        if graph[nx][ny] == 0:
            unclean = True
            break
    if unclean: # 주변에 청소가 안 된 칸이 있을때
        dir = dir - 1 # 반시계 방향 90도 회전
        if dir == -1:
            dir = 3
        tx = x + dx[dir]
        ty = y + dy[dir]
        #if 0 <= tx < n and 0 <= ty < m and graph[tx][ty] == 0:  # 바라보는 방향이 청소가 안되어 있는 칸이라면
        if graph[tx][ty] == 0:  # 바라보는 방향이 청소가 안되어 있는 칸이라면
            x, y = tx, ty   # 한 칸 이동
            continue
    else:   # 주변이 다 청소 되어 있을때
        tx = x - dx[dir]
        ty = y - dy[dir]
        if graph[tx][ty] == 1:  # 뒤칸이 벽이라면 종료
            break
        else:   # 뒤칸이 벽이 아니라면 한 칸 후진
            x, y = tx, ty
            

print(ans)

            
            