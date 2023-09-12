import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    private String properties(String... names) {
        var sb = new StringBuilder();
        for (var name: names) {
            if (! sb.isEmpty()) sb.append("\n");
            sb.append(name).append(": ").append(System.getProperty(name));
        }
        return sb.toString();
    }

    @Override
    public void start(Stage stage) {
        var l = new Label(properties("java.version", "javafx.version", "javaplugin.version", "javawebstart.version"));
        var scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
