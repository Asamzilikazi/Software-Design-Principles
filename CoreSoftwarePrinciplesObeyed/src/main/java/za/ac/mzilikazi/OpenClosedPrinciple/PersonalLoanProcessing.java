package za.ac.mzilikazi.OpenClosedPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class PersonalLoanProcessing extends LoanPool{

    public PersonalLoanProcessing() {
    }

    @Override
    public boolean isApprovedLoan() {
        System.out.print("PersonalLoanProcessing: Validating personal loan application...\n");
        return true;
    }
}
