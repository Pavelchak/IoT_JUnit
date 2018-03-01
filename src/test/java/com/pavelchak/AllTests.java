package com.pavelchak;

//import org.junit.platform.suite.api.SelectPackages;
//import org.junit.runner.RunWith;
//import org.junit.platform.runner.JUnitPlatform;

import com.pavelchak.Tasks.SampleTest;
//import org.junit.platform.runner.JUnitPlatform;
//import org.junit.platform.suite.api.SelectClasses;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;



@RunWith(JUnitPlatform.class)
@SelectClasses({SampleTest.class})


//@RunWith(value=Suite.class)
//@Suite.SuiteClasses(value={SampleTest.class})
public class AllTests {

}
