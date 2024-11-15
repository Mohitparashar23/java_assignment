/* Area of rectangle L = 4cm and W = 5.6cm
Perimeter of rectangle L = 4.1cm and W = 3.2
Area and perimeter of square side = 6cm   */


class Geometry{
public static void main (String[] args)
{

int L1 = 4;
int s = 6;
float W1 = 5.6f;
float L2 = 4.1f;
float W2 = 3.2f;

float area_r,peri_r;
int area_s, peri_s;

area_r = L1*W1;
peri_r = 2*(L2+W2);
area_s = s*s;
peri_s = 4*s;

System.out.println("Area of rectangle =" +area_r);
System.out.println("Perimeter of rectangle =" +peri_r);
System.out.println("Area of square =" +area_s);
System.out.println("Perimeter of square =" +peri_s);

}
}