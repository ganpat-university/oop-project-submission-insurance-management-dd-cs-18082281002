import java.util.*;
class insurance
{

      void agent()
{
while(true){
System.out.println("\tAGENT");
System.out.println("\tselect the type of insurance");
System.out.println("\t-------------------------------");
System.out.println("\t1)LIFE INSURANCE");
System.out.println("\t2)VEHICLE INSURANCE");
System.out.println("\t3)HEALTH INSURANCE");
System.out.println("\t4)HOUSE INSURANCE");
System.out.println("\t5)EXIT");
System.out.println("\t-------------------------------");
System.out.print("\tEnter Choice :");
int y;
Scanner sc=new Scanner(System.in);
y=sc.nextInt();

if(y==1)
{
// about life insurance
// main
                System.out.println("get life insurance at rate 10% of total amount per year");
}
if(y==2)
{
// about vehicle insurance
System.out.println("get life insurance at rate 8% of total amount per year");
}
if(y==3)
{
// about health insurance
System.out.println("get life insurance at rate 10% of total amount per year");
}
if(y==4)
{
// about house insurance
System.out.println("get life insurance at rate 8% of total amount per year");
}
if(y==5)
{ break; }}
}
void inforvehicle()
{
System.out.println(" ENTER YOUR VEHICLE STATUS ;");
String a,b;
long c;
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
System.out.println(" ENTER YOUR VEHICLE NUMBER;");
b=sc.nextLine();
System.out.println(" ENTER YOUR PHONE NUMBER;");
c=sc.nextInt();
System.out.println(" ENTER YOUR AMOUNT OF MONEY OF INSURANCE :");
double m=sc.nextInt();
m=(8*m)/100;
System.out.println(" EMI per year "+m);

}
void inforhealth()
{
Scanner sc=new Scanner(System.in);
int ag;
String a;
System.out.println(" ENTER YOUR AGE:");
ag=sc.nextInt();
System.out.println(" ENTER YOUR NAME :");
a=sc.nextLine();
a=sc.nextLine();
System.out.println(" ENTER YOUR AMOUNT OF MONEY OF INSURANCE :");
double m=sc.nextInt();
m=(8*m)/100;
System.out.println(" EMI per year "+m);


}
void inforhouse()
{
Scanner sc=new Scanner(System.in);
int ag;
String v;
System.out.println(" ENTER YOUR ADDRESS:");
ag=sc.nextInt();
System.out.println(" ENTER YOUR GOV. ID NUMBER :");
v=sc.nextLine();
v=sc.nextLine();
System.out.println(" ENTER YOUR AMOUNT OF MONEY OF INSURANCE :");
double m=sc.nextInt();
m=(8*m)/100;
System.out.println("EMI per year"+m);


}
void inforlife()
{
Scanner sc=new Scanner(System.in);
int ag;
String a;

System.out.println(" ENTER YOUR AGE:");
ag=sc.nextInt();
System.out.println(" ENTER YOUR NAME :");
a=sc.nextLine();
a=sc.nextLine();
System.out.println(" ENTER YOUR AMOUNT OF MONEY OF INSURANCE :");
double m=sc.nextInt();
m=(8*m)/100;
System.out.println(" EMI per year "+m);

}
void customer()
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your name:");
String n=sc.nextLine();
insurance ob=new insurance();
while(true)
{      
System.out.println("Enter the type of insurance you want");
System.out.println("1).Health Insurance");
System.out.println("2).Life Insurance");
System.out.println("3).House Insurance");
System.out.println("4).Vehicle Insurance");
System.out.println("5).Exit");
System.out.println("Enter your choice : ");

int x=sc.nextInt();
if(x==1)
{
ob.inforhealth();
}
if(x==2)
{
ob.inforlife();
}
if(x==3)
{
ob.inforhouse();
}
if(x==4)
{
ob.inforvehicle();
}
if(x==5)
{break;}
}
}
public static void main(String args[])
{ int x;

insurance obj=new insurance();
Scanner sc=new Scanner(System.in);

while(true)
{
System.out.println("\t-------------------------------");
System.out.println("\t1)Get insurance offers");
System.out.println("\t2)Register your insurance offer");
System.out.println("\t3)Exit");
System.out.println("\t-------------------------------");
System.out.print("\tPlease enter your : ");
x=sc.nextInt();

if(x==1)
{ obj.agent(); }
if(x==2)
{ obj.customer(); }
if(x==3)
{ break; }
}

}
}