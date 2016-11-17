package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button sendButton;
    public ListView messageList;
    public TextField messageInput;
    public HBox sendBox;

    public HBox connectBox;
    public TextField nameInput;

    public String name;

    ObservableList<String> messages = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        messageList.setItems(messages);
    }

    public void sendMessage(ActionEvent actionEvent) {
        messages.add(name + ": " + messageInput.getText());
        messageInput.clear();
        messageList.scrollTo(messages.size()-1);
    }

    public void connectToServer(ActionEvent actionEvent) {
        name = nameInput.getText();
        messageList.setDisable(false);
        sendBox.setDisable(false);
        connectBox.setDisable(true);
    }
}
