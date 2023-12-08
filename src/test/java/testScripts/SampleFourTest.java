package testScripts;

import org.testng.annotations.Test;

public class SampleFourTest {
  @Test
  public void testone() {
	  System.out.println("TestOne5 sample four");
  }
  @Test(groups="feature3")
  public void testtwo() {
	  System.out.println("TestTwo6 sample four");
  }
  @Test(groups="feature1")
  public void testthree() {
	  System.out.println("TestThree7 sample four");
  }
  @Test(groups="feature2")
  public void testfour() {
	  System.out.println("TestFour8 sample four");
  }
}
