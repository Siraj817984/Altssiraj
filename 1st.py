def add():
    a=10
    b=20
    print(a+b)

def add():
    a=10
    b=20
    print(a-b)

def add():
    a=10
    b=20
    print(a*b)

def add():
    a=10
    b=20
    print(a/b)
print("1-Add")
print("2-subtract")
print("3-multiplication")
print("4-division")
print("5-exit")
choice=int(input("enter your choice"))
if choice==1:
   add()
elif choice==2:
    sub()
elif choice==3:
    mul()
elif choice==4:
    div()
else:
    print("good bye")
    flag=input("do u want to continue (y/n)")
    print(flag)
    if(flag=="n"):
        print("thanl you")