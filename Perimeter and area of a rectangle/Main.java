#include<stdio.h>
int main()
{
  int length=6;
  int breadth=9;
  int perimeter, area;
  
  perimeter = 2*(length+breadth);
  printf("The perimeter of the rectangle is: %d cm\n" ,perimeter);
  area = length*breadth;
  printf("The area of the rectangle is: %d sq cm",area);
  
  return 0;
}