# JavaFX Product Dashboard

This project is a simple JavaFX desktop application that demonstrates a product dashboard with basic CRUD (Create, Read, Update, Delete) operations. The application allows users to add, view, and filter products by category. It is designed as a learning tool for JavaFX, FXML, and MVC (Model-View-Controller) patterns.

## Features
- Add new products with name, price, and category
- View products in a table
- Filter products by category
- Simple login screen (if implemented)

## Project Structure
- `src/main/java/com/example/demo1/` - Java source files (controllers, models, main application)
- `src/main/resources/com/example/demo1/` - FXML layout files
- `pom.xml` - Maven build file

## Prerequisites
- **Java 17 or later** (JavaFX 17+ compatible)
- **Maven 3.6+**
- **JavaFX SDK 17+** (if running outside of Maven)
- **Scene Builder** (for editing FXML files, optional but recommended)

## Environment Setup

### Java Version
- Ensure you have Java 17 or later installed. You can check your version with:
  ```sh
  java -version
  ```
- If you need to install Java, download it from [Adoptium](https://adoptium.net/) or [Oracle](https://www.oracle.com/java/technologies/downloads/).

### JavaFX Setup
- If using Maven, JavaFX dependencies are managed in `pom.xml`.
- If running manually, download the JavaFX SDK from [Gluon](https://gluonhq.com/products/javafx/) and add it to your module path.

### Scene Builder
- Download Scene Builder from [Gluon](https://gluonhq.com/products/scene-builder/).
- Open any `.fxml` file (e.g., `dashboard.fxml`) in Scene Builder for visual editing.
- You can integrate Scene Builder with your IDE (IntelliJ IDEA, Eclipse, or NetBeans) for easier FXML editing.

## How to Run

1. **Clone the repository** (if not already):
   ```sh
   git clone https://github.com/RafiurRiyad/JavaFX-Playground.git
   cd JavaFxPlayground
   ```

2. **Build the project with Maven:**
   ```sh
   mvn clean install
   ```

3. **Run the application:**
   ```sh
   mvn javafx:run
   ```
   Or, if you prefer to run the compiled JAR:
   ```sh
   java -jar target/demo1-1.0-SNAPSHOT.jar
   ```

## Notes
- Make sure your IDE is configured to support JavaFX. If running from the command line, ensure JavaFX modules are available.
- The application uses FXML for UI layout and follows the MVC pattern for separation of concerns.
- Scene Builder is optional but makes FXML editing much easier.

## License
This project is for educational purposes.
