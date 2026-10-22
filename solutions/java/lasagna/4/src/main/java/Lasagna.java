public class Lasagna {
    
    static final int minute = 40;
    static final int layerMultiply = 2;
    public int expectedMinutesInOven() {
        return minute;
    }
   
    public int remainingMinutesInOven(int min) {
        return expectedMinutesInOven()-min;
    }

    
    public int preparationTimeInMinutes(int layers) {
        return layerMultiply*layers;
    }
   
    public int totalTimeInMinutes(int layers, int min) {
        
        return preparationTimeInMinutes(layers)+min;
    }
    
}
