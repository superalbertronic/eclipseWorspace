module javafaxmaven {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.sql;
	requires java.persistence;
	requires org.hibernate.orm.core;
	
	opens javafxmaven to javafx.graphics, javafx.fxml;
	opens Ejercicio3 to javafx.graphics, javafx.fxml;
	opens Ejercicio2 to javafx.graphics, javafx.fxml;
	opens hibernate to javafx.graphics, javafx.fxml,org.hibernate.orm.core;
	
	
}
