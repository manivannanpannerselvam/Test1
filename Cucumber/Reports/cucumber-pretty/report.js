$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/Infofeature/Login_po.feature");
formatter.feature({
  "line": 2,
  "name": "verify the InfoTech_cloud login page",
  "description": "",
  "id": "verify-the-infotech-cloud-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@InfoTech_Hr"
    }
  ]
});
formatter.before({
  "duration": 31814918000,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#@PO"
    }
  ],
  "line": 5,
  "name": "verify the InfoTech_cloud sigin page with valid_username and Invalid_Password credentials",
  "description": "",
  "id": "verify-the-infotech-cloud-login-page;verify-the-infotech-cloud-sigin-page-with-valid-username-and-invalid-password-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"test05@mailinator.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"aktrea@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicatisdfsfdsondgdgdd not  successfully.",
  "keyword": "And "
});
formatter.match({
  "location": "Login_infotech.open_the_valid_url_in_InfoTech_cloud_application()"
});
formatter.result({
  "duration": 94108331300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test05@mailinator.com",
      "offset": 46
    }
  ],
  "location": "Login_infotech.enter_the_usernamesdsdsds_in_username_field(String)"
});
formatter.result({
  "duration": 100396995600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//input[@name\u003d\u0027txtLogin\u0027 or @id\u003d\u0027txtLogin\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.163)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027LAPTOP-P9U8PG08\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\MANIVA~1\\AppData\\Local\\Temp\\scoped_dir2600_21702}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d80.0.3987.163, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 4af62a6f531409f2926711a0d63e6b2c\n*** Element info: {Using\u003dxpath, value\u003d.//input[@name\u003d\u0027txtLogin\u0027 or @id\u003d\u0027txtLogin\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.sendKeys(Unknown Source)\r\n\tat com.cucumber.framework.InfoTech.InfoTech_Page.enternamefield(InfoTech_Page.java:80)\r\n\tat com.cucumber.framework.stepdefinition.InfoTech_cloud.Login_infotech.enter_the_usernamesdsdsds_in_username_field(Login_infotech.java:57)\r\n\tat ✽.Then Enter the  usernamesdsdsds in username field \"test05@mailinator.com\"(featurefile/Infofeature/Login_po.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "aktrea@123",
      "offset": 48
    }
  ],
  "location": "Login_infotech.enter_the_valid_passwordsdsd_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_infotech.click_the_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_infotech.verify_the_applicatisdfsfdsondgdgdd_not_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 13321551400,
  "status": "passed"
});
formatter.before({
  "duration": 7125792200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 12,
      "value": "#@PO"
    }
  ],
  "line": 13,
  "name": "verify the InfoTech_cloud sigin page with Invalid_username and valid_Password credentials",
  "description": "",
  "id": "verify-the-infotech-cloud-login-page;verify-the-infotech-cloud-sigin-page-with-invalid-username-and-valid-password-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Enter the  usernamesdsdsds in username field \"demo@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the valid passwordsdsd in password field \"demo1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify the applicatisdfsfdsondgdgdd not  successfully.",
  "keyword": "And "
});
formatter.match({
  "location": "Login_infotech.open_the_valid_url_in_InfoTech_cloud_application()"
});
