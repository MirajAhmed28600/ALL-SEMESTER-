//================= Fitzone Gym Question======================

interface IMemberOperation {

    double discountedFee();
}


abstract class Member implements IMemberOperation {

    private String memberID;
    private double monthlyFee;

    public Member() {
        System.out.println("Member default constructor called");
    }

    public Member(String memberID, double monthlyFee) {
        System.out.println("Member constructor called");
        this.memberID  = memberID;
        this.monthlyFee = monthlyFee;
    }

    abstract void showInfo();

    public String getMemberID()    { return memberID; }
    public double getMonthlyFee()  { return monthlyFee; }

    public void setMemberID(String memberID)     { this.memberID = memberID; }
    public void setMonthlyFee(double monthlyFee) {this.monthlyFee = monthlyFee; }
}


class PlatinumMember extends Member {

    private int freeSessions;  

    public PlatinumMember() {
        System.out.println("PlatinumMember default constructor called");
    }

    public PlatinumMember(String memberID, double monthlyFee, int freeSessions) {
        super(memberID, monthlyFee);  
        System.out.println("PlatinumMember constructor called");
        this.freeSessions = freeSessions;
    }

    public int  getFreeSessions()              { return freeSessions; }
    public void setFreeSessions(int sessions)  { this.freeSessions = sessions; }

    @Override
    void showInfo() {
        System.out.println("Platinum Member");
        System.out.println("Member ID     : " + getMemberID());
        System.out.println("Monthly Fee   : " + getMonthlyFee());
        System.out.println("Free Sessions : " + freeSessions);
        System.out.println("Discounted Fee: " + discountedFee());
    }

    @Override
    public double discountedFee() {
        if (getMonthlyFee() > 8000) {
            return getMonthlyFee() - (getMonthlyFee() * 0.08); 
        }
        return getMonthlyFee();
    }
}

class StandardMember extends Member {

    private boolean groupClassAccess;

    public StandardMember() {
        System.out.println("StandardMember default constructor called");
    }

    public StandardMember(String memberID, double monthlyFee, boolean groupClassAccess) {
        super(memberID, monthlyFee);   
        System.out.println("StandardMember constructor called");
        this.groupClassAccess = groupClassAccess;
    }

    public boolean isGroupClassAccess()                    { return groupClassAccess; }
    public void    setGroupClassAccess(boolean access)     { this.groupClassAccess = access; }

    @Override
    void showInfo() {
        System.out.println("Standard Member");
        System.out.println("Member ID: " + getMemberID());
        System.out.println("Monthly Fee: " + getMonthlyFee());
        System.out.println("Group Class Access: " + groupClassAccess);
        System.out.println("Discounted Fee: " + discountedFee());
    }

    @Override
    public double discountedFee() {
        if (getMonthlyFee() > 8000) {
            return getMonthlyFee() - (getMonthlyFee() * 0.08);  
        }
        return getMonthlyFee();
    }
}

class Gym {

    private String  name;
    private Member  mm[];   
    private int     count;
    private int     currentSize;

    public Gym() {
        System.out.println("Gym default constructor called");
    }

    public Gym(String name, int count) {
        System.out.println("Gym constructor called");
        this.name    = name;
        this.count   = count;
        this.mm      = new Member[count]; 
        this.currentSize = 0;
    }

    public void addMember(Member m) {
        if (currentSize < count) {
            mm[currentSize] = m;
            currentSize++;
            System.out.println("Member " + m.getMemberID() + " added successfully.");
        } else {
            System.out.println("Gym is full! Cannot add more members.");
        }
    }

    public void removeMember() {
        if (currentSize > 0) {
            System.out.println("Member " + mm[currentSize - 1].getMemberID() + " removed.");
            mm[currentSize - 1] = null;
            currentSize--;
        } else {
            System.out.println("No members to remove.");
        }
    }

    public void showMembers() {
        System.out.println("Members of " + name + " =====");
        for (int i = 0; i < currentSize; i++) {
            mm[i].showInfo();  
            System.out.println();
        }
    }

    public void totalRevenue() {
        double total = 0;
        for (int i = 0; i < currentSize; i++) {
            total += mm[i].getMonthlyFee();
        }
        System.out.println("Total Monthly Revenue of " + name + ": " + total);
    }
}


public class Start {
    public static void main(String[] args) {

        Member m1 = new PlatinumMember("PM001", 9500, 5);
        Member m2 = new StandardMember("SM001", 7500, true);

        System.out.println();

        Gym gym = new Gym("FitZone", 5);

        System.out.println();

        gym.addMember(m1);
        gym.addMember(m2);

        System.out.println();

        gym.showMembers();

        gym.totalRevenue();

        System.out.println();

        gym.removeMember();

        System.out.println();

        IMemberOperation op = new PlatinumMember("PM002", 10000, 3);
        System.out.println("Discounted fee for PM002: " + op.discountedFee());

        m1.setMonthlyFee(12000);
        System.out.println("Updated monthly fee: " + m1.getMonthlyFee());
        System.out.println("New discounted fee : " + ((PlatinumMember) m1).discountedFee());
    }
}