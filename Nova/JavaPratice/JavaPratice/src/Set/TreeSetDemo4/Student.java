package Set.TreeSetDemo4;

public class Student{
    private String name;
    private int age;
    private int ChineseScore;
    private int MathScore;
    private int EnglishScore;

    public Student() {
    }

    public Student(String name, int age, int ChineseScore, int MathScore, int EnglishScore) {
        this.name = name;
        this.age = age;
        this.ChineseScore = ChineseScore;
        this.MathScore = MathScore;
        this.EnglishScore = EnglishScore;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return ChineseScore
     */
    public int getChineseScore() {
        return ChineseScore;
    }

    /**
     * 设置
     * @param ChineseScore
     */
    public void setChineseScore(int ChineseScore) {
        this.ChineseScore = ChineseScore;
    }

    /**
     * 获取
     * @return MathScore
     */
    public int getMathScore() {
        return MathScore;
    }

    /**
     * 设置
     * @param MathScore
     */
    public void setMathScore(int MathScore) {
        this.MathScore = MathScore;
    }

    /**
     * 获取
     * @return EnglishScore
     */
    public int getEnglishScore() {
        return EnglishScore;
    }

    /**
     * 设置
     * @param EnglishScore
     */
    public void setEnglishScore(int EnglishScore) {
        this.EnglishScore = EnglishScore;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", ChineseScore = " + ChineseScore + ", MathScore = " + MathScore + ", EnglishScore = " + EnglishScore + "}";
    }
}
