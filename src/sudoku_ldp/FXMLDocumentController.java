/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku_ldp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 *
 * @author Francisco Costa
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btn1;
    @FXML 
    Canvas canvas;
    
    Tabuleiro gameboard;
    
    /*@FXML
    private void handleButtonAction(ActionEvent event) {
        
        
    }*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gameboard = new Tabuleiro();
        
        GraphicsContext context = canvas.getGraphicsContext2D();
        drawOnCanvas(context);
    }    
    
    public void drawOnCanvas(GraphicsContext context) {
        context.clearRect(0, 0, 450, 450);
        for(int row = 0; row<9; row++) {
            for(int col = 0; col<9; col++) {
                int position_y = row * 50 + 2;
                int position_x = col * 50 + 2;
                int width = 46;
                context.setFill(Color.WHITE);
                context.fillRoundRect(position_x, position_y, width, width, 10, 10);
            }
        }
    }
}
