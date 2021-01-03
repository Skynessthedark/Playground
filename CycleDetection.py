# Turtle and hare problem
#If slow and fast matches there is a cycle

def has_cycle(head):
    if head is None:
        return 0
    
    s = head
    f = head
    while f is not None and f.next is not None:
        s = s.next
        f = f.next.next
    
        if s == f:
            return 1
    
    return 0 
