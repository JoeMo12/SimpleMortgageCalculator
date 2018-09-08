import java.lang.Math;

public class Mortgage {
  //Loan Amount
  private double Principal;
  //Interest Rate
  private double InterestRate;
  //Term
  private double Term;
  //total number of payments
  private double MonthlyPayments;
  //monthly mortgage
  private double MonthlyMortgage;
  
  public Mortgage(double Principal, double InterestRate, double Term) {
   	this.Principal = Principal;
    this.InterestRate = InterestRate/100;
    this.InterestRate = this.InterestRate/12;
    this.Term = Term;
  }
  
  public void calculateMortgage() {
  	MonthlyPayments = Term * 12;
    this.Term = 1 + InterestRate;
    this.Term = Math.pow(this.Term, MonthlyPayments);
    this.MonthlyMortgage = (InterestRate * Term) / (Term - 1);
    this.MonthlyMortgage = Principal * MonthlyMortgage;
  }
  
  public double getMortgage() {
    return this.MonthlyMortgage;
  }
}
