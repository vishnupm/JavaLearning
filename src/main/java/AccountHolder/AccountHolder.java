package AccountHolder;

public class AccountHolder {
    String firstName;
    String lastName;
    int age;
    float accBalance;
    boolean eligibleForCC;

    public void testEligibilityForCC(){
        if (age>25 && accBalance>=20000){
            eligibleForCC = true;
        }
    }
}
