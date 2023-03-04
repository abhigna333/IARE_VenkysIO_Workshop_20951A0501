def reverse_rec(str, res, i):
    if i < 0:
        return res
    return reverse_rec(str, res + str[i], i - 1)

str = input("Enter string: ")
n = len(str)
res = reverse_rec(str, "", n - 1)
print("Your result:", res)