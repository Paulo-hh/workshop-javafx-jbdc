module Workshop_javafx_jbdc {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	exports gui to javafx.fxml;  
	opens gui to javafx.fxml;
	opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
    opens model.services to javafx.graphics, javafx.fxml;
    requires java.sql;
}
