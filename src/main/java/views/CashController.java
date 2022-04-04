package views;

import java.awt.event.ActionEvent;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;
import models.storeModel;

public class CashController
{
	
	@FXML
    private Label cashBalanceLabel;

    @FXML
    private TextField deltaCashTextField;
	
	storeModel model;
	public void setModel(storeModel newModel) {
		
		model = newModel;
		
		//bind label
		StringConverter<Number> fmt = new NumberStringConverter();
		Bindings.bindBidirectional(cashBalanceLabel.textProperty(), model.getMoney(),fmt);
	}
	

    

    @FXML
    void onAddCash(ActionEvent event) {
    	model.deldaMoney(100);

    }

    @FXML
    void onRemoveCash(ActionEvent event) {
    	model.deldaMoney(100);
    }

}
