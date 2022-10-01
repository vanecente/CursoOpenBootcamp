from operator import truediv
from typing import final


def bisiesto (año = int):
    if año % 4 == 0 and año % 100 != 0 or año % 400 == 0:
        print (f"El {año} es bisiesto")
    else:
        print(f"No es bisiesto")

bisiesto (2024)

