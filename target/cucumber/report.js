$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AutoTrader.feature");
formatter.feature({
  "line": 1,
  "name": "Auto trader search scenario",
  "description": "",
  "id": "auto-trader-search-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify home page elements present",
  "description": "",
  "id": "auto-trader-search-scenario;verify-home-page-elements-present",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open chrome and launch www.autotrader.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Home page is ready",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Links buttons and drop down should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTrader.open_chrome_and_launch_www_autotrader_com()"
});
formatter.result({
  "duration": 5157756500,
  "status": "passed"
});
formatter.match({
  "location": "AutoTrader.home_page_is_ready()"
});
formatter.result({
  "duration": 2439788300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[text()\u003d\u0027Search Cars for Sale\u0027]\"}\n  (Session info: chrome\u003d88.0.4324.182)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027024375LT\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.182, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\RSingh\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:20873}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3ed4710e65a6b952121b201951c8a0ba\n*** Element info: {Using\u003dxpath, value\u003d//*[text()\u003d\u0027Search Cars for Sale\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinition.AutoTrader.home_page_is_ready(AutoTrader.java:45)\r\n\tat ✽.When Home page is ready(AutoTrader.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AutoTrader.links_buttons_and_drop_down_should_be_visible()"
});
formatter.result({
  "status": "skipped"
});
});