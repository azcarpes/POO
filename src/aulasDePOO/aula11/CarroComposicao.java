package aulasDePOO.aula11;

public class CarroComposicao {

    private MotorComposicao motor;

    public CarroComposicao(int potenciaMotor) {
        this.motor = new MotorComposicao(potenciaMotor);

    }
}
