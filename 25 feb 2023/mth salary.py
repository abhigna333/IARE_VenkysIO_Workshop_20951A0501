#n/m th salary

print("Enter a/bth of salary is M")
a = int(input("Enter a: "))
b = int(input("Enter b: "))
M = int(input("Enter M: "))

print("Enter c/dth of salary needed ")
c = int(input("Enter c: "))
d = int(input("Enter d: "))
res = (M * c * b) / (a * d)
print(f"{c}/{d}th of the salary is {res}")


