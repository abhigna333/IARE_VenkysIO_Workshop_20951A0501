def partition(lst, left, right):
    i = left
    j = right - 1
    pivot = lst[right]
    while True:
        while lst[i] < pivot:
            i += 1
        while lst[j] > pivot and i >= left:
            j -= 1

        if i >= j:
            break
        lst[i], lst[j] = lst[j], lst[i]

    lst[i], lst[right] = lst[right], lst[i]

    return i

def quicksort(lst, left, right):
    if left < right:
        p = partition(lst, left ,right)
        quicksort(lst, left, p - 1)
        quicksort(lst, p + 1, right)
    
lst = [int(i) for i in input("Enter numbers: ").split()]
n = len(lst)
quicksort(lst, 0, n - 1)
print(lst)






