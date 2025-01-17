package AccountHolder;

public class AccountHolderObjects {
    public static void main(String[] args) {
        AccountHolder tom = new AccountHolder();
        AccountHolder jerry = new AccountHolder();

        tom.firstName = "Tom";
        tom.lastName = "Hardy";
        tom.age = 22;
        tom.accBalance = 15000;
        tom.testEligibilityForCC();
        System.out.println("Is Tom eligible for CC: "+tom.eligibleForCC);

        jerry.firstName = "Jerry";
        jerry.lastName = "Den";
        jerry.age = 32;
        jerry.accBalance = 35000;
        jerry.testEligibilityForCC();
        System.out.println("Is Jerry eligible for CC: "+jerry.eligibleForCC);
    }
}
