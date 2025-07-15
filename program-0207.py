def factorial(No):
    fact = 1
    for icnt in range(1,No+1):
        fact = fact * icnt
    return fact


def main():
    print("Enter a number")
    value = int(input())
    ret = factorial(value)
    print("factorial is ",ret)


if __name__ == "__main__":
    main()