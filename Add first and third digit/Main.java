#include<stdio.h>
int main()
{
  int n,first,last,sum;
  scanf("%d",&n);
  first=n/100;
  last=n%10;
  sum=first+last;
  printf("%d",sum);
  return 0;
}