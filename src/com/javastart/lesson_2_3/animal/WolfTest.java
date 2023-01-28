public class WolfTest {
    public static void main(String[] args) {
        Wolf WolfOne = new Wolf();
        WolfOne.setGender("Man");
        WolfOne.setName("Бублик");
        WolfOne.setAge(8);


        System.out.println(WolfOne.getName());
        System.out.println(WolfOne.getAge());
    }
}