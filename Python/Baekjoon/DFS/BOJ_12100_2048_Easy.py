# https://www.acmicpc.net/problem/12100
# DFS
import sys
from copy import deepcopy

input = sys.stdin.readline

n = int(input())
board = [list(map(int, input().split())) for _ in range(n)]

def up(board):
    for j in range(n):
        pointer = 0
        for i in range(1, n):
            if board[i][j] != 0:
                temp = board[i][j]
                board[i][j] = 0 # 현재 위치와 포인터의 위치가 같은경우 스킵하기 위해서 현재 위치에 0을 넣어준다.
                if board[pointer][j] == 0:
                    board[pointer][j] = temp
                elif board[pointer][j] == temp:
                    board[pointer][j] *= 2
                    pointer += 1
                else:
                    pointer += 1
                    board[pointer][j] = temp
    return board

def down(board):
    for j in range(n):
        pointer = n - 1
        for i in range(n - 2, -1, -1):
            if board[i][j] != 0:
                temp = board[i][j]
                board[i][j] = 0
                if board[pointer][j] == 0:
                    board[pointer][j] = temp
                elif board[pointer][j] == temp:
                    board[pointer][j] *= 2
                    pointer -= 1
                else:
                    pointer -= 1
                    board[pointer][j] = temp
    return board

def left(board):
    for i in range(n):
        pointer = 0
        for j in range(1, n):
            if board[i][j] != 0:
                temp = board[i][j]
                board[i][j] = 0
                if board[i][pointer] == 0:
                    board[i][pointer] = temp
                elif board[i][pointer]  == temp:
                    board[i][pointer] *= 2
                    pointer += 1
                else:
                    pointer += 1
                    board[i][pointer]= temp
    return board

def right(board):
    for i in range(n):
        pointer = n - 1
        for j in range(n - 2, -1, -1):
            if board[i][j] != 0:
                temp = board[i][j]
                board[i][j] = 0
                if board[i][pointer] == 0:
                    board[i][pointer] = temp
                elif board[i][pointer]  == temp:
                    board[i][pointer] *= 2
                    pointer -= 1
                else:
                    pointer -= 1
                    board[i][pointer] = temp
    return board

def dfs(board, count):
    if count == 5:
        return max(map(max, board))
    
    return max(dfs(up(deepcopy(board)), count + 1), dfs(down(deepcopy(board)), count + 1), dfs(left(deepcopy(board)), count + 1), dfs(right(deepcopy(board)), count + 1))
    
print(dfs(board, 0))