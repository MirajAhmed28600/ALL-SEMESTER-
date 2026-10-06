
// =========================================================
// FitZone Gym Management System
// Demonstrates all OOP concepts:
// 1. Interface        -> IMemberOperation
// 2. Abstraction      -> abstract class Member
// 3. Inheritance      -> PlatinumMember & StandardMember extend Member
// 4. Encapsulation    -> private fields + getters/setters
// 5. Polymorphism     -> Member reference to subclass objects
// =========================================================


// ---------- INTERFACE ----------
// Any class that implements this must provide discountedFee()
interface IMemberOperation {

    // Abstract method — calculates discounted fee
    // If monthlyFee > 8000, member gets 8% discount
    double discountedFee();
}


// ---------- ABSTRACTION ----------
// Abstract class: cannot be instantiated directly
// Member also implements the IMemberOperation interface
abstract class Member implements IMemberOperation {

    // ---------- ENCAPSULATION ----------
    // Fields are private — accessed only through getters/setters
    private String memberID;
    private double monthlyFee;

    // Default constructor
    public Member() {
        System.out.println("Member default constructor called");
    }

    // Parameterized constructor
    public Member(String memberID, double monthlyFee) {
        System.out.println("Member constructor called");
        this.memberID  = memberID;
        this.monthlyFee = monthlyFee;
    }

    // Abstract method — must be overridden by subclasses
    abstract void showInfo();

    // Getters (Encapsulation)
    public String getMemberID()    { return memberID; }
    public double getMonthlyFee()  { return monthlyFee; }

    // Setters (Encapsulation)
    public void setMemberID(String memberID)     { this.memberID = memberID; }
    public void setMonthlyFee(double monthlyFee) { this.monthlyFee = monthlyFee; }
}


// ---------- INHERITANCE ----------
// PlatinumMember "is-a" Member
// Also implements discountedFee() from IMemberOperation
class PlatinumMember extends Member {

    private int freeSessions;  // encapsulated field

    // Default constructor
    public PlatinumMember() {
        System.out.println("PlatinumMember default constructor called");
    }

    // Parameterized constructor
    public PlatinumMember(String memberID, double monthlyFee, int freeSessions) {
        super(memberID, monthlyFee);   // call parent constructor
        System.out.println("PlatinumMember constructor called");
        this.freeSessions = freeSessions;
    }

    // Encapsulation: getter / setter
    public int  getFreeSessions()              { return freeSessions; }
    public void setFreeSessions(int sessions)  { this.freeSessions = sessions; }

    // ---------- POLYMORPHISM (method overriding) ----------
    @Override
    void showInfo() {
        System.out.println("--- Platinum Member ---");
        System.out.println("Member ID     : " + getMemberID());
        System.out.println("Monthly Fee   : " + getMonthlyFee());
        System.out.println("Free Sessions : " + freeSessions);
        System.out.println("Discounted Fee: " + discountedFee());
    }

    // Implementing the IMemberOperation interface method
    @Override
    public double discountedFee() {
        if (getMonthlyFee() > 8000) {
            return getMonthlyFee() - (getMonthlyFee() * 0.08);  // 8% discount
        }
        return getMonthlyFee();
    }
}


// ---------- INHERITANCE ----------
// StandardMember "is-a" Member
class StandardMember extends Member {

    private boolean groupClassAccess;

    // Default constructor
    public StandardMember() {
        System.out.println("StandardMember default constructor called");
    }

    // Parameterized constructor
    public StandardMember(String memberID, double monthlyFee, boolean groupClassAccess) {
        super(memberID, monthlyFee);   // call parent constructor
        System.out.println("StandardMember constructor called");
        this.groupClassAccess = groupClassAccess;
    }

    // Encapsulation: getter / setter
    public boolean isGroupClassAccess()                    { return groupClassAccess; }
    public void    setGroupClassAccess(boolean access)     { this.groupClassAccess = access; }

    // ---------- POLYMORPHISM (method overriding) ----------
    @Override
    void showInfo() {
        System.out.println("--- Standard Member ---");
        System.out.println("Member ID         : " + getMemberID());
        System.out.println("Monthly Fee       : " + getMonthlyFee());
        System.out.println("Group Class Access: " + groupClassAccess);
        System.out.println("Discounted Fee    : " + discountedFee());
    }

    // Implementing the IMemberOperation interface method
    @Override
    public double discountedFee() {
        if (getMonthlyFee() > 8000) {
            return getMonthlyFee() - (getMonthlyFee() * 0.08);  // 8% discount
        }
        return getMonthlyFee();
    }
}


// ---------- GYM CLASS ----------
class Gym {

    private String  name;
    private Member  mm[];   // polymorphic array — holds both member types
    private int     count; // maximum number of members allowed
    private int     currentSize; // tracks how many members are currently added

    // Default constructor
    public Gym() {
        System.out.println("Gym default constructor called");
    }

    // Parameterized constructor
    public Gym(String name, int count) {
        System.out.println("Gym constructor called");
        this.name    = name;
        this.count   = count;// set the maximum number of members
        this.mm      = new Member[count];  // array initialized with given size
        this.currentSize = 0;// track how many members are currently added
    }

    // Add a member to the array
    public void addMember(Member m) {
        if (currentSize < count) {
            mm[currentSize] = m; // add member to the array
            currentSize++; // increment the count of current members
            System.out.println("Member " + m.getMemberID() + " added successfully."); 
        } else {
            System.out.println("Gym is full! Cannot add more members.");
        }
    }

    // Remove the last added member
    public void removeMember() {
        if (currentSize > 0) { // check if there are members to remove
            System.out.println("Member " + mm[currentSize - 1].getMemberID() + " removed.");  // show which member is removed
            mm[currentSize - 1] = null;  // optional: clear reference for garbage collection
            currentSize--;  // decrease the count of current members
        } else {
            System.out.println("No members to remove.");  //
        }
    }

    // Show all members — polymorphism: correct showInfo() called at runtime
    public void showMembers() {
        System.out.println("\n===== Members of " + name + " =====");
        for (int i = 0; i < currentSize; i++) {  // loop through only the added members
            mm[i].showInfo();   // dynamic dispatch
            System.out.println();
        }
    }

    // Display total revenue from all members
    public void totalRevenue() {
        double total = 0;
        for (int i = 0; i < currentSize; i++) {
            total += mm[i].getMonthlyFee();
        }
        System.out.println("Total Monthly Revenue of " + name + ": " + total);
    }
}


// ---------- DRIVER CLASS ----------
public class Start {
    public static void main(String[] args) {

        // POLYMORPHISM: Member reference points to subclass objects
        Member m1 = new PlatinumMember("PM001", 9500, 5);
        Member m2 = new StandardMember("SM001", 7500, true);

        System.out.println();

        // Create one Gym object using parameterized constructor
        Gym gym = new Gym("FitZone", 5);

        System.out.println();

        // Demonstrate addMember()
        gym.addMember(m1); 
        gym.addMember(m2);

        System.out.println();

        // showInfo() called polymorphically inside showMembers()
        gym.showMembers();

        // totalRevenue() — sums all monthly fees
        gym.totalRevenue();

        System.out.println();

        // Demonstrate removeMember()
        gym.removeMember();

        System.out.println();

        // discountedFee() called via IMemberOperation reference (polymorphism)
        IMemberOperation op = new PlatinumMember("PM002", 10000, 3);
        System.out.println("Discounted fee for PM002: " + op.discountedFee());

        // Encapsulation in action — update fee via setter, read via getter
        m1.setMonthlyFee(12000);
        System.out.println("Updated monthly fee: " + m1.getMonthlyFee());
        System.out.println("New discounted fee : " + ((PlatinumMember) m1).discountedFee());
    }
}