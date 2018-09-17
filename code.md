## Complete Code Example

### CSS Selectors from html css basics

```
        $$("input")
        (10) [input#first-name, input#password, input, input, input, input, input, input, input, input]0: input#first-name1: input#password2: input3: input4: input5: input6: input7: input8: input9: inputlength: 10__proto__: Array(0)

        $$("input[type='password']")
        [input#password]0: input#passwordlength: 1__proto__: Array(0)

        $$("input[type='text']")
        [input#first-name]0: input#first-namelength: 1__proto__: Array(0)

        $$("input[type='number']")
        [input]

        $$("input[type='radio']")
        (4) [input, input, input, input]0: input1: input2: input3: inputlength: 4__proto__: Array(0)

        $$("input[value='HTML']")
        [input]0: inputlength: 1__proto__: Array(0)

        $$("label")
        (8) [label, label, label#update-profile-label, label, label, label, label, label]

        $$("li")
        (5) [li, li, li, li, li]

        $$("select")
        [select]

        $$("option")
        (4) [option, option, option, option]0: 

        $$("input[type='checkbox']")
        [input]
```

### XPath Selectors from html css basics

```
        $x("//input")
        (10) [input#first-name, input#password, input, input, input, input, input, input, input, input]

        $x("//input[@type='text']")
        [input#first-name]

        $x("//input[@type='checkbox']")
        [input]

        $x("//input[@type='password']")
        [input#password]

        $x("//input[@id='password']")
        [input#password]

        $x("//input[@id='first-name']")
        [input#first-name]

        $x("//label")
        (8) [label, label, label#update-profile-label, label, label, label, label, label]

        $x("//textarea")
        [textarea]

        $x("//input[type='number']")
        []

        $x("//input[@type='number']")
        [input]0: inputlength: 1__proto__: Array(0)

        $x("//input[@type='radio']")
        (4) [input, input, input, input]

        $x("//select")
        [select]

        $x("//option")
        (4) [option, option, option, option]

        $x("//*[@id='first-name']")
        [input#first-name]

        $$("#first-name")
        [input#first-name]

        $x("//input[@type='radio']")
        (4) [input, input, input, input]

```

### /html-basics/1-first-html.html

```html
<html>
    <head>
        <title>Learn Selenium and HTML</title>
    </head>
    
    <body>
        This is the body of the page.
    </body>
</html>
```
---

### /html-basics/2-second-html.html

```html
<html>
    <head>
        <title>Learn Selenium and HTML - 2</title>
    </head>
    
    <body>
        <h1>Learning Automation Testing with Selenium and HTML</h1>
            
        I want to learn
        
        <ul>
            <li>HTML</li>
            <li>CSS</li>
            <li>XPath</li>
            <li>CSS Selectors</li>
            <li>Selenium</li>
        </ul>
        
        <ol>
            <li>HTML</li>
            <li>CSS</li>
            <li>XPath</li>
            <li>CSS Selectors</li>
            <li>Selenium</li>
        </ol>
        
    
        <p >Learning HTML and Selenium is awesome. The following steps are involved</p>
        
        <h2>HTML</h2>
        <p>First step is to learn HTML</p>
        
        <h2>CSS</h2>
        <p>Second step is to learn CSS</p>
        
        <p>This is the body of the page.</p>
        <p>Paragraph 2</p>
        <p>Paragraph 3</p>
        
        <div>Division 1</div>
        <div>Division 2</div>
        <div>Division 3</div>
        
        <p>
            <b>Paragraph which will be displayed in bold.</b>
        </p>
        
        <p>
            <i>Paragraph which will be displayed in italicized.</i>
        </p>
        
        <hr/>
        
        <blockquote>Ranga says - You become a great automation tester by learning atleast for an hour every day</blockquote>
        
        <hr/>
        
        <p>
            Line1. <br/>
            Line2. <br/>
            Line3.
        </p>
        
        <hr/>
        
        <abc>fkjsaklfjalk</abc>
        <def>fkjsaklfjalk</def>
        <efg/>
        
        
    </body>
</html>
```
---

### /html-basics/3-tables.html

```html
<html>
    <head>
        <title>Learn Tables in HTML</title>
    </head>
    
    <body>
        
        <table border="1">
            <thead>
                <tr>
                    <td>Football Player</td>
                    <td>Goals</td>
                    <td>Country</td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Ronaldo</td>
                    <td>10</td>
                    <td>Portugal</td>
                </tr>
                <tr>
                    <td>Messi</td>
                    <td>10</td>
                    <td>Argentina</td>
                </tr>
                <tr>
                    <td>Player Name</td>
                    <td>6</td>
                    <td>Europe</td>
                </tr>
                <tr>
                    <td>Player Name 2</td>
                    <td>3</td>
                    <td>Europe</td>
                </tr>
                <tr>
                    <td>Player Name 3</td>
                    <td>4</td>
                    <td>Europe</td>
                </tr>
            </tbody>
        </table>
        

<!-- Comment 
        
        table
            thead
                tr
                    td
                    td
            tbody
                tr
                    td
                    td
                tr
                    td
                    td
        
        
        Football Player  Goals
          Ronaldo          10
          Messi            10
        -->
        
    </body>
</html>
```
---

### /html-basics/4-miscellaneous.html

```html
<html>
    <head>
        <title>Learn a few things in HTML</title>
    </head>
    
    <body>
       
    <ol>
        <li><a href="1-first-html.html">First HTML Page</a> </li>
        <li><a href="http://www.in28minutes.com/">Go to in28minutes</a></li>
        <li><a target="_blank" href="2-second-html.html"> Second HTML Page</a></li>
    </ol>

    <img border="1" src="https://avatars3.githubusercontent.com/u/14139137?s=460&v=4"/>
    
    <img src="in28minutes-logo.png"/>
    
    <br/>
    
    <iframe src="http://www.in28minutes.com" height="400px" width="1000px">
        IFrame is Not Supported</iframe>
       
       
        
    </body>
</html>
```
---

### /html-basics/5-nesting-and-more.html

```html
<html>
    <head>
        <title>Learn Selenium and HTML 5</title>
    </head>
    
    <body>
        <div>
            
            <p align="right"> The great thing about HTML is that its simple to learn.  
                <a href="1-first-html.html">This is the first page we have created</a>            
            </p>
            
            <p> This is the second thing we have learnt - <a href="2-second-html.html">Here is the link to it</a>  </p>
        
        </div>
    </body>
</html>
```
---

### /html-basics/6-form.html

```html
<html>
    <head>
        <title>Learn Forms in HTML </title>
    </head>
    
    <body>
        Let's get some data from the user:
        <ul>
            <li>Text</li>
            <li>Lot of Text - in multiple lines</li>
            <li>Select among options</li>
            <li>Yes or No</li>
            <li>Click a Button</li>
        </ul>

        <form method="post" action="accept-information.do">
            <label>First Name</label>
            <input type="text" name="first-name" size="15" maxlength="20" value="Ranga"/>
            
            <label>Password</label>
            <input type="password" name="password"/>
            
            <label>Upload Profile Picture</label>
            <input type="file" name="profile-picture"/>
            
            
            <label>Age</label>
            <input type="number" name="age" value="20"/>
            <label>Describe Yourselves</label>
            <textarea name="description" rows="5" cols="100"></textarea>
            <br/>
            <label>What do you want to learn?</label>
            <input type="radio" name="what-to-learn" value="HTML">HTML
            <input type="radio" name="what-to-learn" value="CSS" checked>CSS
            <input type="radio" name="what-to-learn" value="AUT">Automation Testing
            <input type="radio" name="what-to-learn" value="JAVA">Java
            <BR/>
            <label>How do you want to Learn?</label>
            
            <select name="how-to-learn" multiple>
                <option value="online">Online</option>
                <option value="books">Books</option>
                <option value="college" selected>College</option>
                <option value="other">Other</option>
            </select>
            <BR/>
            <input type="checkbox" name="drive" checked/>
            <label>Do You Know to Drive?</label>
            
            <input type="submit"/>
        </form>
        
        
    </body>
</html>
```
---

### /html-basics/7-form-with-css.html

```html
<html>
    <head>
        
        <title>Learn Forms in HTML with CSS</title>
        
        <!-- CSS Selectors -->
        <style type="text/css">
            
            label {
                font-size: 16px;
                color: #111111;
            }
            
            input, textarea, select {
                background-color: antiquewhite;
            }
            
            fieldset {
                border: 0px;
                padding: 20px;
                background-color: #EEFFFF;
            }
            
            ul {
                background-color: #EEFFEE;
            }
            
            li {
                color: #666666;
            }
            
        </style>
    
    </head>
    
    <body>
        Let's get some data from the user:
        
        <ul>
            <li>Text</li>
            <li>Lot of Text - in multiple lines</li>
            <li>Select among options</li>
            <li>Yes or No</li>
            <li>Click a Button</li>
        </ul>

        <form method="post" action="accept-information.do">
            
            <fieldset>
                <label >First Name</label>
                <input type="text" name="first-name" size="15" maxlength="20" value="Ranga"/>

                <label>Password</label>
                <input type="password" name="password"/>            
            </fieldset>
            <!--style="font-size: 25px"-->
            
            <fieldset>
                <label >Upload Profile Picture</label>
                <input type="file" name="profile-picture"/>
            </fieldset>
            
            <fieldset>
                <label>Age</label>
                <input type="number" name="age" value="20"/>
                <label>Describe Yourselves</label>
                <textarea name="description" rows="5" cols="100"></textarea>
            </fieldset>
        
            <fieldset>
                <label>What do you want to learn?</label>
                <input type="radio" name="what-to-learn" value="HTML">HTML
                <input type="radio" name="what-to-learn" value="CSS" checked>CSS
                <input type="radio" name="what-to-learn" value="AUT">Automation Testing
                <input type="radio" name="what-to-learn" value="JAVA">Java
            </fieldset>
                
            <fieldset>
            <label>How do you want to Learn?</label>
            <select name="how-to-learn" multiple>
                <option value="online">Online</option>
                <option value="books">Books</option>
                <option value="college" selected>College</option>
                <option value="other">Other</option>
            </select>
            </fieldset>
            
            <fieldset>
                <input type="checkbox" name="drive" checked/>
                <label>Do You Know to Drive?</label>
            </fieldset>
            
            <fieldset>
                <input type="submit"/>
            </fieldset>
        </form>
        
        
    </body>
</html>
```
---

### /html-basics/8-form-with-external-css.html

```html
<html>
    <head>
        
        <title>Learn Forms in HTML with CSS</title>
        
        <link rel="stylesheet" type="text/css" href="style.css"/>

        <!--
        
        CSS Selectors
        ~~~~~~~~~~~~~~~
        $$("input")
        (10) [input#first-name, input#password, input, input, input, input, input, input, input, input]0: input#first-name1: input#password2: input3: input4: input5: input6: input7: input8: input9: inputlength: 10__proto__: Array(0)

        $$("input[type='password']")
        [input#password]0: input#passwordlength: 1__proto__: Array(0)

        $$("input[type='text']")
        [input#first-name]0: input#first-namelength: 1__proto__: Array(0)

        $$("input[type='number']")
        [input]

        $$("input[type='radio']")
        (4) [input, input, input, input]0: input1: input2: input3: inputlength: 4__proto__: Array(0)

        $$("input[value='HTML']")
        [input]0: inputlength: 1__proto__: Array(0)

        $$("label")
        (8) [label, label, label#update-profile-label, label, label, label, label, label]

        $$("li")
        (5) [li, li, li, li, li]

        $$("select")
        [select]

        $$("option")
        (4) [option, option, option, option]0: 

        $$("input[type='checkbox']")
        [input]


        XPath Selectors
        ~~~~~~~~~~~~~~~

        $x("//input")
        (10) [input#first-name, input#password, input, input, input, input, input, input, input, input]

        $x("//input[@type='text']")
        [input#first-name]

        $x("//input[@type='checkbox']")
        [input]

        $x("//input[@type='password']")
        [input#password]

        $x("//input[@id='password']")
        [input#password]

        $x("//input[@id='first-name']")
        [input#first-name]

        $x("//label")
        (8) [label, label, label#update-profile-label, label, label, label, label, label]

        $x("//textarea")
        [textarea]

        $x("//input[type='number']")
        []

        $x("//input[@type='number']")
        [input]0: inputlength: 1__proto__: Array(0)

        $x("//input[@type='radio']")
        (4) [input, input, input, input]

        $x("//select")
        [select]

        $x("//option")
        (4) [option, option, option, option]

        $x("//*[@id='first-name']")
        [input#first-name]

        $$("#first-name")
        [input#first-name]

        $x("//input[@type='radio']")
        (4) [input, input, input, input]
        -->
        
    </head>
    
    <body>
        Let's get some data from the user:
        
        <ul>
            <li>Text</li>
            <li>Lot of Text - in multiple lines</li>
            <li>Select among options</li>
            <li>Yes or No</li>
            <li>Click a Button</li>
        </ul>

        <form method="post" action="accept-information.do">
            
            <fieldset>
                <label >First Name</label>
                <input type="text" name="first-name"  id="first-name" size="15" maxlength="20" value="Ranga"/>

                <label>Password</label>
                <input type="password"  id="password" name="password"/>            
            </fieldset>
            <!--style="font-size: 25px"-->
            
            <fieldset>
                <label id="update-profile-label">Upload Profile Picture</label>
                <input type="file" name="profile-picture"/>
            </fieldset>
            
            <fieldset>
                <label>Age</label>
                <input type="number" name="age" value="20"/>
                <label>Describe Yourselves</label>
                <textarea name="description" rows="5" cols="100"></textarea>
            </fieldset>
        
            <fieldset>
                <label>What do you want to learn?</label>
                <input type="radio" name="what-to-learn" value="HTML">HTML
                <input type="radio" name="what-to-learn" value="CSS" checked>CSS
                <input type="radio" name="what-to-learn" value="AUT">Automation Testing
                <input type="radio" name="what-to-learn" value="JAVA">Java
            </fieldset>
                
            <fieldset>
            <label>How do you want to Learn?</label>
            <select name="how-to-learn" multiple>
                <option value="online">Online</option>
                <option value="books">Books</option>
                <option value="college" selected>College</option>
                <option value="other">Other</option>
            </select>
            </fieldset>
            
            <fieldset>
                <input type="checkbox" name="drive" checked/>
                <label>Do You Know to Drive?</label>
            </fieldset>
            
            <fieldset>
                <input type="submit" />
            </fieldset>
        </form>
        
        
    </body>
</html>
```
---

### /html-basics/9-id-and-class.html

```html
<html>
    <head>
        
        <title>ID and Class in CSS</title>
        
        <!-- CSS Selectors -->
        <style type="text/css">
            p {
                color : brown;
            }
            
            div p {
                color : royalblue;
            }
         
            h2 {
                color : green;
            }
            
            p .second-paragraph {
                color:red;
            }

            .first-paragraph {
                color:orange;
            }
            
            .important-thing {
                background-color: yellow;
            }
            
            #html-important-point{
                background-color: #EEEEEE;
            }
            
            #important-point-outside-div{
                background-color: bisque;
            }

        </style>
        
        <!-- 

        CSS Selectors
        ~~~~~~~~~~~~~

        $$("p")
        (10) [p, p.first-paragraph.important-thing, p.second-paragraph, p#html-important-point, p#important-point-outside-div, p, p.first-paragraph, p.second-paragraph, p.first-paragraph, p.second-paragraph]
        
        $$("div p")
        (8) [p.first-paragraph.important-thing, p.second-paragraph, p#html-important-point, p, p.first-paragraph, p.second-paragraph, p.first-paragraph, p.second-paragraph]
        
        $$(".first-paragraph")
        (3) [p.first-paragraph.important-thing, p.first-paragraph, p.first-paragraph]
        
        $$(".second-paragraph")
        (4) [h1.second-paragraph, p.second-paragraph, p.second-paragraph, p.second-paragraph]
        
        $$("p .second-paragraph")
        []
        
        $$("p.second-paragraph")
        (3) [p.second-paragraph, p.second-paragraph, p.second-paragraph]
        
        $$("h2")
        (3) [h2, h2, h2]
        
        $$("h1")
        [h1.second-paragraph]0: h1.second-paragraphlength: 1__proto__: Array(0)
        
        $$("#html-important-point")
        [p#html-important-point]

        XPATH Selectors
        ~~~~~~~~~~~~~~~
        $$("p")
        (10) [p, p.first-paragraph.important-thing, p.second-paragraph, p#html-important-point, p#important-point-outside-div, p, p.first-paragraph, p.second-paragraph, p.first-paragraph, p.second-paragraph]

        $$("h1")
        [h1.second-paragraph]

        $x("h1")
        []

        $x("/html/body/h1")
        [h1.second-paragraph]

        $x("//h1")
        [h1.second-paragraph]

        $x("//p")
        (10) [p, p.first-paragraph.important-thing, p.second-paragraph, p#html-important-point, p#important-point-outside-div, p, p.first-paragraph, p.second-paragraph, p.first-paragraph, p.second-paragraph]

        $x("//h2")
        (3) [h2, h2, h2]

        $x("//h2[1]")
        [h2]

        $x("//h2[2]")
        [h2]

        $x("//h2[last()]")
        [h2]

        $x("//p")
        (10) [p, p.first-paragraph.important-thing, p.second-paragraph, p#html-important-point, p#important-point-outside-div, p, p.first-paragraph, p.second-paragraph, p.first-paragraph, p.second-paragraph]

        $x("//p[@id='html-important-point']")
        [p#html-important-point]0: p#html-important-pointlength: 1__proto__: Array(0)

        $$("#html-important-point")
        [p#html-important-point]

        $x("//p[@class='first-paragraph']")
        (2) [p.first-paragraph, p.first-paragraph]

        $$(".first-paragraph")
        (3) [p.first-paragraph.important-thing, p.first-paragraph, p.first-paragraph]

        body
        /html/body //body
        /html/body/h1 //h1
        body > h1
        body > p:nth-child(2)


        -->
    </head>
    
    <body>
        <h1 class="second-paragraph">Learn Automation Testing</h1>
        <p>Main Paragraph</p>
        
        <h2>HTML and CSS</h2>
        <div>
            <p class="first-paragraph important-thing">First Paragraph</p>
            <p class="second-paragraph">Second Paragraph</p>
            <p id="html-important-point">An important point about HTML</p>
        </div>
        
        <p id="important-point-outside-div">Paragraph outside div</p>
        
        <div><p>Paragraph inside div</p></div>
        
        <h2>Language</h2>
        <div>
            <p class="first-paragraph">First Paragraph</p>
            <p class="second-paragraph">Second Paragraph</p>
        </div>
        
        <h2>Selenium</h2>
        <div>
            <p class="first-paragraph">First Paragraph</p>
            <p class="second-paragraph">Second Paragraph</p>
        </div>
    </body>
</html>
```
---

### /html-basics/style.css

```css
label {
    font-size: 16px;
    color: #111111;
}

input, textarea, select {
    background-color: antiquewhite;
}

fieldset {
    border: 0px;
    padding: 20px;
    background-color: #EEFFFF;
}

ul {
    background-color: #EEFFEE;
}

li {
    color: #666666;
}
```
---

### /junit-basics/src/test/java/com/example/tests/FacebookLogin.java

```java
package com.example.tests;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class FacebookLogin {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
      ChromeDriverManager.getInstance().setup();

    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFacebookLogin() throws Exception {
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("in28minutes");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("dummy");
    driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
```
---

### /junit-basics/src/test/java/com/example/tests/GoogleSearchForIn28minutes.java

```java
package com.example.tests;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class GoogleSearchForIn28minutes {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    
      ChromeDriverManager.getInstance().setup();
      driver = new ChromeDriver();

      baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGoogleSearchForIn28minutes() throws Exception {
    driver.get("https://www.google.com/");
    driver.findElement(By.id("lst-ib")).click();
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("in28minutes");
    driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
```
---

### /junit-basics/src/test/java/com/in28minutes/tests/FirstJUnitTest.java

```java
package com.in28minutes.tests;

import static org.junit.Assert.*;

import org.junit.Test;

class SimpleClass {
    public int sum(int[] numbers) {
        int sum = 0;
        
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        
        return sum;
    }
}

public class FirstJUnitTest {

    @Test
    public void test() {
        
        //Execute the Code
        SimpleClass simpleClass = new SimpleClass();
        
        int actualResult = simpleClass.sum( new int[] {12, 15, 18});
        
        //Check the Output
        int expectedResult = 45;
        
        //check expectedResult is equal to actualResult
        assertEquals(expectedResult, actualResult);
        
        
        //No checks
        //Checks
        //Absence of Failure is Success
    }

    @Test
    public void testFor0Elements() {
        
        //Execute the Code
        SimpleClass simpleClass = new SimpleClass();
        
        int actualResult = simpleClass.sum( new int[] {});
        
        //Check the Output
        int expectedResult = 0;
        
        //check expectedResult is equal to actualResult
        assertEquals(expectedResult, actualResult);
        
        
        //No checks
        //Checks
        //Absence of Failure is Success
    }

    @Test
    public void testFor2Elements() {
        
        //Execute the Code
        SimpleClass simpleClass = new SimpleClass();
        
        int actualResult = simpleClass.sum( new int[] {12, 15});
        
        //Check the Output
        int expectedResult = 27;
        
        //check expectedResult is equal to actualResult
        assertEquals(expectedResult, actualResult);
        
        
        //No checks
        //Checks
        //Absence of Failure is Success
    }

    @Test
    public void testFor5Elements() {
        
        //Execute the Code
        SimpleClass simpleClass = new SimpleClass();
        
        int actualResult = simpleClass.sum( new int[] {2, 6, 8, 15, 18});
        
        //Check the Output
        int expectedResult = 49;
        
        //check expectedResult is equal to actualResult
        assertEquals(expectedResult, actualResult);
        
        
        //No checks
        //Checks
        //Absence of Failure is Success
    }

}
```
---

### /junit-basics/src/test/java/com/in28minutes/tests/FirstSeleniumJUnitTest.java

```java
package com.in28minutes.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumJUnitTest {

    WebDriver webDriver;

    @Before
    public void before() {
        // Execute the Code

        // Download the Web Driver Executable
        // Set the path to Web Driver Executable
        WebDriverManager.chromedriver().setup();

        // Create an instance of WebDriver

        webDriver = new ChromeDriver();

    }

    @Test
    public void testGoogleDotCom() {

        // WebDriver - Launch up http://www.google.com
        webDriver.get("http://www.google.com");

        // https://www.google.com/?gws_rd=ssl
        // System.out.println(webDriver.getCurrentUrl());

        // System.out.println(webDriver.getTitle());

        String actualTitle = webDriver.getTitle();

        String expectedTitle = "Google";

        // Check the output
        // WebDriver - Title is Google
        assertEquals(expectedTitle, actualTitle);

    }

    @Test
    public void testFacebookDotCom() {

        webDriver.get("http://www.facebook.com");

        String actualTitle = webDriver.getTitle();

        String expectedTitle = "Facebook – log in or sign up";

        // Check the output
        assertEquals(expectedTitle, actualTitle);

    }

    @Test
    @Ignore
    public void testSomeErrorScenarioCom() {

        webDriver.get("com");

        String actualTitle = webDriver.getTitle();

        String expectedTitle = "Facebook – log in or sign up";

        // Check the output
        assertEquals(expectedTitle, actualTitle);

    }

    @After
    public void after() {
        System.out.println("I'm, Executed");
        webDriver.quit();
    }

}

// org.openqa.selenium.WebDriverException:
// unknown error: unhandled inspector error:
// {"code":-32000,"message":"Cannot navigate to invalid URL"}
```
---


### /testng-basics/src/test/java/com/example/tests/FacebookLogin.java

```java
package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFacebookLogin() throws Exception {
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("in28minutes");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("dummy");
    driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
```
---

### /testng-basics/src/test/java/com/example/tests/GoogleSearchForIn28minutes.java

```java
package com.example.tests;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class GoogleSearchForIn28minutes {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    ChromeDriverManager.getInstance().setup();
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGoogleSearchForIn28minutes() throws Exception {
    driver.get("https://www.google.com/");
    driver.findElement(By.id("lst-ib")).click();
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("in28minutes");
    driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
```
---

### /testng-basics/src/test/java/com/in28minutes/test/testng/FirstSeleniumTestNgTest.java

```java
package com.in28minutes.test.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTestNgTest {

    WebDriver webDriver;

    @BeforeTest
    public void before() {
        // Execute the Code

        // Download the Web Driver Executable
        // Set the path to Web Driver Executable
        WebDriverManager.chromedriver().setup();

        // Create an instance of WebDriver

        webDriver = new ChromeDriver();

    }

    @Test
    public void testGoogleDotCom() {

        // WebDriver - Launch up http://www.google.com
        webDriver.get("http://www.google.com");

        // https://www.google.com/?gws_rd=ssl
        // System.out.println(webDriver.getCurrentUrl());

        // System.out.println(webDriver.getTitle());

        String actualTitle = webDriver.getTitle();

        String expectedTitle = "Google";

        // Check the output
        // WebDriver - Title is Google
        assertEquals(expectedTitle, actualTitle);

    }

    @Test
    public void testFacebookDotCom() {

        webDriver.get("http://www.facebook.com");

        String actualTitle = webDriver.getTitle();

        String expectedTitle = "Facebook – log in or sign up";

        // Check the output
        assertEquals(expectedTitle, actualTitle);

    }

    @Test
    @Ignore
    public void testSomeErrorScenarioCom() {

        webDriver.get("com");

        String actualTitle = webDriver.getTitle();

        String expectedTitle = "Facebook – log in or sign up";

        // Check the output
        assertEquals(expectedTitle, actualTitle);

    }

    @AfterTest
    public void after() {
        System.out.println("I'm, Executed");
        webDriver.quit();
    }

}

// org.openqa.selenium.WebDriverException:
// unknown error: unhandled inspector error:
// {"code":-32000,"message":"Cannot navigate to invalid URL"}
```
---

### /testng-basics/src/test/java/com/in28minutes/test/testng/FirstTestngTest.java

```java
package com.in28minutes.test.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

class SimpleClass {
    public int sum(int[] numbers) {
        int sum = 0;
        
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        
        return sum;
    }
}

public class FirstTestngTest {

    @Test
    public void test() {
        
        //Execute the Code
        SimpleClass simpleClass = new SimpleClass();
        
        int actualResult = simpleClass.sum( new int[] {12, 15, 18});
        
        //Check the Output
        int expectedResult = 45;
        
        //check expectedResult is equal to actualResult
        assertEquals(expectedResult, actualResult);
        
        
        //No checks
        //Checks
        //Absence of Failure is Success
    }

    @Test
    public void testFor0Elements() {
        
        //Execute the Code
        SimpleClass simpleClass = new SimpleClass();
        
        int actualResult = simpleClass.sum( new int[] {});
        
        //Check the Output
        int expectedResult = 0;
        
        //check expectedResult is equal to actualResult
        assertEquals(expectedResult, actualResult);
        
        
        //No checks
        //Checks
        //Absence of Failure is Success
    }

    @Test
    public void testFor2Elements() {
        
        //Execute the Code
        SimpleClass simpleClass = new SimpleClass();
        
        int actualResult = simpleClass.sum( new int[] {12, 15});
        
        //Check the Output
        int expectedResult = 27;
        
        //check expectedResult is equal to actualResult
        assertEquals(expectedResult, actualResult);
        
        
        //No checks
        //Checks
        //Absence of Failure is Success
    }

    @Test
    public void testFor5Elements() {
        
        //Execute the Code
        SimpleClass simpleClass = new SimpleClass();
        
        int actualResult = simpleClass.sum( new int[] {2, 6, 8, 15, 18});
        
        //Check the Output
        int expectedResult = 49;
        
        //check expectedResult is equal to actualResult
        assertEquals(expectedResult, actualResult);
        
        
        //No checks
        //Checks
        //Absence of Failure is Success
    }

}
```
---

### /testng-basics/src/test/java/com/in28minutes/test/testng/MultipleBrowserTest.java

```java
package com.in28minutes.test.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserTest {
  
    @Parameters("browser")
    @Test
    public void runInBrowser(String browser) {
        System.out.println(browser);
    }
}
```

---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/AbstractChromeWebDriverTest.java

```java
package com.in28minutes.webdriver.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractChromeWebDriverTest {

    protected WebDriver driver;

    public AbstractChromeWebDriverTest() {
        super();
    }

    @BeforeTest
    public void beforeTest() {
        //Download the web driver executable
        WebDriverManager.chromedriver().setup();
        
        //Create a instance of your web driver - chrome
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/form/FormElementCheckBoxTest.java

```java
package com.in28minutes.webdriver.basics.form;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FormElementCheckBoxTest extends AbstractChromeWebDriverTest {

    @Test
    public void readFromACheckBox() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement checkboxElement1 = driver.findElement(By.name("checkboxElement1"));
        System.out.println(checkboxElement1.isSelected());//false
        assertFalse(checkboxElement1.isSelected());
        
        WebElement checkboxElement2 = driver.findElement(By.name("checkboxElement2"));
        System.out.println(checkboxElement2.isSelected());//true
        assertTrue(checkboxElement2.isSelected());
    }
    
    @Test
    public void setAValueIntoCheckBoxElement1() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement checkboxElement1 = driver.findElement(By.name("checkboxElement1"));
        sleep(4);
        checkboxElement1.click();
        sleep(4);
        WebElement checkboxElement3 = driver.findElement(By.name("checkboxElement3"));
        sleep(4);
        checkboxElement3.click();
        sleep(4);
    }

    @Test
    public void checkACheckBox() {
        driver.get("http://localhost:8080/pages/forms.html");
        
        checkACheckBox("checkboxElement1");
        sleep(2);
        checkACheckBox("checkboxElement2");
        sleep(2);
        checkACheckBox("checkboxElement3");
        
        checkACheckBox("inlineCheckboxElement1");
        checkACheckBox("inlineCheckboxElement2");
        checkACheckBox("inlineCheckboxElement3");
        sleep(4);

    }

    @Test
    public void unCheckACheckBox() {
        driver.get("http://localhost:8080/pages/forms.html");
        
        unCheckACheckBox("checkboxElement1");
        sleep(2);
        unCheckACheckBox("checkboxElement2");
        sleep(2);
        unCheckACheckBox("checkboxElement3");

        unCheckACheckBox("inlineCheckboxElement1");
        unCheckACheckBox("inlineCheckboxElement2");
        unCheckACheckBox("inlineCheckboxElement3");
        
        sleep(4);

    }

    private void checkACheckBox(String checkboxName) {
        WebElement checkboxElement1 = driver.findElement(By.name(checkboxName));
        
        boolean currentValue = checkboxElement1.isSelected();
        
        if(currentValue==false) {
            checkboxElement1.click();
        }
    }
    
    private void unCheckACheckBox(String checkboxName) {
        WebElement checkboxElement1 = driver.findElement(By.name(checkboxName));
        
        boolean currentValue = checkboxElement1.isSelected();
        
        if(currentValue==true) {
            checkboxElement1.click();
        }
    }

}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/form/FormElementRadioButtonTest.java

```java
package com.in28minutes.webdriver.basics.form;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FormElementRadioButtonTest extends AbstractChromeWebDriverTest {

    @Test
    public void readFromARadioButton() {
        driver.get("http://localhost:8080/pages/forms.html");
        List<WebElement> options = driver.findElements(By.name("optionsRadios"));
        for (WebElement option : options) {
            System.out.println(option.getAttribute("value") + " " + option.isSelected());
        }
        // option1 false
        // option2 false
        // option3 true

    }

    @Test
    public void readFromARadioButtonWithAFrameworkMethod() {
        driver.get("http://localhost:8080/pages/forms.html");
        System.out.println(getSelectedRadioButtonValue("optionsRadios"));// option3
        System.out.println(getSelectedRadioButtonValue("optionsRadiosInline"));

    }

    @Test
    public void setValueForRadioButton() {
        driver.get("http://localhost:8080/pages/forms.html");
        List<WebElement> options = driver.findElements(By.name("optionsRadios"));
        sleep(4);
        for (WebElement option : options) {
            if (option.getAttribute("value").equals("option2")) {
                option.click();
            }
        }
        sleep(4);
    }

    @Test
    public void setValueForRadioButtonWithAFrameworkMethod() {
        driver.get("http://localhost:8080/pages/forms.html");
        sleep(4);
        setRadioButtonToValue("optionsRadios", "option2");
        sleep(4);
        setRadioButtonToValue("optionsRadiosInline", "inline-option1");
    }

    private void setRadioButtonToValue(String radioButtonName, String valueToSelect) {
        List<WebElement> options = driver.findElements(By.name(radioButtonName));
        for (WebElement option : options) {
            if (option.getAttribute("value").equals(valueToSelect)) {
                option.click();
            }
        }
    }

    private String getSelectedRadioButtonValue(String name) {

        List<WebElement> options = driver.findElements(By.name(name));

        for (WebElement option : options) {
            if (option.isSelected()) {
                return option.getAttribute("value");
            }
        }

        return null;
    }

    @Test
    public void setValueForRadioButtonWithAFrameworkMethod_UsingCSS() {
        driver.get("http://localhost:8080/pages/forms.html");
        sleep(4);
        setRadioButtonToValueUsingCSS("optionsRadios", "option2");
        sleep(4);
        setRadioButtonToValueUsingCSS("optionsRadiosInline", "inline-option1");
        sleep(4);
    }

    private void setRadioButtonToValueUsingCSS(String radioButtonName, String valueToSelect) {
        String cssSelector = "input[name='" + radioButtonName + "'][value='" + valueToSelect + "']";

        WebElement option = driver.findElement(By.cssSelector(cssSelector));
        option.click();
    }

    @Test
    public void setValueForRadioButtonWithAFrameworkMethod_UsingXPath() {
        driver.get("http://localhost:8080/pages/forms.html");
        sleep(4);
        setRadioButtonToValueUsingXPath("optionsRadios", "option2");
        sleep(4);
        setRadioButtonToValueUsingXPath("optionsRadiosInline", "inline-option1");
        sleep(4);
    }

    private void setRadioButtonToValueUsingXPath(String radioButtonName, String valueToSelect) {
        String cssSelector = "//input[@name='" + radioButtonName + "'][@value='" + valueToSelect + "']";

        WebElement option = driver.findElement(By.xpath(cssSelector));
        option.click();
    }

}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/form/FormElementSelectTest.java

```java
package com.in28minutes.webdriver.basics.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FormElementSelectTest extends AbstractChromeWebDriverTest {

    @Test
    public void readValueOfSelectBox() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement selectElement = driver.findElement(By.id("selectElement1"));
        Select select = new Select(selectElement);
        System.out.println(select.isMultiple());
        System.out.println(select.getFirstSelectedOption().getText());
    }
    
    @Test
    public void readValueFromMultiSelectBox() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement selectElement = driver.findElement(By.id("multiSelectElement"));
        Select select = new Select(selectElement);
        System.out.println(select.isMultiple());//true
        System.out.println(select.getFirstSelectedOption().getText());//One
        for (WebElement element : select.getAllSelectedOptions()) {
            System.out.println(element.getText());//One,Three
        }
    }
    
    @Test
    public void setValuesIntoSelectBox() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement selectElement = driver.findElement(By.id("selectElement1"));
        sleep(5);
        Select select = new Select(selectElement);
        select.selectByValue("2");
        sleep(5);
        select.selectByVisibleText("Five");
        sleep(5);
        select.selectByIndex(3);
        sleep(5);
        System.out.println(select.isMultiple());
        System.out.println(select.getFirstSelectedOption().getText());
    }

    @Test
    public void setValuesIntoMultiSelectBox() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement selectElement = driver.findElement(By.id("multiSelectElement"));
        sleep(5);
        Select select = new Select(selectElement);
        select.deselectAll();
        sleep(3);
        select.selectByValue("2");
        sleep(3);
        select.selectByVisibleText("Five");
        sleep(3);
        select.selectByIndex(3);
        sleep(3);
        select.deselectByVisibleText("Four");
        sleep(3);
        System.out.println(select.isMultiple());
        System.out.println(select.getFirstSelectedOption().getText());
    }

}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/form/FormElementTextTest.java

```java
package com.in28minutes.webdriver.basics.form;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FormElementTextTest extends AbstractChromeWebDriverTest {

    @Test
    public void readFromATextElement() {
        driver.get("http://localhost:8080/pages/forms.html");
        assertEquals(
                driver.findElement(By.id("textElement")).getAttribute("value"), 
                "in28minutes");
    }
    
    @Test
    public void setASpecificValueIntoTextElement() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement textElement = driver.findElement(By.id("textElement"));
        sleep(4);
        textElement.clear();
        textElement.sendKeys("NewValue");
        sleep(4);
    }

    @Test
    public void writeAndReadAValueFromTextArea() {
        driver.get("http://localhost:8080/pages/forms.html");
        
        WebElement textArea = driver.findElement(By.id("textAreaElement"));
        
        assertEquals(textArea.getAttribute("value"),"");
        sleep(4);
        textArea.clear();
        textArea.sendKeys("FirstLine");
        textArea.sendKeys("\n");
        textArea.sendKeys("SecondLine");
        sleep(4);
        System.out.println(textArea.getAttribute("value"));
        assertEquals(textArea.getAttribute("value"),"FirstLine\nSecondLine");
        
    }

}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/WebDriverBasicsLocatorsPerformanceTest.java

```java
package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsPerformanceTest extends AbstractChromeWebDriverTest{
    
    @Test
    public void testCssSelectorForMultipleTableTd() {   
        driver.get("http://localhost:8080/pages/tables.html");
        WebElement browserRow1 = driver.findElement(
                By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
        WebElement browserRow2 = driver.findElement(
                By.cssSelector("#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)"));
        WebElement browserRow3 = driver.findElement(
                By.cssSelector("#dataTables-example > tbody > tr:nth-child(3) > td:nth-child(2)"));
        assertEquals(browserRow1.getText(), "Firefox 1.0");     
        assertEquals(browserRow2.getText(), "Firefox 1.5");     
        assertEquals(browserRow3.getText(), "Firefox 2.0");     
    }
    
    @Test
    public void testCssSelectorForMultipleTableTd_MorePerformance() {   
        driver.get("http://localhost:8080/pages/tables.html");
        
        WebElement tableTbody = driver.findElement(
                By.cssSelector("#dataTables-example > tbody"));
        
        WebElement browserRow1 = 
                tableTbody.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)"));

        WebElement browserRow2 = 
                tableTbody.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)"));

        WebElement browserRow3 = 
                tableTbody.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2)"));

        assertEquals(browserRow1.getText(), "Firefox 1.0");     
        assertEquals(browserRow2.getText(), "Firefox 1.5");     
        assertEquals(browserRow3.getText(), "Firefox 2.0");     
    }   

}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/WebDriverBasicsLocatorsWithClassTest.java

```java
package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithClassTest extends AbstractChromeWebDriverTest{
    
    @Test
    public void testTitle() {   
        driver.get("http://localhost:8080/pages/index.html");
        WebElement title = driver.findElement(By.className("navbar-brand"));
        assertEquals(title.getText(), "SB Admin v2.0");     
    }
    
    //huge
    @Test
    public void testHugeTextElements() {    
        driver.get("http://localhost:8080/pages/index.html");
        List<WebElement> hugeElements = driver.findElements(By.className("huge"));
        for(WebElement element: hugeElements) {
            System.out.println(element.getText());
        }

    }
    
}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/WebDriverBasicsLocatorsWithCSSSelectorTest.java

```java
package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithCSSSelectorTest extends AbstractChromeWebDriverTest {

    @Test
    public void testCssSelectorForaTableTd() {
        driver.get("http://localhost:8080/pages/tables.html");

        WebElement browserRow1 = driver
                .findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
        assertEquals(browserRow1.getText(), "Firefox 1.0");
        
    }

    // $$("#dataTables-example > thead > tr > th:nth-child(2)")
    // [th.sorting]0: th.sortinglength: 1__proto__: Array(0)
    // $$("#dataTables-example > tbody > tr.gradeU.odd > td.sorting_1")
    // [td.sorting_1]

    @Test
    public void testCssSelectorForSortingAndCheckingFirstRow() {
        driver.get("http://localhost:8080/pages/tables.html");

        /*
         * <tr class="gradeA odd" role="row"> <td class="sorting_1">Gecko</td>
         * <td>Firefox 1.0</td> <td>Win 98+ / OSX.2+</td> <td class="center">1.7</td>
         * <td class="center">A</td> </tr>
         * 
         * 
         * <tr class="gradeU odd" role="row"> <td class="">Other browsers</td> <td
         * class="sorting_1">All others</td> <td>-</td> <td class="center">-</td> <td
         * class="center">U</td> </tr>
         */

        // #dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)
        // #dataTables-example > tbody > tr.gradeU.odd > td.sorting_1

        WebElement headerBrowser = driver
                .findElement(By.cssSelector("#dataTables-example > thead > tr > th:nth-child(2)"));

        headerBrowser.click();

        WebElement element = driver
                .findElement(By.cssSelector("#dataTables-example > tbody > tr.gradeU.odd > td.sorting_1"));

        assertEquals(element.getText(), "All others");
    }

}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/WebDriverBasicsLocatorsWithIdTest.java

```java
package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasicsLocatorsWithIdTest extends AbstractChromeWebDriverTest{
    
    @Test
    public void testTitle() {
    
        //get the http://localhost:8080/login
        driver.get("http://localhost:8080/login");
        
        //assert the title
        assertEquals("First Web Application",
                driver.getTitle());//First Web Application
        
    }
    
    @Test
    public void testGetInformationAboutName() {
        driver.get("http://localhost:8080/login");
        WebElement nameElement = driver.findElement(By.id("name"));
        System.out.println(nameElement.getTagName());//input
        System.out.println(nameElement.getAttribute("type"));//text
        System.out.println(nameElement.getAttribute("value"));//EMPTY
    }

    @Test
    public void testGetInformationAboutPassword() {
        driver.get("http://localhost:8080/login");
        WebElement nameElement = driver.findElement(By.id("password"));
        System.out.println(nameElement.getTagName());//input
        System.out.println(nameElement.getAttribute("type"));//password
        System.out.println(nameElement.getAttribute("value"));//EMPTY
    }
    
    @Test
    public void testGetInformationAboutSubmitButton() {
        driver.get("http://localhost:8080/login");
        WebElement nameElement = driver.findElement(By.id("submit"));
        System.out.println(nameElement.getTagName());//input
        System.out.println(nameElement.getAttribute("type"));//submit
        System.out.println(nameElement.getAttribute("value"));//EMPTY
    }

}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/WebDriverBasicsLocatorsWithLinkTextTest.java

```java
package com.in28minutes.webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithLinkTextTest extends AbstractChromeWebDriverTest {
  
  @Test
  public void getIn28MinuteLinkAndClickIt() {
      driver.get("http://localhost:8080/login");
      WebElement link = driver.findElement(By.linkText("in28Minutes"));
      System.out.println(link.getAttribute("href"));//http://www.in28minutes.com/
      link.click();
      System.out.println(driver.getCurrentUrl());// http://www.in28minutes.com/
  }
  
  @Test
  public void getTableLinkAndClickIt() {
      driver.get("http://localhost:8080/pages/index.html");
      WebElement link = driver.findElement(By.linkText("Tables"));
      System.out.println(link.getAttribute("href"));
      link.click();
      System.out.println(driver.getCurrentUrl());
  }

  @Test
  public void getSBAdminLinkAndClickIt() {
      driver.get("http://localhost:8080/pages/index.html");
      WebElement link = driver.findElement(By.partialLinkText("SB Admin"));
      System.out.println(link.getAttribute("href"));
      link.click();
      System.out.println(driver.getCurrentUrl());
  }

  
}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/WebDriverBasicsLocatorsWithNameTest.java

```java
package com.in28minutes.webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithNameTest extends AbstractChromeWebDriverTest {
    
    @Test
    public void testGetInformationAboutEmail() {
        driver.get("http://localhost:8080/pages/login.html");
        WebElement nameElement = driver.findElement(By.name("email"));
        System.out.println(nameElement.getTagName());//input
        System.out.println(nameElement.getAttribute("class"));//form-control
        System.out.println(nameElement.getAttribute("placeholder"));//E-mail
        System.out.println(nameElement.getAttribute("value"));//EMPTY
    }

    @Test
    public void testGetInformationAboutPassword() {
        driver.get("http://localhost:8080/pages/login.html");
        WebElement nameElement = driver.findElement(By.name("password"));
        System.out.println(nameElement.getTagName());//input
        System.out.println(nameElement.getAttribute("class"));//form-control
        System.out.println(nameElement.getAttribute("placeholder"));//Password
        System.out.println(nameElement.getAttribute("value"));//EMPTY
    }


    @Test
    public void testGetInformationAboutCheckbox() {
        driver.get("http://localhost:8080/pages/login.html");
        WebElement nameElement = driver.findElement(By.name("remember"));
        System.out.println(nameElement.getTagName());//input
        System.out.println(nameElement.getAttribute("class"));//
        System.out.println(nameElement.getAttribute("value"));//Remember Me
        System.out.println(nameElement.getAttribute("type"));//checkbox
    }
    
    @Test
    @Ignore
    public void testGetInformationAboutSubmitButton() {
        driver.get("http://localhost:8080/pages/login.html");
        WebElement nameElement = driver.findElement(By.id("submit"));
        System.out.println(nameElement.getTagName());//input
        System.out.println(nameElement.getAttribute("type"));//submit
        System.out.println(nameElement.getAttribute("value"));//EMPTY
    }

    //FAILED: testGetInformationAboutSubmitButton
    //org.openqa.selenium.NoSuchElementException: 
    //no such element: Unable to locate element: 
    //{"method":"id","selector":"submit"}

}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/WebDriverBasicsLocatorsWithTagTest.java

```java
package com.in28minutes.webdriver.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithTagTest extends AbstractChromeWebDriverTest {
  
  @Test
  public void getDetailsAboutLoginButton() {
      driver.get("http://localhost:8080/pages/login.html");
      WebElement linkElement = driver.findElement(By.tagName("a"));
      System.out.println(linkElement.getText());//Login
      System.out.println(linkElement.getAttribute("class"));//btn btn-lg btn-success btn-block
      System.out.println(linkElement.getAttribute("href"));//http://localhost:8080/pages/index.html
  }
  
  @Test
  public void getDetailsAboutInputTags_FindElementWillReturnFirstElement() {
      driver.get("http://localhost:8080/pages/login.html");
      WebElement linkElement = driver.findElement(By.tagName("input"));
      System.out.println(linkElement.getAttribute("class"));//form-control
      System.out.println(linkElement.getAttribute("placeholder"));//E-mail
  }
  
  @Test
  public void getDetailsAboutInputTags_FindAllElements() {
      driver.get("http://localhost:8080/pages/login.html");
      
      List<WebElement> elements = driver.findElements(By.tagName("input"));
      
      for(WebElement element:elements) {
          System.out.println(element.getAttribute("class"));
          System.out.println(element.getAttribute("placeholder"));
      }
  }
  
  @Test
  public void getDetailsAboutInputTags_FindAllElements_Login() {
      driver.get("http://localhost:8080/login");
      
      List<WebElement> elements = driver.findElements(By.tagName("input"));
      
      for(WebElement element:elements) {
          System.out.println(element.getAttribute("type"));
          System.out.println(element.getAttribute("name"));
          sleep(3);
      }
  }
}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/basics/WebDriverBasicsLocatorsWithXPathSelectorTest.java

```java
package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithXPathSelectorTest extends AbstractChromeWebDriverTest{
    
    @Test
    public void testXpathSelectorForaTableTd() {
        driver.get("http://localhost:8080/pages/tables.html");
        //$x("//*[@id='dataTables-example']/tbody/tr[1]/td[2]")
        WebElement browserRow1 = driver.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));
        assertEquals(browserRow1.getText(), "Firefox 1.0");     
    }
    
//  $$("#dataTables-example > thead > tr > th:nth-child(2)")
//  [th.sorting]0: th.sortinglength: 1__proto__: Array(0)
//  $$("#dataTables-example > tbody > tr.gradeU.odd > td.sorting_1")
//  [td.sorting_1]
    
    @Test
    public void testXpathSelectorForSortingAndCheckingFirstRow() {
        
//      $x("//*[@id='dataTables-example']/thead/tr/th[2]")
//      [th.sorting]0: th.sortinglength: 1__proto__: Array(0)
//      $x("//*[@id='dataTables-example']/tbody/tr[1]/td[2]")
//      [td]
                
        driver.get("http://localhost:8080/pages/tables.html");
        
        WebElement headerBrowser = driver.findElement
                (By.xpath(
                "//*[@id='dataTables-example']/thead/tr/th[2]"));
        
        headerBrowser.click();

        WebElement element = driver.findElement
                (By.xpath(
                "//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));

        assertEquals(element.getText(), "All others");      
    }
    
    
}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/login/FirstWebApplicationLoginTest.java

```java
package com.in28minutes.webdriver.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FirstWebApplicationLoginTest extends AbstractChromeWebDriverTest{
  
  @Test
  public void login() {
      driver.get("http://localhost:8080/login");
      
      sleep(5);
      
      WebElement nameElement = driver.findElement(By.name("name"));
      nameElement.sendKeys("in28minutes");
      
      sleep(2);
      
      WebElement passwordElement = driver.findElement(By.id("password"));
      passwordElement.sendKeys("dummy");
      
      sleep(2);
      
      WebElement submitElement = driver.findElement(By.id("submit"));
      submitElement.click();
      
      sleep(2);
      
      WebElement welcomeMessageElement = 
              driver.findElement(By.id("welcome-message"));
      
      
      
      //Welcome in28minutes!! Click here to manage your todo's.
      System.out.println(welcomeMessageElement.getText());
      
  }
}
```
---

### /web-driver-1-basics/src/test/java/com/in28minutes/webdriver/login/StaticLoginTest.java

```java
package com.in28minutes.webdriver.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class StaticLoginTest extends AbstractChromeWebDriverTest{
  
  @Test
  public void login() {
      driver.get("http://localhost:8080/pages/login.html");
      
      sleep(5);
      
      WebElement emailElement = driver.findElement(By.name("email"));
      emailElement.sendKeys("in28minutes@gmail.com");
      
      sleep(2);
      
      WebElement passwordElement = driver.findElement(By.name("password"));
      passwordElement.sendKeys("dummy");
      
      sleep(2);
      
      WebElement loginElement = driver.findElement(By.tagName("a"));
      loginElement.click();
      
      sleep(2);
      
      //http://localhost:8080/pages/index.html
      System.out.println(driver.getCurrentUrl());
      
  }
}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/basics/AbstractChromeWebDriverTest.java

```java
package com.in28minutes.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractChromeWebDriverTest {

  protected WebDriver driver;

  public AbstractChromeWebDriverTest() {
    super();
  }

  @BeforeTest
  public void beforeTest() {
    //Download the web driver executable
    WebDriverManager.chromedriver().setup();
    
    //Create a instance of your web driver - chrome
    driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
    driver.quit();
  }
  
  public void sleep(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/ActionsBasicTest.java

```java
package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class ActionsBasicTest extends AbstractChromeWebDriverTest {

    @Test
    public void testBasicActions() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement element = driver.findElement(By.id("textElement"));
        WebElement tablesLink = driver.findElement(By.linkText("Tables"));
        
        //element.sendKeys("abc");
        //tablesLink.click();
        
        Actions actions = new Actions(driver);
        actions.sendKeys(element, "Dummy Text").perform();
        sleep(5);
        actions.click(tablesLink).perform();
        sleep(5);
        
        
    }
    
    @Test
    public void testBasicActions_Combine() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement element = driver.findElement(By.id("textElement"));
        WebElement tablesLink = driver.findElement(By.linkText("Tables"));
        
        Actions actions = new Actions(driver);
        actions
            .sendKeys(element, "Dummy Text")
            .click(tablesLink)
            .perform();
        sleep(5);
    }

    @Test
    public void testBasicDragAndDrop() {
        driver.get("http://localhost:8080/pages/sortable.html");
        WebElement htmlElement = driver.findElement(By.id("html"));
        Actions actions = new Actions(driver);
        actions
            .dragAndDropBy(htmlElement, 50, 200)
            .perform();
        
        sleep(5);
    }


    @Test
    public void testBasicDragAndDrop_Complicated() {
        driver.get("http://localhost:8080/pages/sortable.html");
        WebElement htmlElement = driver.findElement(By.id("html"));
        
        Actions actions = new Actions(driver);
        actions
            .clickAndHold(htmlElement)
            .moveByOffset(50, 200)
            .release()
            .perform();
        
        sleep(5);
    }

}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/CheckElementStylesTest.java

```java
package com.in28minutes.webdriver.scenarios;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class CheckElementStylesTest extends AbstractChromeWebDriverTest {

    @Test
    public void getCSSStylesForErrorElement() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement errorField = driver.findElement(By.id("inputError"));

        System.out.println(errorField.getCssValue("color"));// rgba(85, 85, 85, 1)
        System.out.println(errorField.getCssValue("display"));// block
        System.out.println(errorField.getCssValue("border-color"));// rgb(169, 68, 66)
        System.out.println(errorField.getCssValue("height"));// 34px
        System.out.println(errorField.getCssValue("font-size"));// 14px
        System.out.println(errorField.getCssValue("background-color"));// rgba(255, 255, 255, 1)
        System.out.println(errorField.getCssValue("border"));// 1px solid rgb(169, 68, 66)

    }

    @Test
    public void getCSSStylesForSuccessElement() {
        driver.get("http://localhost:8080/pages/forms.html");
        WebElement errorField = driver.findElement(By.id("inputSuccess"));
        System.out.println(errorField.getCssValue("color"));// rgba(85, 85, 85, 1)
        System.out.println(errorField.getCssValue("display"));// block
        System.out.println(errorField.getCssValue("border-color"));// rgb(60, 118, 61)
        System.out.println(errorField.getCssValue("height"));// 34px
        System.out.println(errorField.getCssValue("font-size"));// 14px
        System.out.println(errorField.getCssValue("background-color"));// rgba(255, 255, 255, 1)
        System.out.println(errorField.getCssValue("border"));// 1px solid rgb(60, 118, 61)
    }

    @Test
    public void checkIfAnElementIsEnabled() {
        driver.get("http://localhost:8080/pages/forms.html");
        
        WebElement errorField = driver.findElement(By.id("disabledInput"));
        
        assertFalse(errorField.isEnabled());
        System.out.println(errorField.isEnabled());//false
        
    }
    
    @Test
    public void exploreWebElementInterface() {
        driver.get("http://localhost:8080/pages/forms.html");
        
        WebElement errorField = driver.findElement(By.id("disabledInput"));
        System.out.println(errorField.getAttribute("placeholder"));//Disabled input
        
        System.out.println(errorField.getLocation());//(740, 311)
        System.out.println(errorField.getSize());//(414, 34)
        
        WebElement textElement = driver.findElement(By.id("textElement"));      
        System.out.println(textElement.getLocation());//(297, 242)
        System.out.println(textElement.getSize());//(414, 34)

        WebElement textAreaElement = driver.findElement(By.id("textAreaElement"));      
        System.out.println(textAreaElement.getLocation());//(297, 549)
        System.out.println(textAreaElement.getSize());//(414, 74)

        WebElement inputWarning = driver.findElement(By.id("inputWarning"));        
        System.out.println(inputWarning.getLocation());//(740, 666)
        System.out.println(inputWarning.getSize());//(414, 34)

        //findElements, findElement

    }

}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/FramesTest.java

```java
package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FramesTest extends AbstractChromeWebDriverTest {

    @Test
    public void testFrames() {
        driver.get("http://localhost:8080/pages/frames-example.html");
        
        driver.switchTo().frame(0);
        
        System.out.println(  
                "0 - " + driver.findElement(By.tagName("h1")).getText()
                );//0 - Frames Example Left
        
        //org.openqa.selenium.NoSuchFrameException: no such frame
        //driver.switchTo().frame(1);
        
        driver.switchTo().parentFrame();
        
        driver.switchTo().frame(1);
        
        System.out.println(  
                "1 - " + driver.findElement(By.tagName("h1")).getText()
                );//1 - Frames Example Right

        
    }
}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/framework/TableReader.java

```java
package com.in28minutes.webdriver.scenarios.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableReader {
    private WebDriver driver;
    private String id;
    private WebElement tbody;

    public TableReader(WebDriver driver, String id) {
        this.driver = driver;
        this.id = id;
        tbody = driver.findElement(By.cssSelector("#"
                + id
                + " > tbody"));
    }

    public String getData(int row, int col) {
        return tbody.findElement(By.cssSelector("tr:nth-child("
                + row
                + ") > td:nth-child("
                + col
                + ")")).getText();
    }

}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/JavaScriptAlertTest.java

```java
package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class JavaScriptAlertTest extends AbstractChromeWebDriverTest {

    @Test
    public void testForAlert() {
        driver.get("http://localhost:8080/pages/notifications.html");
        driver.findElement(By.id("alertButton")).click();

        //org.openqa.selenium.UnhandledAlertException: 
        //unexpected alert open: {Alert text : Enter Something}
        //driver.findElement(By.id("modalButton")).click();
        
        Alert alertQuestion = driver.switchTo().alert();
        alertQuestion.sendKeys("Some Message");
        alertQuestion.accept();
        
        Alert alertMessage = driver.switchTo().alert();
        System.out.println(alertMessage.getText());
        alertMessage.accept();      
    }
}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/NewWindowTest.java

```java
package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class NewWindowTest extends AbstractChromeWebDriverTest {

    @Test
    public void testForWindows() {

        driver.get("http://localhost:8080/pages/notifications.html");

        // 0 - [CDwindow-C62544C6B928D4C97EE4F2E54D9B7FE2]
        System.out.println("0 - " + driver.getWindowHandles());

        driver.findElement(By.id("newPageButton")).click();
        // Window Handle
        // 1 - CDwindow-C62544C6B928D4C97EE4F2E54D9B7FE2
        System.out.println("1 - " + driver.getWindowHandle());

        // 2 - [CDwindow-C62544C6B928D4C97EE4F2E54D9B7FE2,
        // CDwindow-F3E3A57A563CF50F3A063A72C4B23768]
        System.out.println("2 - " + driver.getWindowHandles());

    }

    @Test
    public void findWindowHandleOfSecondWindow() {

        driver.get("http://localhost:8080/pages/notifications.html");

        String firstWindowHandle = driver.getWindowHandle();

        System.out.println(firstWindowHandle);

        driver.findElement(By.id("newPageButton")).click();

        String secondWindowHandle = findSecondWindowHandle(firstWindowHandle);

        System.out.println(secondWindowHandle);
    }

    private String findSecondWindowHandle(String firstWindowHandle) {
        for (String handle : driver.getWindowHandles()) {
            if (!firstWindowHandle.equals(handle)) {
                return handle;
            }
        }
        return null;
    }

    @Test
    public void switchToSecondWindow() {

        driver.get("http://localhost:8080/pages/notifications.html");

        String firstWindowHandle = driver.getWindowHandle();

        System.out.println(firstWindowHandle);

        driver.findElement(By.id("newPageButton")).click();

        String secondWindowHandle = findSecondWindowHandle(firstWindowHandle);

        System.out.println(secondWindowHandle);

        System.out.println(driver.findElement(By.tagName("h1")).getText());// Notifications

        driver.switchTo().window(secondWindowHandle);

        System.out.println(driver.findElement(By.tagName("h1")).getText());// Forms

        driver.switchTo().window(firstWindowHandle);

        System.out.println(driver.findElement(By.tagName("h1")).getText());// Notifications

        System.out.println(driver.getCurrentUrl());// http://localhost:8080/pages/notifications.html

        driver.close();

        // org.openqa.selenium.NoSuchWindowException: no such window: target window
        // already closed
        // System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(secondWindowHandle);

        System.out.println(driver.getCurrentUrl());// http://localhost:8080/pages/forms.html
    }
}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/PlayingWithModalWindowAndWaitsTest.java

```java
package com.in28minutes.webdriver.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayingWithModalWindowAndWaitsTest extends AbstractChromeWebDriverTest {

    @Test(expectedExceptions = ElementNotVisibleException.class)
    public void playingWithModalWindows_expectingAException() {
        driver.get("http://localhost:8080/pages/notifications.html");
        // Button id - modalButton
        // Modal Wdw id - myModal, myModalLabel, myModalBody, myModalCloseButton
        driver.findElement(By.id("modalButton")).click();

        // org.openqa.selenium.ElementNotVisibleException: element not visible
        driver.findElement(By.id("myModalCloseButton")).click();

    }

    @Test
    public void playingWithModalWindows_FixingWithSleep() {

        driver.get("http://localhost:8080/pages/notifications.html");

        // Button id - modalButton
        // Modal Wdw id - myModal, myModalLabel, myModalBody, myModalCloseButton
        driver.findElement(By.id("modalButton")).click();

        sleep(1);

        System.out.println(driver.findElement(By.id("myModalLabel")).getText());// Modal title

        driver.findElement(By.id("myModalCloseButton")).click();

        // sleep(10);
    }

    @Test
    @Ignore("implicit wait fails on Chrome")
    // https://github.com/SeleniumHQ/selenium-google-code-issue-archive/issues/711
    public void playingWithModalWindows_implicitWait() {

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.get("http://localhost:8080/pages/notifications.html");

        // Button id - modalButton
        // Modal Wdw id - myModal, myModalLabel, myModalBody, myModalCloseButton
        driver.findElement(By.id("modalButton")).click();

        // sleep(1);

        System.out.println(driver.findElement(By.id("myModalLabel")).getText());// Modal title

        driver.findElement(By.id("myModalCloseButton")).click();

        // sleep(10);
    }

    @Test
    public void playingWithModalWindows_ExplicitWait() {

        driver.get("http://localhost:8080/pages/notifications.html");

        // Button id - modalButton
        // Modal Wdw id - myModal, myModalLabel, myModalBody, myModalCloseButton
        driver.findElement(By.id("modalButton")).click();

        // sleep(10);
        // Max - 10
        // Wait for myModalLabel to load

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        
        webDriverWait.withMessage("Waited for 10 Seconds but still myModalLabel not available");
        
        WebElement modalLabel = 
                webDriverWait.until(
                        ExpectedConditions.visibilityOf(
                                driver.findElement(By.id("myModalLabel"))
                                )
                        );// By.id("myModalLabel")


        System.out.println(modalLabel.getText());// Modal title

        driver.findElement(By.id("myModalCloseButton")).click();

        // sleep(10);
    }
}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/PlayingWithScreenWindowTest.java

```java
package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class PlayingWithScreenWindowTest extends AbstractChromeWebDriverTest {
    
    @Test
    public void playingWithWindows() {
        driver.get("http://localhost:8080/pages/forms.html");
        
        System.out.println(driver.manage().window().getPosition());//(22, 22)
        System.out.println(driver.manage().window().getSize());//(1200, 752)
        sleep(3);
        //failed to change window state to normal, current state is maximized
        driver.manage().window().setPosition(new Point(200,200));
        sleep(3);
        driver.manage().window().setSize(new Dimension(200,200));
        sleep(3);
        driver.manage().window().maximize();
        sleep(3);
        driver.manage().window().fullscreen();
        sleep(3);

    }
    
    @Test
    public void backForwardAndNavigation() {
        driver.get("http://localhost:8080/pages/forms.html");
        sleep(3);
        driver.get("http://localhost:8080/pages/tables.html");
        sleep(3);
        driver.get("http://localhost:8080/pages/login.html");
        sleep(3);
        driver.get("http://localhost:8080/pages/index.html");
        sleep(3);
        driver.navigate().back();
        sleep(3);
        driver.navigate().back();
        sleep(3);
        driver.navigate().back();
        sleep(3);
        driver.navigate().forward();
        sleep(3);
        driver.navigate().refresh();
        sleep(3);
        driver.navigate().back();
        sleep(3);
    }   
}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/ReadTablesTest.java

```java
package com.in28minutes.webdriver.scenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;
import com.in28minutes.webdriver.scenarios.framework.TableReader;

public class ReadTablesTest extends AbstractChromeWebDriverTest {

    @Test
    public void testReadingOfTables() throws IOException {
        
        driver.get("http://localhost:8080/pages/tables.html");
        
        TableReader reader = new TableReader(driver, "dataTables-example");
        System.out.println(reader.getData(1,2));
        System.out.println(reader.getData(2,2));
        System.out.println(reader.getData(5,4));
        System.out.println(reader.getData(6,3));

        TableReader reader2 = new TableReader(driver, "dataTables-example-2");
        System.out.println(reader2.getData(1, 2));
        
        //1,2
        //2,3
        //WebElement tbody = driver.findElement(By.cssSelector("#dataTables-example > tbody"));
        
        //String t12 = tbody.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).getText();
        
        //String t22 = tbody.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)")).getText();
        
        //System.out.println(t12);
        //System.out.println(t22);
        
        //#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)
        //#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)
        //#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(3)
        
    }
}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/RunJavaScriptTest.java

```java
package com.in28minutes.webdriver.scenarios;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class RunJavaScriptTest extends AbstractChromeWebDriverTest {

    @Test
    public void testRunningOfJavaScript() throws IOException {
        
        driver.get("http://localhost:8080/pages/tables.html");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        String title = (String)js.executeScript("return document.title;");
        
        sleep(3);
        
        js.executeScript("window.scrollBy(0,200)");
        
        sleep(3);
        
        js.executeScript("window.scrollBy(0,200)");
        
        sleep(3);
        
        js.executeScript("window.scrollBy(0,200)");

        sleep(3);
        System.out.println(title);
        
    }
}
```
---

### /web-driver-2-more-scenarios/src/test/java/com/in28minutes/webdriver/scenarios/TakesScreenshotTest.java

```java
package com.in28minutes.webdriver.scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class TakesScreenshotTest extends AbstractChromeWebDriverTest {

    @Test
    public void testFrames() throws IOException {
        
        driver.get("http://localhost:8080/pages/frames-example.html");
        
        //Operations
        
        File screenshot = ((TakesScreenshot)driver)
                .getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot,
                new File("./target/" + driver + "-screenshot.png"));
    }
}
```
---

### /web-driver-3-cross-browser-framework/src/test/java/com/in28minutes/selenium/crossbrowser/CrossBrowserBasicsTest.java

```java
package com.in28minutes.selenium.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserBasicsTest {
    @Test
    public void chromeBrowser() {
        // Chrome

        // Chrome Web Driver EXE
        WebDriverManager.chromedriver().setup();

        // WebDriver Interface - Create an instance of the web driver of the browser
        WebDriver driver = new ChromeDriver();

        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

        sleep(5);

        driver.quit();
    }
    
    @Test
    public void firefoxBrowser() {
        // Firefox

        // Firefox Web Driver EXE
        WebDriverManager.firefoxdriver().setup();

        // WebDriver Interface - Create an instance of the web driver of the browser
        WebDriver driver = new FirefoxDriver();

        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

        sleep(5);

        driver.quit();
    }

    @Test
    public void safariBrowser() {
        // Safari
        // Make sure you set Develop | Allow Remote Automation option from Safari's main
        // menu
        
        // Could not create a session: You must enable the 'Allow Remote Automation'
        // option in Safari's Develop menu to control Safari via WebDriver.

        // Safari Web Driver EXE
        //WebDriverManager.safaridriver().setup();

        // WebDriver Interface - Create an instance of the web driver of the browser
        WebDriver driver = new SafariDriver();

        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

        sleep(5);

        driver.quit();
    }
    
    @Test
    @Ignore
    public void ieBrowser() {
        
        WebDriverManager.iedriver().setup();

        // WebDriver Interface - Create an instance of the web driver of the browser
        WebDriver driver = new InternetExplorerDriver();

        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

        sleep(5);

        driver.quit();
    }


    @Test
    @Ignore
    public void edgeBrowser() {
        
        WebDriverManager.edgedriver().setup();

        // WebDriver Interface - Create an instance of the web driver of the browser
        WebDriver driver = new EdgeDriver();

        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

        sleep(5);

        driver.quit();
    }

    private void sleep(int i) {
        
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
```
---

### /web-driver-3-cross-browser-framework/src/test/java/com/in28minutes/selenium/crossbrowser/framework/CrossBrowserFrameworkTest.java

```java
package com.in28minutes.selenium.crossbrowser.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserFrameworkTest {
    
    WebDriver driver = null;
    
    @Parameters("browser")
    @BeforeTest
    public void before(@Optional("chrome") String browser) {
        if(browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Does not support browser + " + browser);
        }       
    }
        
    @Test
    public void launchTablesPage() {
        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

    }
    
    @Test
    public void launchIndexPage() {
        // Launch a web page
        driver.get("http://localhost:8080/pages/index.html");

    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
```
---

### /web-driver-3-cross-browser-framework/src/test/java/com/in28minutes/selenium/crossbrowser/HeadlessBrowserBasicsTest.java

```java
package com.in28minutes.selenium.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserBasicsTest {

    @Test
    public void chromeBrowser() {
        // Chrome

        // Chrome Web Driver EXE
        WebDriverManager.chromedriver().setup();

        // WebDriver Interface - Create an instance of the web driver of the browser
        WebDriver driver = new ChromeDriver();

        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

        sleep(5);

        driver.quit();
    }

    @Test
    public void chromeBrowserHeadlessBrowsing() {
        // Chrome

        // Chrome Web Driver EXE
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        
        // WebDriver Interface - Create an instance of the web driver of the browser
        WebDriver driver = new ChromeDriver(options);

        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

        sleep(5);

        driver.quit();
    }

    @Test
    public void firefoxBrowser() {
        // Firefox

        // Firefox Web Driver EXE
        WebDriverManager.firefoxdriver().setup();

        // WebDriver Interface - Create an instance of the web driver of the browser
        WebDriver driver = new FirefoxDriver();

        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

        sleep(5);

        driver.quit();
    }
    

    @Test
    public void firefoxBrowserHeadlessBrowsing() {
        // Firefox

        // Firefox Web Driver EXE
        WebDriverManager.firefoxdriver().setup();
        
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);

        // WebDriver Interface - Create an instance of the web driver of the browser
        WebDriver driver = new FirefoxDriver(options);

        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

        sleep(5);

        driver.quit();
    }

    @Test
    public void phanthomJS() {
        WebDriverManager.phantomjs().setup();

        WebDriver driver = new PhantomJSDriver();

        // Launch a web page
        driver.get("http://localhost:8080/pages/tables.html");

        sleep(5);

        driver.quit();
    }
    


    private void sleep(int i) {
        
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
```
---

### /web-driver-4-data-driven-tests/src/test/java/com/in28minutes/datadriventests/ExcelReadUtil.java

```java
package com.in28minutes.datadriventests;
import java.io.File;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadUtil {
  public static String[][] readExcelInto2DArray(String excelFilePath, 
          String sheetName, int totalCols) {

    File file = new File(excelFilePath);

    String[][] tabArray = null;

    try {
      OPCPackage opcPackage = OPCPackage.open(file.getAbsolutePath());

      Workbook wb = WorkbookFactory.create(opcPackage);

      Sheet sheet = wb.getSheet(sheetName);

      int totalRows = sheet.getLastRowNum() + 1;

      tabArray = new String[totalRows][totalCols];

      for (int i = 0; i < totalRows; i++) {
        for (int j = 0; j < totalCols; j++) {
          
            Cell cell = sheet.getRow(i).getCell(j);
          //System.out.println(cell + " " + i + " " + j);

          if (cell == null)
            continue;

          switch (cell.getCellType()) {
          case Cell.CELL_TYPE_BOOLEAN:
            tabArray[i][j] = String.valueOf(cell.getBooleanCellValue());
            break;
          case Cell.CELL_TYPE_NUMERIC:
            tabArray[i][j] = String.valueOf(cell.getNumericCellValue());
            break;
          case Cell.CELL_TYPE_STRING:
            tabArray[i][j] = cell.getStringCellValue();
            break;
          default:
            tabArray[i][j] = "";
            break;
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }

    return tabArray;
  }

}
```
---

### /web-driver-4-data-driven-tests/src/test/java/com/in28minutes/datadriventests/LoginDataProviderCompleteCsvTest.java

```java
package com.in28minutes.datadriventests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProviderCompleteCsvTest {
    
    //Data Provider public java.util.List com.in28minutes.datadriventests.
    //LoginDataProviderCompleteCsvTest.userIdsAndPasswordsCSVDataProvider() 
    //must return either Object[][] or Object[] or Iterator<Object[]> 
    //or Iterator<Object>, not interface java.util.List

    // Create the Data Provider and give the data provider a name
    @DataProvider(name = "user-ids-passwords-csv-data-provider")
    public Iterator<String[]> userIdsAndPasswordsCSVDataProvider() {
        return readFromCSVFile("./src/test/resources/login-data.csv").iterator();
    }

    // Use the data provider
    @Test(dataProvider = "user-ids-passwords-csv-data-provider")
    public void testLoginForAllScenarios(String userId, String password, String isLoginExpectedToBeSuccessfulString) {
        
        boolean isLoginExpectedToBeSuccessful = Boolean.valueOf(isLoginExpectedToBeSuccessfulString);
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.findElement(By.id("name")).sendKeys(userId);
        // driver.findElement(By.id("name")).sendKeys("in28minutes");
        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys(password);
        passwordElement.submit();
        // driver.findElement(By.id("submit")).click();

        if (isLoginExpectedToBeSuccessful) {
            String welcomeMessageText = driver.findElement(By.id("welcome-message")).getText();
            assertTrue(welcomeMessageText.contains("Welcome " + userId));
        } else {
            String errorMessageText = driver.findElement(By.id("error-message")).getText();
            assertEquals(errorMessageText, "Invalid Credentials");
        }

        driver.quit();
    }

    @Test
    public void testReadingDataFromCSV() throws IOException {
        List<String[]> data = readFromCSVFile("./src/test/resources/login-data.csv");
        for (String[] row : data) {
            System.out.println(Arrays.toString(row));
        }

    }

    private List<String[]> readFromCSVFile(String csvFilePath) {
        try {
            CSVReader reader = new CSVReader(new FileReader(csvFilePath));
            List<String[]> data = reader.readAll();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
```
---

### /web-driver-4-data-driven-tests/src/test/java/com/in28minutes/datadriventests/LoginDataProviderCompleteExcelTest.java

```java
package com.in28minutes.datadriventests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProviderCompleteExcelTest {
        
    //Create the Data Provider and give the data provider a name
    @DataProvider(name="user-ids-passwords-excel-data-provider")
    public String[][] userIdsAndPasswordsDataProvider() {
        return ExcelReadUtil.readExcelInto2DArray(
                "./src/test/resources/login-data.xlsx", "Sheet1", 3);
    }   
    
    //Use the data provider
    @Test(dataProvider="user-ids-passwords-excel-data-provider")
    public void testLoginForAllScenarios(String userId, 
            String password, String isLoginExpectedToBeSuccessfulString) {
        
        boolean isLoginExpectedToBeSuccessful = 
                Boolean.valueOf(isLoginExpectedToBeSuccessfulString);
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.findElement(By.id("name")).sendKeys(userId);
        //driver.findElement(By.id("name")).sendKeys("in28minutes");
        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys(password);
        passwordElement.submit();
        // driver.findElement(By.id("submit")).click();

        if(isLoginExpectedToBeSuccessful) {
            String welcomeMessageText = driver.findElement(By.id("welcome-message")).getText();
            assertTrue(welcomeMessageText.contains("Welcome " + userId));
        } else {
            String errorMessageText = driver.findElement(By.id("error-message")).getText();
            assertEquals(errorMessageText,"Invalid Credentials");           
        }
        
        driver.quit();
    }
    
    @Test
    public void readFromExcel() {
        //[[in28minutes, dummy, true], [adam, adam, false], 
        //[adam, adam@123, true], [eve, eve, false]]
        String[][] data = ExcelReadUtil.readExcelInto2DArray(
                "./src/test/resources/login-data.xlsx", "Sheet1", 3);
        System.out.println(Arrays.deepToString(data));
        
    }
}
```
---

### /web-driver-4-data-driven-tests/src/test/java/com/in28minutes/datadriventests/LoginDataProviderCompleteTest.java

```java
package com.in28minutes.datadriventests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProviderCompleteTest {
        
    //Create the Data Provider and give the data provider a name
    @DataProvider(name="user-ids-passwords-data-provider")
    public Object[][] userIdsAndPasswordsDataProvider() {
        return new Object[][]{
                {"in28minutes","dummy", true},
                {"adam","adam", false},
                {"adam","adam@123", true},
                {"eve","eve",false},
                {"eve","eve@123", true},
            };
    }   
    
    //Use the data provider
    @Test(dataProvider="user-ids-passwords-data-provider")
    public void testLoginForAllScenarios(String userId, 
            String password, boolean isLoginExpectedToBeSuccessful) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.findElement(By.id("name")).sendKeys(userId);
        //driver.findElement(By.id("name")).sendKeys("in28minutes");
        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys(password);
        passwordElement.submit();
        // driver.findElement(By.id("submit")).click();

        if(isLoginExpectedToBeSuccessful) {
            String welcomeMessageText = driver.findElement(By.id("welcome-message")).getText();
            assertTrue(welcomeMessageText.contains("Welcome " + userId));
        } else {
            String errorMessageText = driver.findElement(By.id("error-message")).getText();
            assertEquals(errorMessageText,"Invalid Credentials");           
        }
        
        driver.quit();
    }
}
```
---

### /web-driver-4-data-driven-tests/src/test/java/com/in28minutes/datadriventests/SuccessfulLoginBasicTest.java

```java
package com.in28minutes.datadriventests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuccessfulLoginBasicTest {

    @Test
    public void testLoginWithIn28Minutes() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.findElement(By.id("name")).sendKeys("in28minutes");
        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("dummy");
        passwordElement.submit();
        // driver.findElement(By.id("submit")).click();

        // welcome-message
        System.out.println(driver.findElement(By.id("welcome-message")).getText());
        driver.quit();
    }
}
```
---

### /web-driver-4-data-driven-tests/src/test/java/com/in28minutes/datadriventests/UnSuccessfulLoginBasicTest.java

```java
package com.in28minutes.datadriventests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnSuccessfulLoginBasicTest {

    @Test
    public void testUnsuccessfulLoginWithIn28Minutes() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.findElement(By.id("name")).sendKeys("in28minutes");
        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("");
        passwordElement.submit();
        // driver.findElement(By.id("submit")).click();

        // welcome-message
        String errorMessageText = driver.findElement(By.id("error-message")).getText();
        System.out.println(errorMessageText);
        assertEquals(errorMessageText,"Invalid Credentials");
        driver.quit();
    }
}
```
---

### /web-driver-4-data-driven-tests/src/test/java/com/in28minutes/datadriventests/UnSuccessfulLoginDataDrivenBasicTest.java

```java
package com.in28minutes.datadriventests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnSuccessfulLoginDataDrivenBasicTest {
        
    //Create the Data Provider and give the data provider a name
    @DataProvider(name="user-ids-data-provider")
    public String[] userIdsDataProvider() {
        return new String[]{"in28minutes","adam","eve"};
    }   
    
    //Use the data provider
    @Test(dataProvider="user-ids-data-provider")
    public void testUnsuccessfulLoginWithIn28Minutes(String userId) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.findElement(By.id("name")).sendKeys(userId);
        //driver.findElement(By.id("name")).sendKeys("in28minutes");
        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("");
        passwordElement.submit();
        // driver.findElement(By.id("submit")).click();

        // welcome-message
        String errorMessageText = driver.findElement(By.id("error-message")).getText();
        System.out.println(errorMessageText);
        assertEquals(errorMessageText,"Invalid Credentials");
        driver.quit();
    }
}
```
---

### /web-driver-4-data-driven-tests/src/test/java/com/in28minutes/datadriventests/UnSuccessfulLoginDataDrivenLevel1Test.java

```java
package com.in28minutes.datadriventests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnSuccessfulLoginDataDrivenLevel1Test {
        
    //Create the Data Provider and give the data provider a name
    @DataProvider(name="user-ids-passwords-data-provider")
    public String[][] userIdsAndPasswordsDataProvider() {
        return new String[][]{
                {"in28minutes","in28minutes"},
                {"adam","adam"},
                {"eve","eve"},
            };
    }   
    
    //Use the data provider
    @Test(dataProvider="user-ids-passwords-data-provider")
    public void testUnsuccessfulLoginWithIn28Minutes(String userId, String password) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.findElement(By.id("name")).sendKeys(userId);
        //driver.findElement(By.id("name")).sendKeys("in28minutes");
        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys(password);
        passwordElement.submit();
        // driver.findElement(By.id("submit")).click();

        // welcome-message
        String errorMessageText = driver.findElement(By.id("error-message")).getText();
        System.out.println(errorMessageText);
        assertEquals(errorMessageText,"Invalid Credentials");
        driver.quit();
    }
}
```
---

### /web-driver-4-data-driven-tests/src/test/resources/login-data.csv

```
in28minutes,dummy,true
adam,adam,false
adam,adam@123,true
eve,eve,false
eve,eve@123,true
in28minutes,eve@123,false
```
---

### /web-driver-5-page-object-model/src/test/java/com/in28minutes/pageobjects/updatetodo/ListTodoPage.java

```java
package com.in28minutes.pageobjects.updatetodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListTodoPage {
    
    private WebDriver driver;
    
    public ListTodoPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    //get description for id
    //desc- + id
    public String getDescription(String id) {
        return driver.findElement(By.id("desc-" + id)).getText();
    }
    
    //get target date for id
    public String getTargetDate(String id) {
        return driver.findElement(By.id("targetdate-" + id)).getText();
    }
    
    //click update for a id
    public void clickUpdateFor(String id) {
        driver.findElement(By.id("update-" + id)).click();
    }
    
    //delete a id

}
```
---

### /web-driver-5-page-object-model/src/test/java/com/in28minutes/pageobjects/updatetodo/LoginPage.java

```java
package com.in28minutes.pageobjects.updatetodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    
    private WebDriver driver;
    
    public LoginPage(WebDriver driver) {
        super();
        driver.get("http://localhost:8080/login");
        this.driver = driver;
    }

    //Name Text Box
    @FindBy(id="name")
    WebElement name;
    
    //Password Text Box
    @FindBy(id="password")
    WebElement password;
    
    //Submit Button
    @FindBy(id="submit")
    WebElement submitButton;
    
    //enterName
    public void enterName(String nameToEnter) {
        name.sendKeys(nameToEnter);
    }

    //enterPassword
    public void enterPassword(String passwordToEnter) {
        password.sendKeys(passwordToEnter);
    }

    //submit
    public void submit() {
        submitButton.submit();
    }
    
    public void login(String name, String password) {
        enterName(name);
        enterPassword(password);
        submit();
    }
}
```
---

### /web-driver-5-page-object-model/src/test/java/com/in28minutes/pageobjects/updatetodo/TodoPage.java

```java
package com.in28minutes.pageobjects.updatetodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodoPage {

    private WebDriver driver;
    
    public TodoPage(WebDriver driver) {
        super();
        this.driver = driver;
    }
    
    @FindBy(id="desc")
    private WebElement description;
    
    @FindBy(id="targetDate")
    private WebElement targetDate;
    
    @FindBy(id="save")
    private WebElement saveButton;
    
    public void enterDescription(String desc) {
        description.clear();
        description.sendKeys(desc);
    }
    
    public void enterTargetDate(String date) {
        targetDate.clear();
        targetDate.sendKeys(date);
    }
    
    public void submit() {
        saveButton.submit();
    }
    
    public void enterDetailsAndSubmit(String desc,String targetDate) {
        enterDescription(desc);
        enterTargetDate(targetDate);
        submit();
    }
}
```
---

### /web-driver-5-page-object-model/src/test/java/com/in28minutes/pageobjects/updatetodo/UpdateTodoBasicTest.java

```java
package com.in28minutes.pageobjects.updatetodo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateTodoBasicTest {
    
    WebDriver driver;
    
    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void loginPageObject() {
        
        driver.get("http://localhost:8080/login");
        
        LoginPage page = PageFactory.initElements(driver, LoginPage.class);
        
        //driver.findElement(By.id("name")).getAttribute("type")
        System.out.println(page.name.getAttribute("type"));//text
        
        //driver.findElement(By.id("password")).getAttribute("type")
        System.out.println(page.password.getAttribute("type"));//password
        
    }
    
    @Test
    public void updateTodo() {      
        
        LoginPage page = PageFactory.initElements(driver, LoginPage.class);
        page.login("in28minutes", "dummy");
                    
        driver.findElement(By.linkText("Click here")).click();
        
        ListTodoPage listTodoPage = new ListTodoPage(driver);
        listTodoPage.clickUpdateFor("10002");
        
        TodoPage todoPage = PageFactory.initElements(driver, TodoPage.class);
        todoPage.enterDescription("Become a Tech Guru - 2");
        todoPage.enterTargetDate("12/09/2019");
        todoPage.submit();
        
        assertEquals(listTodoPage.getDescription("10002"), 
                            "Become a Tech Guru - 2");
        assertEquals(listTodoPage.getTargetDate("10002"), "12/09/2019");
        
    }
    
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
```
---

### /web-driver-5-page-object-model/src/test/java/com/in28minutes/pageobjects/updatetodo/UpdateTodoBasicTest1BeforePageObjects.java

```java
package com.in28minutes.pageobjects.updatetodo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateTodoBasicTest1BeforePageObjects {
    
    WebDriver driver;
    
    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void updateTodo() {
        
        driver.get("http://localhost:8080/login");
        
        //      LoginPage page = PageFactory.initElements(driver, LoginPage.class);

        driver.findElement(By.id("name")).sendKeys("in28minutes");
        driver.findElement(By.id("password")).sendKeys("dummy");
        driver.findElement(By.id("submit")).submit();
        
        //Click here - Link Text - click
        driver.findElement(By.linkText("Click here")).click();
        
        //id update-10002 click
        driver.findElement(By.id("update-10002")).click();
        
        //id desc
        WebElement desc = driver.findElement(By.id("desc"));
        desc.clear();
        desc.sendKeys("Become a Tech Guru - 2");
        
        //id targetDate
        WebElement targetDate = driver.findElement(By.id("targetDate"));
        targetDate.clear();
        targetDate.sendKeys("12/09/2019");
        
        //save submit
        driver.findElement(By.id("save")).submit();
        
        //check desc-10002
        String updatedDesc = driver.findElement(By.id("desc-10002")).getText();
        //check targetdate-10002
        String updatedTargetDate = driver.findElement(By.id("targetdate-10002")).getText();
        
        //Become a Tech Guru - 2
        //12/09/2019

        assertEquals(updatedDesc, "Become a Tech Guru - 2");
        assertEquals(updatedTargetDate, "12/09/2019");
        
    }
    
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
```
---

### /web-driver-5-page-object-model/src/test/java/com/in28minutes/pageobjects/updatetodo/UpdateTodoBasicTest2AfterLoginPage.java

```java
package com.in28minutes.pageobjects.updatetodo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateTodoBasicTest2AfterLoginPage {
    
    WebDriver driver;
    
    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void loginPageObject() {
        
        driver.get("http://localhost:8080/login");
        
        LoginPage page = PageFactory.initElements(driver, LoginPage.class);
        
        //driver.findElement(By.id("name")).getAttribute("type")
        System.out.println(page.name.getAttribute("type"));//text
        
        //driver.findElement(By.id("password")).getAttribute("type")
        System.out.println(page.password.getAttribute("type"));//password
        
    }
    
    @Test
    public void updateTodo() {
        
        driver.get("http://localhost:8080/login");
        
        LoginPage page = PageFactory.initElements(driver, LoginPage.class);
        page.login("in28minutes", "dummy");
            
        //page.enterName("in28minutes");
        //page.enterPassword("dummy");
        //page.submit();
        
        //page.name.sendKeys("in28minutes");
        //page.password.sendKeys("dummy");
        //page.submitButton.submit();
        
        //Click here - Link Text - click
        driver.findElement(By.linkText("Click here")).click();
        
        //id update-10002 click
        driver.findElement(By.id("update-10002")).click();
        
        //id desc
        WebElement desc = driver.findElement(By.id("desc"));
        desc.clear();
        desc.sendKeys("Become a Tech Guru - 2");
        
        //id targetDate
        WebElement targetDate = driver.findElement(By.id("targetDate"));
        targetDate.clear();
        targetDate.sendKeys("12/09/2019");
        
        //save submit
        driver.findElement(By.id("save")).submit();
        
        //check desc-10002
        String updatedDesc = driver.findElement(By.id("desc-10002")).getText();
        //check targetdate-10002
        String updatedTargetDate = driver.findElement(By.id("targetdate-10002")).getText();
        
        //Become a Tech Guru - 2
        //12/09/2019

        assertEquals(updatedDesc, "Become a Tech Guru - 2");
        assertEquals(updatedTargetDate, "12/09/2019");
        
    }
    
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
```
---

### /web-driver-5-page-object-model/src/test/java/com/in28minutes/pageobjects/updatetodo/UpdateTodoBasicTest3AfterListTodoPage.java

```java
package com.in28minutes.pageobjects.updatetodo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateTodoBasicTest3AfterListTodoPage {
    
    WebDriver driver;
    
    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void loginPageObject() {
        
        driver.get("http://localhost:8080/login");
        
        LoginPage page = PageFactory.initElements(driver, LoginPage.class);
        
        //driver.findElement(By.id("name")).getAttribute("type")
        System.out.println(page.name.getAttribute("type"));//text
        
        //driver.findElement(By.id("password")).getAttribute("type")
        System.out.println(page.password.getAttribute("type"));//password
        
    }
    
    @Test
    public void updateTodo() {
        
        driver.get("http://localhost:8080/login");
        
        LoginPage page = PageFactory.initElements(driver, LoginPage.class);
        page.login("in28minutes", "dummy");
                    
        //Click here - Link Text - click
        driver.findElement(By.linkText("Click here")).click();
        
        //id update-10002 click
        driver.findElement(By.id("update-10002")).click();
        
        TodoPage todoPage = PageFactory.initElements(driver, TodoPage.class);
        todoPage.enterDescription("Become a Tech Guru - 2");
        todoPage.enterTargetDate("12/09/2019");     
        todoPage.submit();
        
        //check desc-10002
        String updatedDesc = driver.findElement(By.id("desc-10002")).getText();
        //check targetdate-10002
        String updatedTargetDate = driver.findElement(By.id("targetdate-10002")).getText();
        
        //Become a Tech Guru - 2
        //12/09/2019

        assertEquals(updatedDesc, "Become a Tech Guru - 2");
        assertEquals(updatedTargetDate, "12/09/2019");
        
    }
    
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
```
---

### /web-driver-5-page-object-model/src/test/java/com/in28minutes/pageobjects/updatetodo/UpdateTodoBasicTest5AfterExercises.java

```java
package com.in28minutes.pageobjects.updatetodo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateTodoBasicTest5AfterExercises {

    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void loginPageObject() {

        driver.get("http://localhost:8080/login");

        LoginPage page = PageFactory.initElements(driver, LoginPage.class);

        // driver.findElement(By.id("name")).getAttribute("type")
        System.out.println(page.name.getAttribute("type"));// text

        // driver.findElement(By.id("password")).getAttribute("type")
        System.out.println(page.password.getAttribute("type"));// password

    }

    @Test
    public void updateTodo() {
        LoginPage page = PageFactory.initElements(driver, LoginPage.class);
        page.login("in28minutes", "dummy");

        new WelcomePage(driver).clickTodosLink();

        ListTodoPage listTodoPage = new ListTodoPage(driver);
        listTodoPage.clickUpdateFor("10002");

        TodoPage todoPage = PageFactory.initElements(driver, TodoPage.class);
        todoPage.enterDetailsAndSubmit("Become a Tech Guru - 2", "12/09/2019");

        assertEquals(listTodoPage.getDescription("10002"), "Become a Tech Guru - 2");
        assertEquals(listTodoPage.getTargetDate("10002"), "12/09/2019");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
```
---

### /web-driver-5-page-object-model/src/test/java/com/in28minutes/pageobjects/updatetodo/WelcomePage.java

```java
package com.in28minutes.pageobjects.updatetodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    
    private WebDriver driver;
    
    public WelcomePage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void clickTodosLink() {
        driver.findElement(By.linkText("Click here")).click();
    }
}
```
---

### /web-driver-6-stand-alone-and-grid/src/test/java/com/in28minutes/SeleniumHubTest.java

```java
package com.in28minutes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumHubTest {
    //selenium-standalone start -- -role hub

    //Nodes should register to http://192.168.8.69:4444/grid/register/
    
    //Clients should connect to http://192.168.8.69:4444/wd/hub
    
    //selenium-standalone start -- -role node -hub http://192.168.8.69:4444/grid/register/ 
    
    //selenium-standalone start -- -role node -port 5556 -hub http://192.168.8.69:4444/grid/register/ 

    @Test(threadPoolSize=2, invocationCount=4)
    public void hub_chrome() throws MalformedURLException, InterruptedException {
        
        DesiredCapabilities capabilites = new DesiredCapabilities();
        
        //chrome, firefox, htmlunit, internet explorer, iphone, opera
        capabilites.setBrowserName("chrome");
        //capabilites.setPlatform(Platform.EL_CAPITAN);
        
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver remoteDriver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"), capabilites);
        
        //RemoteWebDriver
        //  Location of Standaloneserver
        //  Which Browser? Which OS? => Capabilities
        
        remoteDriver.get("http://localhost:8080/pages/index.html");
        System.out.println(remoteDriver.getCurrentUrl());
        System.out.println(remoteDriver.getTitle());
        Thread.sleep(10000);
        remoteDriver.quit();
    }

    @Test(threadPoolSize=2, invocationCount=4)
    public void hub_firefox() throws MalformedURLException, InterruptedException {
        
        DesiredCapabilities capabilites = new DesiredCapabilities();
        
        //chrome, firefox, htmlunit, internet explorer, iphone, opera
        capabilites.setBrowserName("firefox");
        
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver remoteDriver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"), capabilites);
        
        //RemoteWebDriver
        //  Location of Standaloneserver
        //  Which Browser? Which OS? => Capabilities
        
        remoteDriver.get("http://localhost:8080/pages/index.html");
        System.out.println(remoteDriver.getCurrentUrl());
        System.out.println(remoteDriver.getTitle());
        Thread.sleep(10000);
        remoteDriver.quit();
    }
    
}
```
---

### /web-driver-6-stand-alone-and-grid/src/test/java/com/in28minutes/SeleniumStandAloneTest.java

```java
package com.in28minutes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumStandAloneTest {
    
    @Test
    public void basic() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/pages/index.html");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();
    }
    
    @Test
    public void standalone() throws MalformedURLException, InterruptedException {
        
        DesiredCapabilities capabilites = new DesiredCapabilities();
        
        //chrome, firefox, htmlunit, internet explorer, iphone, opera
        capabilites.setBrowserName("chrome");
        
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver remoteDriver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"), capabilites);
        
        //RemoteWebDriver
        //  Location of Standaloneserver
        //  Which Browser? Which OS? => Capabilities
        
        remoteDriver.get("http://localhost:8080/pages/index.html");
        System.out.println(remoteDriver.getCurrentUrl());
        System.out.println(remoteDriver.getTitle());
        Thread.sleep(15000);
        remoteDriver.quit();
    }
    
}
```
---
