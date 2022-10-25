public class CarroCorrida {
    public Integer carNumber ;
    public Piloto pilot;
    public float maxSpeed;
    public float currentSpeed;
    public boolean switchedOn;

    public CarroCorrida (){

    }

    public CarroCorrida (Integer carNumber, Piloto pilot, float maxSpeed, float currentSpeed, boolean switchedOn  ){
        this.carNumber = carNumber;
        this.pilot = pilot;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.switchedOn = switchedOn;
    }

    public Integer getCarNumber(){
        return carNumber;
    }

    public void setCarNumber( Integer carNumber){
        this.carNumber = carNumber;
    }

    public Piloto getPilot(){
        return pilot;
    }

    public void setPilot( Piloto pilot){
        this.pilot = pilot;
    }

    public float getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed( float maxSpeed){
        maxSpeed = maxSpeed;
    }

    public float getCurrentSpeed(){
        return currentSpeed;
    }

    public void setCurrentSpeed( float currentSpeed){
        this.currentSpeed = currentSpeed;
    }

    public boolean getSwitchedOnCarNumber(){
        return switchedOn;
    }

    public void setSwitchedOn( boolean switchedOn){
        this.switchedOn = switchedOn;
    }


    public float speedUp(float speedAccelerate){
        if(switchedOn) {
            currentSpeed = currentSpeed + speedAccelerate;
            if(currentSpeed > this.maxSpeed){
                currentSpeed = maxSpeed;
                System.out.println("Você não pode ultrapassar a velocidade máxima permitida!");
                return currentSpeed;
            } else {
                return currentSpeed;
            }

        } else {
            System.out.println("Não é possível acelerar,");
            System.out.println("seu carro está desligado!");
            return currentSpeed;
        }

    }

    public float carBreak(float speedReduce){
        if(switchedOn) {
            if (currentSpeed == 0) {
                System.out.println("Seu carro está parado");
                return currentSpeed;
            } else {
                if(speedReduce > currentSpeed){
                    currentSpeed = 0 ;
                    return currentSpeed;
                } else {
                    currentSpeed = currentSpeed - speedReduce;
                    return currentSpeed;
                }
            }
        } else {
            System.out.println("Não é possível frear,");
            System.out.println("seu carro está desligado!");
            return currentSpeed;
        }
    }

    public void stop(){
        if(switchedOn) {
            if(currentSpeed == 0) {
                System.out.println("Seu carro não está em movimento!");
            }else{
                currentSpeed = 0 ;
                System.out.println("Seu carro parou!");
            }
        } else {
            System.out.println("Não é possível parar,");
            System.out.println("seu carro está desligado!");
        }


    }

    public void turnOn(){
        if(switchedOn){
            System.out.println("O carro já está ligado!");
        }else{
            switchedOn = true;
            System.out.println("O carro foi ligado agora!");
        }

    }

    public void switchOff(){
        if(!switchedOn){
            System.out.println("O carro já está desligado!");
        }else{
            if(currentSpeed == 0) {
                switchedOn = false;
                System.out.println("O carro foi desligado agora!");
            }else{
                System.out.println("Seu carro está em movimento.");
                System.out.println("Reduza a velocidade para 0km para poder parar o carro!");
            }
        }
    }

    @Override
    public String toString(){
        return "CarroCorrida{" +
                "carNumber=" + carNumber +
                ", pilot=" + pilot +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                ", switchedOn=" + switchedOn +
                '}';
    }
}
