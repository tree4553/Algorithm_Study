# https://www.acmicpc.net/problem/13458
import sys

input = sys.stdin.readline

n = int(input())
persons = list(map(int, input().split()))
b, c = map(int, input().split())

answer = 0

for i in range(n):
    answer += 1 # 총 감독관 한명 추가
    if persons[i] - b <= 0:
        continue
    else:
        if (persons[i] - b) % c == 0: # 나머지가 없는 경우
            answer += (persons[i] - b) // c
        else:   # 나머지가 있는 경우
            answer += (persons[i] - b) // c + 1

print(int(answer))
        
        