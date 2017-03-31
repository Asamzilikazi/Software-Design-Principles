package za.ac.mzilikazi.OpenClosedPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class BusinessLoanProcessing extends LoanPool {

    @Override
    public boolean isApprovedLoan() {
        System.out.print("BusinessLoanProcessing: Validating business loan application...\n");
        return true;
    }
}
