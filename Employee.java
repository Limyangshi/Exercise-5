import java.util.Scanner;
   public class Employee{
   
      static Scanner scan = new Scanner(System.in);
      
         public static void main(String [] args){
            int idNum;
            double grossPay,stateTax,federalTax;
            
            System.out.print("Enter Employee ID number\t:");
            idNum=scan.nextInt();
            System.out.print("Enter Employee gross pay\t:RM");
            grossPay=scan.nextDouble();
            System.out.print("Enter state tax\t:RM");
            stateTax=scan.nextDouble();
            System.out.print("Enter federal tax\t:RM");
            federalTax=scan.nextDouble();
            System.out.println();
            
            PayrollDemo pay = new PayrollDemo(idNum,grossPay,stateTax,federalTax);
            pay.calculateNetPay();
                       
            System.out.print("Enter your employee ID number\t: " +idNum);
            System.out.printf("\nEnter your Gross Pay\t:RM%.2f",grossPay);
            System.out.printf("\nEnter your State Pay\t:RM%.2f",stateTax);
            System.out.printf("\nEnter your Federal Tax\t:RM%.2f",federalTax);
            
            pay.printOutput();
            }//end main
          }//end class Employee
          
            class PayrollDemo{
               private int idNum;
               private double grossPay,stateTax,federalTax,netPay;
               
               public PayrollDemo(int idNum,double grossPay,double stateTax,double federalTax){
                  this.grossPay=grossPay;
                  this.stateTax=stateTax;
                  this.federalTax=federalTax;
                  }//end PayrollDemo
                  
                  public double calculateNetPay(){
                     return netPay=grossPay-(stateTax+federalTax);
                     }//end calculateNetPay
                     
                     public void printOutput(){ 
                        System.out.printf("%n%nNet pay is\t:RM%.2f",calculateNetPay());
                        }//end printOutput
                    }//end class Payroll
                     
               
            

            
            
          
            
            
            
         