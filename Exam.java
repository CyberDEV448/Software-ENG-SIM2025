public class Exam {

    private String examName;
    private double obtainedScore;
    private double maxScore;
    private Course relatedCourse;

    // Exams()
    public Exam() {}

    public Exam(String examName, double maxScore, Course relatedCourse) {
        this.examName = examName;
        this.maxScore = maxScore;
        this.relatedCourse = relatedCourse;
        this.obtainedScore = 0;
    }

    // setExamName()
    public void setExamName(String examName) {
        this.examName = examName;
    }

    // getExamName()
    public String getExamName() {
        return examName;
    }

    // setObtainedScore()
    public void setObtainedScore(double obtainedScore) {
        // عشان مايبقاش فيه درجات بالسالب أو أكبر من الماكس (اختياري لكنه منطقي)
        if (obtainedScore < 0) obtainedScore = 0;
        if (maxScore > 0 && obtainedScore > maxScore) obtainedScore = maxScore;
        this.obtainedScore = obtainedScore;
    }

    // getObtainedScore()
    public double getObtainedScore() {
        return obtainedScore;
    }

    // setMaxScore()
    public void setMaxScore(double maxScore) {
        if (maxScore < 0) maxScore = 0;
        this.maxScore = maxScore;

        // لو الماكس اتغير وبقى أقل من الدرجة الحالية، نزبط الدرجة
        if (this.maxScore > 0 && this.obtainedScore > this.maxScore) {
            this.obtainedScore = this.maxScore;
        }
    }

    // getMaxScore()
    public double getMaxScore() {
        return maxScore;
    }

    // setRelatedScore()  (في UML مكتوبة كده)
    public void setRelatedScore(Course relatedCourse) {
        this.relatedCourse = relatedCourse;
    }

    // getRelatedScore() (في UML مكتوبة كده)
    public Course getRelatedScore() {
        return relatedCourse;
    }

    // boolean isPassed()
    public boolean isPassed() {
        // افتراض: النجاح من 50% (لو عندك نسبة مختلفة قولي)
        if (maxScore <= 0) return false;
        return getPercentage() >= 50.0;
    }

    // double getPercentage()
    public double getPercentage() {
        if (maxScore <= 0) return 0.0;
        return (obtainedScore / maxScore) * 100.0;
    }
}
