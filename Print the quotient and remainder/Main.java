#include<stdio.h>
int main()
{
  int m=365,n=4;
  int Quotient,Remainder;
  Quotient = m/n;
  printf("Quotient: %d\n",Quotient);
  
  Remainder = m%n;
  printf("Remainder: %d",Remainder);
  return 0;
}