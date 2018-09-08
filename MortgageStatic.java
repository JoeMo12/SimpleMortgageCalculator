import java.lang.Math;

public class Mortgage {
  //Loan Amount
  private static double Principal;
  //Interest Rate
  private static double InterestRate;
  //Term
  private static double Term;
  //total number of payments
  private static double MonthlyPayments;
  //monthly mortgage
  private static double MonthlyMortgage;
  
  public static double getMortgage(double principal, double interestRate, double term) {
    Principal = principal;
    InterestRate = interestRate/100;
    InterestRate = InterestRate/12;
    Term = term;
  	MonthlyPayments = Term * 12;
    Term = 1 + InterestRate;
    Term = Math.pow(Term, MonthlyPayments);
    MonthlyMortgage = (InterestRate * Term) / (Term - 1);
    MonthlyMortgage = Principal * MonthlyMortgage;
    return MonthlyMortgage;
  }
}
