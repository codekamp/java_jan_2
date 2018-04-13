package codekamp;

public class Demo {

    private static boolean airtelSaysInvalidNumber = false;
    private static boolean airtelSaysNetworkCongestion = false;

    public static void main(String[] args) {
        Demo.hello(5);

//         marketing module
//        try {
//            Demo.sendSms("Get credit card at 0%....", "+918285601665");
//        } catch (Exception e) {
//            System.out.println("send email");
//            return;
//        } finally {
//
//        }
//
//        System.out.println("hello");
//
//        try {
//            Demo.transferMoney(999);
//        } catch (AboveDailyTransactionLimitException e) {
//
//        } catch (NumberNotValidException e) {
//
//        } catch (NetworkCongestionException e) {
//
//        }
//
//        System.out.println("We have sent you an OTP. Please enter here.");
    }

    public static void transferMoney(int amount) throws AboveDailyTransactionLimitException, NumberNotValidException, NetworkCongestionException {
        // money transfer module

        if (amount > 10000) {
            throw new AboveDailyTransactionLimitException();
        }

        System.out.println("pehle vaali line");
        Demo.sendSms("Your OTP is 5259", "+9199886655467");

        System.out.println("sendSms ke baad vaali line");
    }


    // Return
    // 1. A function returns when it has successfully completed it job
    // 2. A function has one and only one return type
    // 3. Return type can be any valid data type

    //Throw
    // 1. A function throws when it has failed at its job
    // 2. A function can have 0, 1 or multiple throw types
    // 3. Only a subclass of Throwable can be set as throw type


    public static void sendSms(String msg, String mobileNum) throws NumberNotValidException, NetworkCongestionException {
        if (mobileNum.length() < 13) {
            throw new NumberNotValidException("Number too short");
        } else if (mobileNum.length() > 13) {
            throw new NumberNotValidException("Number too long");
        }

        // check with airtel if number is valid
        if (Demo.airtelSaysInvalidNumber) {
            throw new NumberNotValidException("Number not alloted to anyone");
        }

//        // try sending sms through Airtel
//        if (Demo.airtelSaysNetworkCongestion) {
//            throw new NetworkCongestionException();
//        }


        System.out.println("sms sent successfully");
    }

    public static void hello(int number) {

        if(number > 0) {
            throw new NegativeNumberException();
        }

        for(int i = 0; i < number; i++) {
            System.out.println("Hello world!");
        }
    }
}