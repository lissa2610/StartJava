public class JaegerTest {

    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);
        chernoAlpha.setSpeed(3);
        
        Jaeger strikerEureka = new Jaeger("Striker Eureka","Mark-5","Australia",76.2f,1.850f,10,9,10);
        System.out.println("ModelName - " + strikerEureka.getModelName());
        System.out.println("Strength - " + strikerEureka.getStrength());
        
    
        System.out.println(" ");

        System.out.println("ModelName " + chernoAlpha.getModelName());
        System.out.println("Strength - " + chernoAlpha.getStrength());
        
    } 
}