package practice.specialsession.class_objectt;

public class Member {
    String name;
    boolean isOverdue;     // 연체 여부
    String grade;          // 회원 등급 ("VIP" or "일반")

    Member(String name, boolean isOverdue, String grade) {
        this.name = name;
        this.isOverdue = isOverdue;
        this.grade = grade;
    }

    int getMaxBooks() {
        if (isOverdue) {
            return 0;
        } else {
            if (grade.equals("VIP")) {
                return 10;
            } else {
                return 5;
            }
        }
    }

    int getRentalDays() {
        int maxBooks = getMaxBooks();
        if (maxBooks == 0) {
            return 0;
        } else if (grade.equals("VIP")) {
            return 14;
        } else {
            return 7;
        }
    }

    void printRentalInfo() {
        int maxBooks = getMaxBooks();
        int rentalDays = getRentalDays();
        System.out.println(name + " - 대출가능: " + maxBooks + "권, 대출기간: " + rentalDays + "일");
    }
}
