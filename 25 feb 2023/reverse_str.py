#Reverse of a string
import time

s = input("Enter string: ")
n = len(s)
i = n - 1
res = ""
start = time.time()

while i >= 0:
    res += s[i]
    i -= 1

end = time.time()

print(res)
print("Time", end - start)


