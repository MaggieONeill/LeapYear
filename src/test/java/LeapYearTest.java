import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYEar_forNumberDivisibleByFour_true() {
    LeapYear testLeapYear = new LeapYear();
    assertEquals(true, testLeapYear.isLeapYear(2012));
  }

  @Test
  public void isLeapYear_forNunbersNotDivisibleByFour_false(){
    LeapYear leapYear = new LeapYear();
    assertEquals(false , leapYear.isLeapYear(1999));
  }

  @Test
  public void isLeapYear_forMultiplesOfOneHundred_false() {
    LeapYear leapYear = new LeapYear();
    assertEquals(false, leapYear.isLeapYear(1900));
  }
}
