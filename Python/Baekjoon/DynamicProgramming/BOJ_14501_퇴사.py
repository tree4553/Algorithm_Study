# https://www.acmicpc.net/problem/14501
# DP
import sys
input = sys.stdin.readline

n = int(input())
graph = [list(map(int, input().split())) for _ in range (n)]
arr = [0] * (n + 1)

for i in range(n-1, -1, -1):
    if i + graph[i][0] <= n:
        # if arr[i + 1] < graph[i][1] + arr[i + graph[i][0]]:
        #     arr[i] = graph[i][1] + arr[i + graph[i][0]]
        # else:
        #     arr[i] = arr[i + 1]
        arr[i] = max(arr[i+1], graph[i][1] + arr[i + graph[i][0]])
    else:
        arr[i] = arr[i + 1]
print(arr[0])