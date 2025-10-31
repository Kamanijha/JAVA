//package OOPS.assignment.designInharitance.loan;

public class Loan {
    int loanAmount;
     double interestRate;

      Loan(){
      }

    Loan(int loanAmount,double interestRate){
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public String getDetails(){
        return "loanamount is ;"+ loanAmount +"\n interestrate is : " + interestRate;
    }
}
