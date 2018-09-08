public class House {

    //House
    private String houseName;
    //Income
    //Add together rent, laundry, storage and misc Income to get Monthly Income
    private int rent;
    private int laundryIncome;
    private int storageIncome;

    private int monthlyIncome;
    //Expenses
    //Add together all expenses and put the value in monthly Expenses
    private int tax;
    private int insurance;
    private int electricFees;
    private int waterFees;
    private int sewerFees;
    private int garbageFees;
    private int gasFees;
    private int hoaFees;
    private int lawnFees;
    private int snowFees;
    private int vacancy;
    private int repairs;
    private int capitalExpenditure;
    private int propertyManagement;
    private int mortgage;

    private int monthlyExpenses;
    //Cashflow
    //Holds the value for the cashflow
    private int monthlycashflow;
    private int annualcashflow;
    //Cash on Cash ROI
    //Data to calculate Cash on Cash ROI
    private int downpayment;
    private int closingCost;
    private int rehab;
    private int totalInvestment;

    private int cashoncashROI;

    public House(String houseName, int rent, int laundryIncome, int storageIncome, int tax, int insurance, int electricFees, int waterFees, int sewerFees, int garbageFees, int gasFees, int hoaFees, int lawnFees, int snowFees, int vacancy, int repairs, int capitalExpenditure, int propertyManagement, int mortgage, int downpayment, int closingCost, int rehab, int totalInvestment) {
        this.houseName = houseName;
        this.rent = rent;
        this.laundryIncome = laundryIncome;
        this.storageIncome = storageIncome;
        this.tax = tax;
        this.insurance = insurance;
        this.electricFees = electricFees;
        this.waterFees = waterFees;
        this.sewerFees = sewerFees;
        this.garbageFees = garbageFees;
        this.gasFees = gasFees;
        this.hoaFees = hoaFees;
        this.lawnFees = lawnFees;
        this.snowFees = snowFees;
        this.vacancy = vacancy;
        this.repairs = repairs;
        this.capitalExpenditure = capitalExpenditure;
        this.propertyManagement = propertyManagement;
        this.mortgage = mortgage;
        this.downpayment = downpayment;
        this.closingCost = closingCost;
        this.rehab = rehab;
        this.totalInvestment = totalInvestment;
    }


    private void Expenses() {
        monthlyExpenses = tax + insurance + electricFees + waterFees + sewerFees + garbageFees + gasFees
                + hoaFees + lawnFees + snowFees + vacancy + repairs + capitalExpenditure + propertyManagement + mortgage;
    }

    private void MonthlyCashFlow() {
        monthlycashflow = monthlyIncome - monthlyExpenses;
    }

    private void AnnualCashFlow() {
        MonthlyCashFlow();
        annualcashflow = monthlycashflow * 12;
    }

    private void TotalInvestment() {
        totalInvestment = downpayment + closingCost + rehab;
    }

    private void CashonCashROI() {
        TotalInvestment();
        AnnualCashFlow();
        cashoncashROI = annualcashflow / totalInvestment;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public void setLaundryIncome(int laundryIncome) {
        this.laundryIncome = laundryIncome;
    }

    public void setStorageIncome(int storageIncome ) {
        this.storageIncome = storageIncome;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public void setElectricFees(int electricFees) {
        this.electricFees = electricFees;
    }

    public void setWaterFees(int waterFees) {
        this.waterFees = waterFees;
    }

    public void setSewerFees(int sewerFees) {
        this.sewerFees = sewerFees;
    }

    public void setGarbageFees(int garbageFees) {
        this.garbageFees = garbageFees;
    }

    public void setGasFees(int gasFees) {
        this.gasFees = gasFees;
    }

    public void setHoaFees(int hoaFees) {
        this.hoaFees = hoaFees;
    }

    public void setLawnFees(int lawnFees) {
        this.lawnFees = lawnFees;
    }

    public void setSnowFees(int snowFees) {
        this.snowFees = snowFees;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }

    public void setRepairs(int repairs) {
        this.repairs = repairs;
    }

    public void setCapitalExpenditure(int capitalExpenditure) {
        this.capitalExpenditure = capitalExpenditure;
    }

    public void setPropertyManagement(int propertyManagement) {
        this.propertyManagement = propertyManagement;
    }

    public void setMortgage(int mortgage) {
        this.mortgage = mortgage;
    }

    public void setDownpayment(int downpayment) {
        this.downpayment = downpayment;
    }

    public void setClosingCost(int closingCost) {
        this.closingCost = closingCost;
    }

    public void setRehab(int rehab) {
        this.rehab = rehab;
    }

}