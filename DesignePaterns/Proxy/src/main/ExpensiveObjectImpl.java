package main;

import java.util.logging.Logger;

public class ExpensiveObjectImpl implements ExpensiveObject{

    static Logger log = Logger.getLogger(ExpensiveObjectImpl.class.getName());

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        log.info("Processing from " + getClass().getSimpleName());
    }

    private void heavyInitialConfiguration() {
        log.info("Loading initial configuration...");
    }
}
