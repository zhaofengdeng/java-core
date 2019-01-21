package java1.enum1;


public enum StrategyEnum {
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a+b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a-b;
        }
    },
    MUTI("*") {
        @Override
        public int exec(int a, int b) {
            return a*b;
        }
    };
 
    StrategyEnum(String value) {
        this.value = value;
    }
    private String value;
    public abstract int exec(int a, int b);

    
}

