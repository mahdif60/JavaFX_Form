package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class MController implements Initializable{

	@FXML
	public ImageView imageView;
	@FXML
	public Button start;
	@FXML
	public ComboBox<String> comboBox;


	ObservableList<String> list=FXCollections.observableArrayList("ID 1","ID 2","ID 3", "ID 4");	
	
	
		@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		comboBox.setItems(list);
	}

	public void imselect() {
		
		comboBox.setOnAction(actionEvent ->  {
			//... do something in here.    
			try {
				String s=comboBox.getValue();
				int k=1;
				if (s.equals("ID 1")) {
					k=1;
				}else if(s.equals("ID 2")){
					k=2;
				}else if(s.equals("ID 3")){
					k=3;
				}else if(s.equals("ID 4")){
					k=4;
				}	
				System.out.println(k);
				FileInputStream input = new FileInputStream("C:\\Users\\MF_PC\\eclipse-workspace\\JavaFXImageview\\res\\"+k+".jpg");
				Image image = new Image(input);
				imageView.setImage(image);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			});
		}


		public void imRead() {

			start.setOnAction(actionEvent ->  {
				//... do something in here.    
				try {
					FileInputStream input = new FileInputStream("C:\\Users\\MF_PC\\git\\JavaOCR\\JavaOCR\\sharp\\1.jpg");
					Image image = new Image(input);
					imageView.setImage(image);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			});
		}



	}
