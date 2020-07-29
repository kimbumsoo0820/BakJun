A=list(input())
A.sort(reverse=True)
sum=0
for i in A:
    sum+=int(i)
if sum%3 !=0 or "0" not in A:
    print(-1)
else:
    print(''.join(A))