package za.ac.mzilikazi.OpenClosedPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class LoanApprovalManager {

    public LoanApprovalManager() {
    }
    public void processPersonalLoan(PersonalLoanProcessing personalLoanProcessing){
        if(personalLoanProcessing.isApprovedLoan()){
            System.out.println("LoanApprovalManager: Qualifies. Currently processing loan for approval....\n");
        }
    }

    public void processBusinessLoan(PersonalLoanProcessing personalLoanProcessing){
        if(personalLoanProcessing.isApprovedLoan()){
            System.out.println("LoanApprovalManager:Invalid loan. Can't process business loan under personal loan.\n");
        }
    }
}
