package iuh.cntt.ktpm;
/**
 * @description: Lop nay mo ta course
 * @author: Nguyễn Trí Tường
 * @version: 1.0
 * @created: 03-Sep-2025 1:09:00 PM
 */
public class Course {
    private String id;
    private String title;
    private int credit;
    private String department;

    public Course(String id, String title, int credit, String department) {
        if (id == null || id.isEmpty() || title == null || title.isEmpty() || credit <= 0 || department == null || department.isEmpty()) {
            throw new IllegalArgumentException("Thông tin môn học không hợp lệ");
        }
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCredit() {
        return credit;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return id + " - " + title + " (" + credit + " tín chỉ) - Khoa: " + department;
    }
}

