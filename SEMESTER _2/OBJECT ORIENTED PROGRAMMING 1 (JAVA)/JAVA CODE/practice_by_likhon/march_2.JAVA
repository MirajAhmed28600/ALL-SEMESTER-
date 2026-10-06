package fitzonegym;

// Interface
interface IMemberOperation {
    // Returns discounted fee (8% off if fee > 8000)
    double discountedFee();
}


// Abstract class
abstract class Member implements IMemberOperation {

    // Private fields
    private String memberID;
    private double monthlyFee;

    // Default constructor
    public Member() {}

    // Parameterized constructor
    public Member(String memberID, double monthlyFee) {
        this.memberID   = memberID;
        this.monthlyFee = monthlyFee;
    }

    // Abstract method
    abstract void showInfo();

    // Getters
    public String getMemberID()   { return memberID; }
    public double getMonthlyFee() { return monthlyFee; }

    // Setters
    public void setMemberID(String memberID)     { this.memberID = memberID; }
    public void setMonthlyFee(double monthlyFee) { this.monthlyFee = monthlyFee; }
}


// Subclass 1
class PlatinumMember extends Member {

    private int freeSessions;

    // Default constructor
    public PlatinumMember() {}

    // Parameterized constructor
    public PlatinumMember(String memberID, double monthlyFee, int freeSessions) {
        super(memberID, monthlyFee);
        this.freeSessions = freeSessions;
    }

    // Getter and setter
    public int  getFreeSessions()             { return freeSessions; }
    public void setFreeSessions(int sessions) { this.freeSessions = sessions; }

    // Override showInfo
    @Override
    void showInfo() {
        System.out.println("--- Platinum Member ---");
        System.out.println("ID           : " + getMemberID());
        System.out.println("Monthly Fee  : " + getMonthlyFee());
        System.out.println("Free Sessions: " + freeSessions);
        System.out.println("Discounted   : " + discountedFee());
    }

    // Override discountedFee
    @Override
    public double discountedFee() {
        if (getMonthlyFee() > 8000)
            return getMonthlyFee() - (getMonthlyFee() * 0.08); // 8% discount
        return getMonthlyFee();
    }
}


// Subclass 2
class StandardMember extends Member {

    private boolean groupClassAccess;

    // Default constructor
    public StandardMember() {}

    // Parameterized constructor
    public StandardMember(String memberID, double monthlyFee, boolean groupClassAccess) {
        super(memberID, monthlyFee);
        this.groupClassAccess = groupClassAccess;
    }

    // Getter and setter
    public boolean isGroupClassAccess()                { return groupClassAccess; }
    public void    setGroupClassAccess(boolean access) { this.groupClassAccess = access; }

    // Override showInfo
    @Override
    void showInfo() {
        System.out.println("--- Standard Member ---");
        System.out.println("ID               : " + getMemberID());
        System.out.println("Monthly Fee      : " + getMonthlyFee());
        System.out.println("Group Class      : " + groupClassAccess);
        System.out.println("Discounted Fee   : " + discountedFee());
    }

    // Override discountedFee
    @Override
    public double discountedFee() {
        if (getMonthlyFee() > 8000)
            return getMonthlyFee() - (getMonthlyFee() * 0.08); // 8% discount
        return getMonthlyFee();
    }
}


// Gym class
class Gym {

    private String name;
    private Member mm[];   // array to hold members
    private int count;
    private int currentSize;

    // Default constructor
    public Gym() {}

    // Parameterized constructor
    public Gym(String name, int count) {
        this.name        = name;
        this.count       = count;
        this.mm          = new Member[count];
        this.currentSize = 0;
    }

    // Add member
    public void addMember(Member m) {
        if (currentSize < count) {
            mm[currentSize] = m;
            currentSize++;
            System.out.println(m.getMemberID() + " added.");
        } else {
            System.out.println("Gym is full.");
        }
    }

    // Remove last member
    public void removeMember() {
        if (currentSize > 0) {
            System.out.println(mm[currentSize - 1].getMemberID() + " removed.");
            mm[currentSize - 1] = null;
            currentSize--;
        } else {
            System.out.println("No members to remove.");
        }
    }

    // Show all members
    public void showMembers() {
        System.out.println("\n===== " + name + " Members =====");
        for (int i = 0; i < currentSize; i++) {
            mm[i].showInfo(); // polymorphism
            System.out.println();
        }
    }

    // Total revenue
    public void totalRevenue() {
        double total = 0;
        for (int i = 0; i < currentSize; i++)
            total += mm[i].getMonthlyFee();
        System.out.println("Total Revenue: " + total);
    }
}


// Driver class
public class Start {
    public static void main(String[] args) {

        // Polymorphic objects
        Member m1 = new PlatinumMember("PM001", 9500, 5);
        Member m2 = new StandardMember("SM001", 7500, true);

        // Create gym
        Gym gym = new Gym("FitZone", 5);

        // Add members
        gym.addMember(m1);
        gym.addMember(m2);

        // Show all members
        gym.showMembers();

        // Show revenue
        gym.totalRevenue();

        // Remove a member
        gym.removeMember();

        // Interface used polymorphically
        IMemberOperation op = new PlatinumMember("PM002", 10000, 3);
        System.out.println("Discounted Fee: " + op.discountedFee());

        // Encapsulation - update using setter
        m1.setMonthlyFee(12000);
        System.out.println("Updated Fee: " + m1.getMonthlyFee());
    }
}