#include<stdio.h>
int sum (int);
int main()
{
    int n,s;
    printf("enter the number: ");
    scanf ("%d",&n);
    s=sum(n);
    printf("the sum of digits of %d is %d",n,s);
    return 0;

}
int sum(int num)
{
    int r,sum=0;
    while(num>0)
    {
        r=num%10;
        sum=sum+r;
        num=num/10;
    }
    return sum;
}
