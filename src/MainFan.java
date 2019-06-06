public class MainFan {
    public static void main(String[] args) {
        ClassFan Fan1 = new ClassFan();
        ClassFan Fan2 = new ClassFan();
        Fan1.setter(Fan1.FAST ,true,10,"yellow");
        Fan2.setter(Fan2.MEDIUM ,false,10,"yellow");

        System.out.println(Fan1.ToString());
        System.out.println(Fan2.ToString());
    }
}
