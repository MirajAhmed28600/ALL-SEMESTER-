Interface IMemberOperation{
    double dicountedFee();

}

public class Member implements IMemberOperation{
    String memberId;
    double monthlyFee;
    public Member();
    public Member(String memberID, double monthlyFee){
        this.memberID = memberID;
        this.montlyFee;

    }
    abstract void showInfo(){
              
    }


}

