package ch17.sec07.exam01;

public class Student implements Comparable<Student>{
    private String name;
    private int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.score, o.score); // 점수 오름차순 기준
    }
}
