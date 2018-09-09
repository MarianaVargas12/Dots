package sample;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.beans.EventHandler;

public class Controller {
    @FXML private AnchorPane InicialPanel;
    @FXML private AnchorPane RegistroPanel;
    @FXML private AnchorPane EsperaPanel;
    @FXML private AnchorPane ContricantePanel;

    @FXML private JFXTextField IpField;
    @FXML private JFXTextField NombreField;

    public void onExitButtonClicked(MouseEvent event){
        Platform.exit();
        System.exit(0);
    }
    public void onOkButtonClicked(MouseEvent event){
        RegistroPanel.setVisible(true);
        InicialPanel.setVisible(false);
        EsperaPanel.setVisible(false);
        ContricantePanel.setVisible(false);

    }
    public void onReadyButtonClicked(MouseEvent event){
        RegistroPanel.setVisible(false);
        InicialPanel.setVisible(false);
        EsperaPanel.setVisible(true);
        ContricantePanel.setVisible(false);

    }
    public void onPlayButtonClicked(MouseEvent event){
        RegistroPanel.setVisible(true);
        InicialPanel.setVisible(false);
        EsperaPanel.setVisible(false);
        ContricantePanel.setVisible(false);

    }
    private boolean willConsume= false;

    public void handle(KeyEvent event){
        Object temp0 = event.getSource();
        if(willConsume){
            event.consume();
        }
        String temp= event.getCode().toString();
        if (!event.getCode().toString().matches("[a-zA-Z]")&& event.getCode()!= KeyCode.BACK_SPACE && event.getCode() != KeyCode.SHIFT){
            if (event.getEventType()==KeyEvent.KEY_PRESSED){
                willConsume=true;
            }
            else if(event.getEventType()==KeyEvent.KEY_PRESSED){
                willConsume=false;
            }
        }
    }
}