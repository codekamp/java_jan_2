package codekamp;

public class Demo {

    private static boolean airtelSaysInvalidNumber = false;
    private static boolean airtelSaysNetworkCongestion = true;

    public static void main(String[] args) {
//         marketing module
        try {
            Demo.sendSms("Get credit card at 0%....", "+918285601665");
        } catch (Exception e) {
            System.out.println("send email");
        }

        // money transfer module
        try {
            System.out.println("pehle vaali line");
            Demo.sendSms("Your OTP is 5259", "+91998866554");
            System.out.println("sendSms ke baad vaali line");
        } catch (NumberNotValidExceptin d) {
            System.out.println("please visit nearest branch....");
            return;
        } catch (NetworkCongestionException c) {
            System.out.println("Try IVRS");
        }


        System.out.println("We have sent you an OTP. Please enter here.");
    }


    // Return
    // 1. A function returns when it has successfully completed it job
    // 2. A function has one and only one return type
    // 3. Return type can be any valid data type

    //Throw
    // 1. A function throws when it has failed at its job
    // 2. A function can have 0, 1 or multiple throw types
    // 3. Only a subclass of Throwable can be set as throw type


    public static void sendSms(String msg, String mobileNum) throws NumberNotValidExceptin, NetworkCongestionException {
        if (mobileNum.length() != 13) {
            throw new NumberNotValidExceptin();
        }

        // check with airtel if number is valid
        if (Demo.airtelSaysInvalidNumber) {
            throw new NumberNotValidExceptin();
        }

        // try sending sms through Airtel
        if (Demo.airtelSaysNetworkCongestion) {
            throw new NetworkCongestionException();
        }


        System.out.println("sms sent successfully");
    }
}