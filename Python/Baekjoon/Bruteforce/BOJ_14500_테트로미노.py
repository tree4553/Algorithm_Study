# https://www.acmicpc.net/problem/14500
import sys
input = sys.stdin.readline

def dfs(x, y, count, total):
    global ans
    if ans >= total + maxValue * (3 - count):   # 남은 횟수만큼 최대값을 더해도 현재 가장 큰 조합보다 작으면 반환해버려서 실행 횟수를 줄인다.
        return
    
    if count == 3:
        ans = max(ans, total)
        return
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < m and visited[nx][ny] == 0:
            if count == 1:  # ㅗ 모양에 대응하기 위해 한칸 이동한 위치를 방문처리하고 이동 하기 전 위치를 dfs에 다시 넣어준다.
                visited[nx][ny] = 1
                dfs(x, y, count + 1, total + graph[nx][ny])
                visited[nx][ny] = 0
            
            visited[nx][ny] = 1
            dfs(nx, ny, count + 1, total + graph[nx][ny])
            visited[nx][ny] = 0


n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]
visited = [[0] * m for _ in range(n)]
ans = 0
maxValue = max(map(max, graph))

# 상 우 하 좌
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

for i in range(n):
    for j in range(m):
        visited[i][j] = 1
        dfs(i, j, 0, graph[i][j])
        visited[i][j] = 0

print(ans)