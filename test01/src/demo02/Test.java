package demo02;

public class Test {
    public static void main(String[] args) {
        Line lintest = new Line();
        lintest.setEmplymentClass("黑马班");
        lintest.setMoney(19980);
        Student stu = new Student();
        stu.setName("张三");
        stu.setScore(88);
        stu.setLin(lintest);
        System.out.println();

    }
}
