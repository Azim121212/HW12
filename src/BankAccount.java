public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println("you put  " + sum + " to your score");
    }

    public void withDraw(int sum) throws LimitException {
        if (sum < amount) {
            throw new LimitException("There are not enough funds on your account to withdraw this amount.", amount);
        } else {
            amount = amount - sum;
            System.out.println("You have withdrawn money " + sum + "som from the score.");
        }
    }
}