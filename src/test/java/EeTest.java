import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EeTest {
  private Ee dan;

  @BeforeEach
  public void setupDan(){
    this.dan = new Ee("Daniel", "Alberts", 10, 10);
  }

  @Test
  @DisplayName("When initialized an EE's first name is present")
  public void init_firstName_present(){
    Assertions.assertEquals("Daniel", dan.getFirstName());
  }

  @Test
  @DisplayName("When initialized an EE's last name is present")
  public void init_lastName_present(){
    Assertions.assertEquals("Alberts", dan.getLastName());
  }

  @Test
  @DisplayName("When initialized an EE's number of lessons is present")
  public void init_numLessons_present(){
    Assertions.assertEquals(10, dan.getNumLessons());
  }

  @Test
  @DisplayName("When initialized an EE's months worked is present")
  public void init_monthsWorked_present(){
    Assertions.assertEquals(10, dan.getMonthsWorked());
  }

  @Test
  @DisplayName("Has method for returning fullName")
  public void has_getFullName_method(){
    Assertions.assertEquals("Daniel Alberts", dan.getFullName());
  }

  @Test
  @DisplayName("Has method for returning average lessons per month")
  public void has_monthlyLessonAverage_method(){
    Assertions.assertEquals(1, dan.monthlyLessonAverage());
  }

  @Test
  @DisplayName("Has method to check print output of EE's lesson statics")
  public void has_print_method_for_EE_stats(){
    Assertions.assertEquals("Daniel Alberts\n"
        + "Total Lessons: 10\n"
        + "Months Worked: 10\n"
        + "Lessons Per Month: 1", dan.printStats());
  }
}
