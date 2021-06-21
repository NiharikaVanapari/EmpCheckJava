import java.util.Random;
class EmpCheckJava
{
public static void main(String[] args)
{
int full_day =8;
int wage_per_hour=5;
int daily_wage;
int part_time=4;
int num_of_workingdays=20;
int max_hrs_in_month=100;
int emphrs=0, totEmphrs=0, totWorkingdays=0;
System.out.println("Welcome to Employee Wage Computation");
while(totEmphrs<=max_hrs_in_month && totWorkingdays<num_of_workingdays)
{
totWorkingdays++;

//for(int day=0;day<num_of_workingdays;day++)
//{
Random random = new Random();
int random1 = random.nextInt(3);
//if(random1 == 1)
//{
//System.out.println("Employee is Present");
//daily_wage=full_day*wage_per_hour;
//System.out.println("Employee wage is " +daily_wage);
//}
//else if(random1 == 2)
//{
//System.out.println("Employee is Part time");
//daily_wage=part_time*wage_per_hour;
//System.out.println("Employee wage is " +daily_wage);
//}
//else
//System.out.println("Employee is Absent");
switch(random1)
{
case 1:
emphrs=8;

System.out.println("Employee hours is " +emphrs);
break;
case 2:
emphrs=4;

System.out.println("Employee wage is " +emphrs);
break;
default:
System.out.println("Employee is Absent");
}
totEmphrs=emphrs;
System.out.println("Day#: "+totWorkingdays +" Emp hr: "+emphrs);

}

}
}

