# ICTAK Website Automation Testing

This repository contains Java code for automating the testing of the ICTAK website. The code is authored by group 6 of KKEM ST July 2022.

## Project Structure

- `.settings/` - Eclipse IDE settings.
- `drivers/` - WebDriver executables.
- `src/` - Source code for the automation tests.
- `test-output/` - Output and logs generated during test runs.
- `.classpath` - Classpath configuration for the project.
- `.gitignore` - Git configuration for ignoring specific files and directories.
- `.project` - Eclipse project configuration.
- `pom.xml` - Maven project configuration file.

## How to Use

1. **Import the Project**

   - Clone the repository to your local machine.
   - Open Eclipse IDE and import the project using the `.project` file.

2. **Configure WebDriver**

   - Ensure the WebDriver executables are present in the `drivers/` directory. These are specific to the browsers you want to test on (e.g., ChromeDriver, GeckoDriver for Firefox, etc.).

3. **Maven Dependencies**

   - The project is managed using Maven. Ensure that you have Maven installed in your environment.
   - Maven will automatically download the required dependencies specified in `pom.xml` file.

4. **Run Tests**

   - Navigate to the `src/` directory and locate the test files.
   - Right-click on the test file and select `Run As` > `TestNG Test`.

5. **View Test Reports**

   - After the test execution, the output and logs can be found in the `test-output/` directory.

## Contributors

- [Anuranj Krishnan](https://github.com/Anuranj-Krishnan/)
- [Kiran Krishna R](https://github.com/kirankrishnaR)
- [Manjupriya P](https://github.com/manjupriyap)
- [Nithin Bastian George](https://github.com/nithinbastian)
- Athira M N
- Jithin Shaji
