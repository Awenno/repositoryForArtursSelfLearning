public interface TestZone  {
    public  static void voice(){
        System.out.println("TestZone");
    }

    public static void main(String[] args) {
        TestZone1 testZone1 = new TestZone1();
        testZone1.voice();
    }

}

