package basic1;

import java.util.Arrays;
import java.util.List;

interface Add{
int add(int a,int b);
}

interface Add3{
int add(int a,int b,int c);
}



public class LamdaEx2 {

public static void main(String[] args) {

//single line lambda
List<Integer> array=Arrays.asList(1,3,4);
array.forEach(x->System.out.println(x));

array.forEach(x->{x=x+2;System.out.println(x);});
array.forEach((x)->{x=x/2; x=x+2;x=x*2;System.out.println(x);});

Add add=(int a,int b)-> a+b;
System.out.println(add.add(3, 4));

Add3 add1=(int a,int b,int c)->a+b+c;
System.out.println(add1.add(1, 3, 5));

}

}
