package za.ac.mzilikazi.OpenClosedPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class LoanApprovalManager {

    public LoanApprovalManager() {
    }
    public void processLoan(LoanPool pool){
        if(pool.isApprovedLoan()){
            System.out.println("LoanApprovalManager: Qualifies. Currently processing loan for approval....\n");
        }
    }
}
