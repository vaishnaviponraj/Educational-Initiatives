package patterns.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        AutomationRule r = new AutomationRule.Builder()
            .name("NightLight")
            .condition("motion && after22:00")
            .action("turnOn(light1)")
            .schedule("22:00-06:00")
            .build();
        System.out.println(r);
    }
}
