package za.ac.mzilikazi.OpenClosedPrinciple;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-30.
 */
public class TestLoanApprovalManager {
    BusinessLoanProcessing businessLoanProcessing;
    LoanApprovalManager personalLoan;
    PersonalLoanProcessing personalLoanProcessing;
    LoanApprovalManager businessLoan;

    @Before
    public void setUp() throws Exception {
        personalLoanProcessing = new PersonalLoanProcessing();
        personalLoan = new LoanApprovalManager();
        businessLoanProcessing = new BusinessLoanProcessing();
        businessLoan = new LoanApprovalManager();
    }

    @Test
    public void testProcessClaim() throws Exception {
        personalLoan.processLoan(personalLoanProcessing);
        businessLoan.processLoan(businessLoanProcessing);

    }
}
