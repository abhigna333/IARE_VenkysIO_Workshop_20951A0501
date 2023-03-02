#Reverse of a string
# import time

# s = input("Enter string: ")
# n = len(s)
# i = n - 1
# res = ""
# start = time.time()

# while i >= 0:
#     res += s[i]
#     i -= 1

# end = time.time()

# print(res)
# print("Time", end - start)


#Reverse using recursion
import time

s = input("Enter string: ")

def reverseString(s, res=""):
    
    res += s[-1]
    if len(s) == 1:
        return res
    return reverseString(s[:-1], res)


start = time.time()
print("String:", reverseString(s))
end = time.time()
print("Time:", end - start)


#Multi Threading


