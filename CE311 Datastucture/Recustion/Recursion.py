def multiplicaiton (n,m):

    if m >= 0:
        if m == 0 :
            return 0
        elif m == 1 :
            return n 
        else :
            print (n)
            return n + multiplicaiton(n,m-1)
    else :
        print (n,m)
        return (-1) * multiplicaiton(n , (-1)*m)
    
numbers = input('Enter the List of numbers : ').split()
numbers = [int(x) for x in numbers]
print(multiplicaiton(numbers[0],numbers[1]))