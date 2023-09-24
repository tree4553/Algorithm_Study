# https://www.acmicpc.net/problem/14499
import sys

input = sys.stdin.readline

# 동(1) 서(2) 북(3) 남(4)
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
dice = [0] * 6

def turn(dir):
    # a(0) : 앞면 / b(1) : 오른쪽 옆면 / c(2) : 왼쪽 옆면 / d(3) : 뒷면 / e(4) : 윗면 / f(5) : 아랫면
    a, b, c, d, e, f = dice[0], dice[1], dice[2], dice[3], dice[4], dice[5]
    if dir == 1:
        dice[0], dice[1], dice[2], dice[3], dice[4], dice[5] = a, e, f, d, c, b
    elif dir == 2:
        dice[0], dice[1], dice[2], dice[3], dice[4], dice[5] = a, f, e, d, b, c
    elif dir == 3:
        dice[0], dice[1], dice[2], dice[3], dice[4], dice[5] = f, b, c, e, a, d
    else:
        dice[0], dice[1], dice[2], dice[3], dice[4], dice[5] = e, b, c, f, d, a

n, m, x, y, k = map(int, input().split())

graph = []
for i in range(n):
    graph.append(list(map(int, input().split())))

dir = list(map(int, input().split()))

for i in dir:
    nx = x + dx[i - 1]
    ny = y + dy[i - 1]
    if nx < 0 or nx >= n or ny < 0 or ny >= m:
        continue
    
    turn(i)
    
    if graph[nx][ny] == 0:
        graph[nx][ny] = dice[5]
    else:
        dice[5] = graph[nx][ny]
        graph[nx][ny] = 0
    x = nx
    y = ny
    print(dice[4])
