a = 5
b = 6

def swapValues(a, b):
    a = a + b
    b = a - b
    a = a - b
    print("Value 'a' = " + str(a) + ", and value 'b' = " + str(b))

def main():
    print("Value 'a' = " + str(a) + ", and value 'b' = " + str(b))
    swapValues(a, b)

if __name__== "__main__":
    main()


