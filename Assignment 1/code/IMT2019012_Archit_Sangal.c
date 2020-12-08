#include<stdio.h>
#define arr_size 100000

struct data
{
    int type;
    float efficiency;
    float amount_left;
    float range;
};

int main()
{
    int n;
    scanf("%d",&n);

    // invalid input
    if(n>arr_size)
        return 0;
    
    // array of structures for storing information related to every car.
    struct data cars[arr_size];

    for(int i=0;i<n;i++)
    {
        scanf("%d",&cars[i].type);
        scanf("%f",&cars[i].efficiency);
        scanf("%f",&cars[i].amount_left);

        // calculating the range for each car
        if(cars[i].type == 1)
        {
            cars[i].range = cars[i].efficiency*cars[i].amount_left;
        }
        else if(cars[i].type==2)
        {
            // it is an invalid input according to defination so program ends.
            if(cars[i].efficiency == 0)
                return 0;
            cars[i].range = cars[i].amount_left/100*100000/cars[i].efficiency;
        }
        else
        {
            return 0;
        }
    }  
    
    for(int i=n-1;i>=0;i--)
    {
        printf("Car %d: range = %.2f\n",i+1,cars[i].range);
    }

    /*
    Ques:   What if the specification changes, and diesel and electric cars have a different number of
            attributes to define efficiency. For example, if the battery sizes of vehicles are different,
            and the size of the battery is an additional field in the input for electric cars. How easy
            would it be to modify your program to accommodate this?

    Ans:    It is easy to modify. If the number of attributes are changed, add the variables in the structure 'data',
            if it is a common attribute in both the cars. If the attribute is different for both the cars then we may
            make different structures for both and accordingly take 2 arrays. And some other minor changes. Here, I
            wrote the code this way as it will take less space in this case. Some conditions may need to be added to
            calculate the range, if any changes are included.

    Ques:   If you had to also print out the ranges of the cars in decreasing order of range, what changes would
            you need to your data structures (if any).

    Ans:    Sorting of array 'cars' according to variable range. As n can not be greater than order of 10^5 -- As
            discussed with T.A we can continue using the array of structures. Sorting can be done in  O(n log(n)).
            Range for a car can be calculated in constant time. For all the cars, it would take linear order.
    */
   
    return 0;
}
