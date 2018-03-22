package codekamp;

// HINT: think of interface like a criteria
// 1. interfaces only contains method signatures, no body
// 2. You can create variables of interface but not object
// 3. In a variable of interface Xyz you store objects of any class...
// 4 ...which implements that interface.
public interface ButtonListner {
    public void buttonClicked();
    public void buttonDoubleClicked(int gap);
}