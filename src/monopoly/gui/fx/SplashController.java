/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.gui.fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author kylebennett
 */
public class SplashController extends AnchorPane implements Initializable {

    @FXML
    private Button startGameButton;

    @FXML
    private Label label;

    private MonopolyGUIFX application;

    public void setApp(MonopolyGUIFX application) {
        this.application = application;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void startGame(ActionEvent event) {

        label.setText("Starting Game");

    }

}
