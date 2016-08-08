#include <iostream>

void swapNoTemp(int* a, int* b){
    *a = *a + *b;
    *b = *a - *b;
    *a = *a - *b;
}

void displayValues(int* a, int* b){
    printf("Value 'a' = %d, and value 'b' = %d\n",*a, *b);
}

int main() {
    int* a;
    int* b;
    int c = 1;
    int d = 7;

    a = &c;
    b = &d;

    displayValues(a,b);
    swapNoTemp(a,b);
    displayValues(a,b);
    return 0;
}