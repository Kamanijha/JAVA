//package OOPS.assignment.designInharitance.loan;

public class Personal extends Loan{
    String purpose;
    String employmentType;
    
     Personal(){
     }

    Personal(int loanAmount,double interestRate,String purpose,String employmentType){
        super(loanAmount,interestRate);
        this.purpose = purpose;
        this.employmentType = employmentType;
    }

   
    public String getDetails() {
        
        return super.getDetails()+"\npurpose is : "+purpose+"\nemploymenrType is :" + employmentType;
    }

}
