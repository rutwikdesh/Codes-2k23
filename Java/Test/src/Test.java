import mypack.Package;
public class Test {
    int x = 20;
    protected class Inner {
        int y = 10;
        void innerDisplay(){
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        Package p = new Package();
        p.hey();
    }
}
