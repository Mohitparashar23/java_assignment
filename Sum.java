//print the sum of 2 integer number

class Sum{
public static void main(String[] args)
{
int a=5;
int b=6;
int sum=a+b;
System.out.println("sum of 2 integer a,b ="+sum);

//print the sum of two floating point number

float d = 3.7f;
float e = 5.7f;
float sumofdecimal= d+e;
System.out.println("sum of two floating point number d,e = " +sumofdecimal);

// sum of 1 integer and 2 floating point number 

int f = 13;
float g = 5.2f;
float h = 8.9f;
float i = f+g+h;
System.out.println("sum of 1 integer and 2 floating number f,g,h = " +i);
 


// sum of 2 integer number stored in byte code

int j=42;
int k=53;
byte l= (byte)(j+k);          // type casting(byte) to store the data in byte container 
System.out.println("sum of two integer in byte code j,k =" +l);


//sum of 2 integer number stored in short type container

int s1= 189;
int s2= 324;
short s3 = (short)(s1+s2);      // type casting(short) to store the data in short container 
System.out.println("sum of two integer in short type ="+s3);



}

}
