package projects.P04_okulYönetimi;
/*
Course class'ında derse ait sözlü notu kısmını girin ve ortalamaya etkisini
her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme
yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise
sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin
genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    String Teacher;

    Course(){

    }

    public Course(String name, String code, String prefix, int note, String teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        Teacher = teacher;
    }

    public void addTeacher(){

    }
    public void printTeacher(){

    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", prefix='" + prefix + '\'' +
                ", note=" + note +
                ", Teacher='" + Teacher + '\'' +
                '}';
    }
}
