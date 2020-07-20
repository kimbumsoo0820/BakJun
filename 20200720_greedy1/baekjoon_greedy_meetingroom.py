def solution(inputarr):
    answer =0
    endTime =0
    for i in range(len(inputarr)):
        if endTime <= inputarr[i][0]:
            endTime = inputarr[i][1]
            answer +=1
    return answer


N=int(input())
arr=[]

for i in range(N):
    a,b = map(int,input().split())
    arr.append([a,b])

arr.sort(key=lambda x: (x[1], x[0]))
print(solution(arr))