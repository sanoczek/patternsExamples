package patterns.behavioral.chain;

public abstract class AccessCheck {

    private AccessCheck nextCheck;

    public AccessCheck addChainElement(AccessCheck accessCheck) {

        this.nextCheck = accessCheck;
        return nextCheck;
    }
    public abstract boolean doCheck(String username);

    protected boolean checkNextElemnet(String username) {

        if (nextCheck == null) {
            return true;
        }
        return nextCheck.doCheck(username);
    }
}
