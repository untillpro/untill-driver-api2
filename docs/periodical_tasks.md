# Periodical Tasks - IHasPeriodicalTasks

A driver may provide one or more periodical tasks, which are executed by unTill(r) in background automatically. `getPeriodicalTasks` method must return a list of task instances to execute:

```java
public class MyPeriodicalTasksInterface implements IHasPeriodicalTasks {
    
    public class MyPeriodicalTask implements IUntillDriverPeriodicalTask {
        
        IDriverContext ctx;
        
        public MyPeriodicalTask(IDriverContext ctx) {
            this.ctx = ctx;
        }

        @Override
        public void init() {
            // Initialize
        }

        @Override
        public int getIntervalInSeconds() {
            return 30;
        }

        @Override
        public void execute() {
            // Executed every 30 seconds
        }

        @Override
        public void finit() {
            // Finalize 
        }
        
    }

    @Override
    public List<IUntillDriverPeriodicalTask> getPeriodicalTasks(DriverConfiguration params) {
        ArrayList<IUntillDriverPeriodicalTask> myTasks = new ArrayList<>();
        myTasks.add(new MyPeriodicalTask(this.ctx));
        return null;
    }
    
    IDriverContext ctx;
    
    public MyPeriodicalTasksInterface(IDriverContext ctx) {
        this.ctx = ctx;
    }

```