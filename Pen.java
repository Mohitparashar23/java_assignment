// In one school4 students are there who are 7 years of old named as Ram, Shyam, Raghu, Hari.
//Ram is having 4 pens , hari is having 7 pens, Raghu is having 9 pens, Shyam is having 11 pens.
// They don't know how to calculate total pens do they have. Write a program to help them to find the how many pens do they have ?

class Pen{
public static void main (String[] args)
{

int ram= 4;
int shyam = 11;
int raghu = 9;
int hari = 7;
int total = ram+shyam+raghu+hari;


System.out.println("No of pens Shyam have =" +shyam);
System.out.println("No of pens Ram have =" +ram);
System.out.println("No of pens Raghu have =" +raghu);
System.out.println("No of pens Hari have =" +hari);


System.out.println("Total no of pens they have =" +total);
}
}