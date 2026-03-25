class methodoverloding1 {

    int add(int a, int b) {
        return a + b;
	}
    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        methodoverloding obj = new methodoverloding();

        System.out.println(obj.add(5, 3));
        System.out.println(obj.add(5, 3, 2));
        System.out.println(obj.add(4.5, 3.2));
    }
}