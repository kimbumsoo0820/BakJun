A = int(input())
arr=[]
m=0
for i in range(A):
    arr.append(int(input()))
arr.sort(reverse=True)
for i in range(len(arr)):
    w=arr[i]*(i+1)
    if w>m:
        m=w
print(m)