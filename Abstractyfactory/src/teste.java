public class teste {



        private String gradeRequest;
        private boolean hasCompanyContract;

        public teste(String gradeRequest, boolean hasCompanyContract) {
            this.gradeRequest= gradeRequest;
            this.hasCompanyContract = hasCompanyContract;
        }
        public boolean hasCompanyContract() {
            return hasCompanyContract;
        }
        public String getGradeRequest() {
            return gradeRequest;
        }
    }