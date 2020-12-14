public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setStatus(true);

        fan2.setSpeed(Fan.MEDIUM);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setStatus(false);

        System.out.println("Fan1 Information:\n" + fan1.toString());
        System.out.println("Fan2 Information:\n" + fan2.toString());
    }
}
