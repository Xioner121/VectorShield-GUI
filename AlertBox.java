/*
Copyright (C) 2019 Vogju

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
/* 
    Created on : Dec 7, 2019, 1:40:09 PM
    Author     : Vogju
*/
package vector.shield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
/**
 *
 * @author Vogju
 */
public class AlertBox {

static boolean answer;

public static boolean display(String title, String warning, String button1, String button2){
   Stage window = new Stage();
   // Sets stage so that it blocks inputs outside of window.
   window.initModality(Modality.APPLICATION_MODAL);
   window.setTitle(title);
   window.setMinWidth(360);
   VBox layout = new VBox(10);
   Label message = new Label();
   message.setText(warning);
   
   Button action = new Button(button1);
         action.setOnAction(e -> {
         answer=true;
         window.close();
         }
        );
   Button close = new Button(button2);
         close.setOnAction(e -> {
         answer=false;
         window.close();
         });
   close.setText(button2);    
   layout.getChildren().addAll(message, action, close);
   layout.setAlignment(Pos.CENTER);
   layout.setPadding(new Insets(10));
   Scene scene = new Scene(layout);
   scene.getStylesheets().add("alertTheme.css");
   window.setScene(scene);
   window.showAndWait();
   return answer;
}

}
