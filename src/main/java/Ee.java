public class Ee {
  private String firstName;
  private String lastName;
  private int numLessons;
  private int monthsWorked;
  private int tacoMoney;

  public Ee(String firstName,  String lastName, int numLessons, int monthsWorked) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.numLessons = numLessons;
    this.monthsWorked = monthsWorked;
    this.tacoMoney = 0;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getNumLessons() {
    return numLessons;
  }

  public int getMonthsWorked() {
    return monthsWorked;
  }

  public String getFullName() {
    return getFirstName() + " " + getLastName();
  }

  public int monthlyLessonAverage() {
    return numLessons / monthsWorked;
  }

  public String printStats() {
    return getFullName() + "\n" + "Total Lessons: " + numLessons +  "\n"
        + "Months Worked: " + monthsWorked + "\n" + "Lessons Per Month: " + monthlyLessonAverage();
  }
}
