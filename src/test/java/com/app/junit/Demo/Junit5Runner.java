package com.app.junit.Demo;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
@SelectClasses({com.app.junit.Demo.IncludeExcludeTags.class})
@IncludeTags({"QA"})
public class Junit5Runner {

}
