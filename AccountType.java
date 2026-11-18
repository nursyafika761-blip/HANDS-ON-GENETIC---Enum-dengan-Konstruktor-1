public enum AccountType {
    SAVINGS("SA", 2.0),
    CREDIT("CR", 1.0),
    DEPOSIT("DP", 0.0);

    private String code;
    private double interestRate;

    private AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }
}