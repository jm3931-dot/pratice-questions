public class StudentFeeCalculator {
    public static void main(String[] args) {
        double fee = 129;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println(
            "The Student Fee is INR " + fee + " and the University Discount is " + discountPercent + "%\n" +
            "The Discount amount is INR " + discount + "\n" +
            "The Fee to be paid after discount is INR " + finalFee
        );
    }
}