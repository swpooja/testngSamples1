package testScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
  
  @Test(groups="feature1")
  public void testone() {
	  System.out.println("TestOne1 sample three");
  }
  @Test
  public void testtwo() {
	  System.out.println("TestTwo2 sample three");
  }
  @Test(groups="feature2")
  public void testthree() {
	  System.out.println("TestThree3 sample three");
  }
  @Test
  public void testfour() {
	  System.out.println("TestThree4 sample three");
  }
  }
