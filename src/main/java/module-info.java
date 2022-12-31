module com.example.exercise_fungsimath {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise_fungsimath to javafx.fxml;
    exports com.example.exercise_fungsimath;
}