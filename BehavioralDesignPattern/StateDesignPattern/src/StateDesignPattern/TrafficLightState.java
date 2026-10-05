package StateDesignPattern;

public interface TrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
