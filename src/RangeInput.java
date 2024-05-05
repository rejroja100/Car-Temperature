public class RangeInput {
    private int CurrentTemperature, maximumTemperature,  minimumTemperature;

    public RangeInput(){
       maximumTemperature = 80;
       minimumTemperature = 60;
       calculateCurrentTemperature();
    }

    public RangeInput(int max, int min){
        maximumTemperature = max;
        minimumTemperature = min;
        calculateCurrentTemperature();
    }

    private void calculateCurrentTemperature(){
        CurrentTemperature = (maximumTemperature + minimumTemperature) / 2;
    }

    public void up(){
        CurrentTemperature = Math.min(CurrentTemperature + 1, maximumTemperature);
    }

    public void down(){
        CurrentTemperature = Math.max(CurrentTemperature + 1, maximumTemperature);
    }

    public int getCurrentTemperature() {
        return CurrentTemperature;
    }
}
