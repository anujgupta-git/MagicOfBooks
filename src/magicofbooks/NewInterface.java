package magicofbooks;

 interface NewInterface {
    public void method1();

    public void method2();

    public  int a = 1;

}

 class A implements NewInterface{
    @Override
    public void method1() {
        System.out.println("HI");
    }

    @Override
    public void method2() {
        System.out.println("Hi");
    }
}
