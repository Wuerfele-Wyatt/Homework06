module edu.missouriwestern.wwuerfele.homework06 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.missouriwestern.wwuerfele.homework06 to javafx.fxml;
    exports edu.missouriwestern.wwuerfele.homework06;
}