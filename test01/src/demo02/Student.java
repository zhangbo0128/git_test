package demo02;

public class Student implements Study {
    @Override
    public void studyLine() {
        System.out.println("您报名的就业班为：" + getLin() + ",应缴纳学费：" + getLin().getMoney() + "元");
    }

    private String name;
    private double score;
    private Line lin;

    public static void exam() {

        if (score > 60) {
            System.out.println("你的考试成绩为：" + score + ",通过考试");
        }
        if (score < 60) {
            System.out.println("你的考试成绩为：" + score + ",考试不通过");
        }
    }

    public Student() {
    }

    public Student(String name, double score, Line lin) {
        this.name = name;
        this.score = score;
        this.lin = lin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Line getLin() {
        return lin;
    }

    public void setLin(Line lin) {
        this.lin = lin;
    }
}
