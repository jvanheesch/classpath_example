package dir2;

import dir1.A_pck;
import otherpackage.A;
import a.b.c.E_jar;

class C_pck {
    public static void main(String[] args) {
        System.out.println("C_pck_MAIN");
        D_pck.someStaticMethod();
        A_pck.someStaticMethod();
        A.someStaticMethod();
        E_jar.someStaticMethod();
    }
}
