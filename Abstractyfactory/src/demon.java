public class demon {

        public static void main(String[] args) {
            teste cliente = new teste("A", false);
            fabricaCarro fabricaCarro = getfabricaCarro(cliente);
            carro carro = fabricaCarro.create(cliente.getGradeRequest());
            carro.startEngine();
        }

        private static fabricaCarro getfabricaCarro(teste cliente) {
            if (cliente.hasCompanyContract()) {
                return new fabricaCarro() {
                    @Override
                    carro retrievecarro(String requestedGrade) {
                        return null;
                    }

                    @Override
                    carro retrievercarro(String requestedGrade) {
                        return null;
                    }
                };
            } else {
                return new SemContratosFactory();
            }
        }
    }