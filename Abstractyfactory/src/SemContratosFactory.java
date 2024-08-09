public class SemContratosFactory extends fabricaCarro{

        @Override
        carro retrievecarro(String requestedGrade) {
            if ("A".equals(requestedGrade)) {
                return new Brasil(100, "full", "blue");
            } else {
                return null;
            }
        }

    @Override
    carro retrievercarro(String requestedGrade) {
        return null;
    }
}


