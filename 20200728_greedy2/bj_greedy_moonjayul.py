a,b = input().split()
A = list(a)
B = list(b)
A.sort()
B.sort()
count=0
for i in range(len(A)):
    if A[i] != B[i]:
        count+=1
print(count)

