def partition(lst, left, right):
    i = left - 1
    pivot = lst[right]

    for j in range(left, right):
        if lst[j] <= pivot:
            i += 1
            lst[j], lst[i] = lst[i], lst[j]
        
    lst[i + 1], lst[right] = lst[right], lst[i + 1]

    return i + 1

def quicksort(lst, left, right):
    if left < right:
        p = partition(lst, left ,right)
        quicksort(lst, left, p - 1)
        quicksort(lst, p + 1, right)
    
lst = [int(i) for i in input("Enter numbers: ").split()]
n = len(lst)
quicksort(lst, 0, n - 1)
print(lst)






