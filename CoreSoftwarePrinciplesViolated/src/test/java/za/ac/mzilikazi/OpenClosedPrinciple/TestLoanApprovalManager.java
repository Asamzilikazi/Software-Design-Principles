package za.ac.mzilikazi.OpenClosedPrinciple;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-30.
 */
public class TestLoanApprovalManager {

    LoanApprovalManager personalLoan;
    PersonalLoanProcessing personalLoanProcessing;


    @Before
    public void setUp() throws Exception {
        personalLoanProcessing = new PersonalLoanProcessing();
        personalLoan = new LoanApprovalManager();

    }

    @Test
    public void testProcessClaim() throws Exception {
        personalLoan.processPersonalLoan(personalLoanProcessing);
        personalLoan.processBusinessLoan(personalLoanProcessing);

    }
}
