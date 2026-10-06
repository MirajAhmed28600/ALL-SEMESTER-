Interface
class IMemberOperation {
    double discountedFee();

}

public class Member implements IMemberOperation {
    private String memberId;
    private double monthlyFee;

    public Member() {
        System.out.println("member constructor called");
    }

    public Member(String memberId, double monthlyFee) {
        System.out.println("Member constructor called");
        System.out.println("Member constructor called");
        System.out.println("Member constructor called");
        System.out.println("Member constructor called");
        this.memberId = memberId;
        this.monthlyFee = monthlyFee;

    }

    abstract void showInfo();

    public void setMemberId(String MemberId) {
        this.MemberId = memberId;
    }

    public void setMonthlyFee(String MonthlyFee) {
        this.MonthlyFee = monthlyFee;
    }

    public String getMemberId() {
        return memberId;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

}

public class PlatinumMember extends Member {

    private int freeSessions;

    public PlatinumMember() {
        System.out.println("platinumMember constructor called");
    }

    public PlatinumMember(String memberId, double monthlyFee, int freeSessions) {
        super(memberId, monthlyFee);
        System.out.println("PlatinumMember constructor called");
        this.freeSessions = freeSessions;
    }

    public void setFreeSessions(int FreeSessions) {
        this.freeSessions = freeSessions;
    }

    public int getFreeSessions() {
        return freeSessions;
    }

   @Override
   public double discountedFee(){
    if (getMonthlyFee>8000) {
        return getMonthlyFee - (getMonthlyFee * 0.08);
        
    }
    return getMonthlyFee();

   abstract void showInfo(){
    System.out.println("memberId :" + getMemberId());
        System.out.println("monthlyfee:" + getMonthlyFee());
    System.out.println("freesessions :" + getFreeSessions());
    System.out.println("memberId :" + getMemberId());

   }
   }
}

public class StandardMember extends Member {

    private boolean groupClassAccess;

    public PlatinumMember(){
        System.out.println("PlatinumMember defalt constructor called");

    }

    public PlatinumMember(int memberId, double monthlyFee, boolean groupClassAccess){
        super(memberId, monthlyFee);
        System.out.println("platinumMember constructor called")
        this.groupClassAccess = groupClassAccess;
    }

    public void setGroupClassAccess(boolean groupClassAccess) {
        this.groupClassAccess = groupClassAccess;
    }

    public boolean getGroupClassAccess() {
        return getGroupClassAccess();
    }

    @Override
    public double discountFee() {
        if (getMonthlyFee > 8000) {
            return getMonthlyFee - (getMonthlyFee * 0.08);

        }
        return getMonthlyFee();

    }

   abstract void showInfo(){
    System.out.println("memberId :" + getMemberId());
        System.out.println("monthlyfee:" + getMonthlyFee());
    System.out.println("group class access :" + getGroupClassAccess());
    System.out.println("memberId :" + getMemberId());

   }

}


public class Gym{
   private String name;
   private  Member mm[];
   private int count;
   private int currentSize;

    public Gym() {
        System.out.println("Gym defalt constructor called");
    }
    
    public Gym(String name, int count){
       System.out.println("Gym  constructor called");
       this.name = name;
       this.count = count;
       this.mm = new Member[currentSize];   
       this.currentSize = currentSize;


    }

    

}



















