<p align="center">
  <a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html">
    <img src="https://img.shields.io/badge/Java-8-blue.svg" alt="Java 8">
  </a>
  <a href="https://docs.seleniumhq.org/download/">
    <img src="https://img.shields.io/badge/Selenium-3.141.0-blue.svg">
  </a>
  <a href="https://github.com/bonigarcia/webdrivermanager/">
    <img src="https://img.shields.io/badge/WebDriverManager-3.0.0-blue.svg">
  </a>
  <a href="LICENSE.md">
    <img src="https://img.shields.io/github/license/JakeJMattson/FoobarFinder.svg" alt="license">
  </a>
</p>

<p align="justify">
<a href="https://medium.com/@avery_1242/my-experience-with-google-foobar-tips-for-tackling-googles-legendary-coding-challenge-dbc20a054e4e">Google's Foobar challenge</a> is "a kind of recruitment tool for Google. In order to join Foobar, you must be invited by a friend or have it popup when searching certain CS terms on Google." If you're interested in trying Foobar, I have automated the process of finding it. Simply run this tool, wait a few seconds, and you'll be presented with an option to try it. Once onto the site, you can sign into your Google account to link them together. This gives you the option to resume your session by returning to the <a href="https://www.google.com/foobar/">Foobar website</a>. You can also choose not to sign in, but your progress will not be saved.
</p>

<img src="https://user-images.githubusercontent.com/22604455/46056683-6f44f980-c117-11e8-9242-718f18ff7b5e.PNG" width="100%" />

## Prerequisites

### Languages
* [Java](https://go.java/index.html?intcmp=gojava-banner-java-com)

### Libraries
* [Selenium](https://www.seleniumhq.org/)

## Getting Started
<p align="justify">
The version numbers for each additional software used to build this project are listed in the badges at the top of the page. These dependencies are handled by Maven during build. If building manually, other versions may work, but this is not guaranteed.
</p>

### Installing Java
<p align="justify">
Visit the <a href="http://www.oracle.com/technetwork/java/javase/downloads/index.html">Java Downloads</a> 
page and select the version of your choice.
Run the installer and follow the instructions provided.
</p>

### Setting up Selenium
**Note:** Included as Maven dependency. Below are manual instructions.
<br/>
<p align="justify">
To use Selenium, you will need to download the Java language bindings and a WebDriver binary of your choosing.
Both can be found on the <a href="https://www.seleniumhq.org/download/">Selenium Downloads</a> page. This will require several manual code alterations.
</p>

## Building
This project is built with Maven. To build the `pom.xml` file, please follow the import instructions for your IDE.
* [IntelliJ](https://www.tutorialspoint.com/maven/maven_intellij_idea.htm)
* [Eclipse](https://www.tutorialspoint.com/maven/maven_eclispe_ide.htm)
* [NetBeans](https://www.tutorialspoint.com/maven/maven_netbeans.htm)

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgements
Inspired by [Foobar-Hunter-Bot](https://github.com/Klutix/Foobar-Hunter-Bot) written by [Gabriel Wohlford](https://github.com/Klutix)
