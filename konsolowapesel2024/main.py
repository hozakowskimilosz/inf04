pesel = [0, 6, 2, 6, 0, 7, 0, 5, 9, 3, 0]
peselUser = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
weights = [1, 3, 7, 9, 1, 3, 7, 9, 1, 3]

for i in range(len(peselUser)):
    char = int(input("Podaj liczbe: "))
    peselUser[i] = char

def checkSum(pesel):
    S = 0
    R = 0
    for i in range(len(pesel) - 1):
        S += pesel[i] * weights[i]
    M = S % 10
    
    if M == 0:
        R = 0
    else:
        R = 10 - M

    if R == pesel[10]:
        return True
    else:
        return False

def checkGender(pesel):
    if int(pesel[9]) % 2 == 0:
        return "K"
    else:
        return "M"
        
if checkGender(peselUser) == "K":
    print("Kobieta")
else:
    print("Mężczyzna")
    
if checkSum(peselUser):
    print("Numer zgodny")
else:
    print("Numer niezgodny")
    
    
'''
**********************************************
nazwa funkcji: checkGender
opis funkcji: funkcja ta sprawdza płeć osoby na podstawie jej numeru PESEL
parametry: pesel - zmienna ta jest tablicą przechowującą pojedyncze cyfry numeru pesel
zwracany typ i opis: zwracana jest wartość typu string o wartości "K" lub "M"
autor: 06260705930
***********************************************
'''