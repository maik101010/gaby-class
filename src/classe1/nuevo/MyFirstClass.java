package classe1.nuevo;

public class MyFirstClass {
    public static class AnotherClass {
        //int, String, boolean, etc.
        private int varName;

        public void setVarName(int parameterName) {
            this.varName = parameterName;
        }

        public int getVarName() {
            return this.varName;
        }

        public int getVarNamePlusTen() {
            return this.varName + 10;
        }

        public int getVarNameMultiplicationOfTen() {
            return this.varName * 10;
        }
    }
}
