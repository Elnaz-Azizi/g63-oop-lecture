package se.lexicon;

// COMPOSITION — "owns" (strong)
// WorkContract cannot exist on its own — it is always created inside Employee's constructor.
// The constructor is package-private: nothing outside this package can create a WorkContract directly.
// When an Employee object is gone, its WorkContract is gone with it.

public class WorkContract {
    private String startDate;
    private String contractType;

    // Package-private — only Employee (same package) can call this
    WorkContract(String startDate, String contractType) {
        this.startDate    = startDate;
        this.contractType = contractType;
    }

    public String getDetails() {
        return contractType + " contract (started: " + startDate + ")";
    }
}
