package patterns.creational.builder;

public class AutomationRule {
    private final String name;
    private final String condition;
    private final String action;
    private final String schedule;
    private AutomationRule(Builder b) {
        this.name = b.name;
        this.condition = b.condition;
        this.action = b.action;
        this.schedule = b.schedule;
    }

    @Override
    public String toString() {
        return "AutomationRule{name='" + name + "', condition='" + condition + "', action='" + action + "', schedule='" + schedule + "'}";
    }

    public static class Builder {
        private String name;
        private String condition;
        private String action;
        private String schedule;

        public Builder name(String n){ this.name = n; return this; }
        public Builder condition(String c){ this.condition = c; return this; }
        public Builder action(String a){ this.action = a; return this; }
        public Builder schedule(String s){ this.schedule = s; return this; }
        public AutomationRule build(){ return new AutomationRule(this); }
    }
}
