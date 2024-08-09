public abstract class fabricaCarro {

    public carro create(String requestedGrade) {
        carro carro = retrievecarro(requestedGrade);
        carro = prepareCar(carro);
        return carro;
    }
    private carro prepareCar(carro carro){
        carro.clean();
        carro.mechanicCheck();
        carro.fuelCar();
        return carro;
    }
    abstract carro retrievecarro(String requestedGrade);

    carro retrivecarro(String requestedGrade){
        if ("the".equals(requestedGrade)) {
            return new Brasil(100, "full", "blue");
        }else {
            return null;
        }
      }

    abstract carro retrievercarro(String requestedGrade);
}












