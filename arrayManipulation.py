def arrayManipulation(n, queries):
    llist = [0] * n
    for a, b, k in queries:
        llist[a - 1] += k
        if b != len(llist):
            llist[b] -= k
    maxValue = 0
    summ = 0
    for i in llist:
        summ += i
        if summ > maxValue:
            maxValue = summ
    return maxValue
