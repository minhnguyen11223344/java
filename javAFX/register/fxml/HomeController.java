package register.fxml;

import java.util.List;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HomeController {
	@FXML
	private Label loginedFullname;
	@FXML
	private TableView<User> userListTV = new TableView<User>();
	@FXML
	private TableColumn<User, String> fullnameRow;
	@FXML
	private TableColumn<User, String> emailRow;
	@FXML
	private TextField fullnameTF;
	@FXML
	private TextField emailTF;

//	@FXML
//	public void initialize() {
//	    Platform.runLater(() -> {
//	        fullnameRow.setCellValueFactory(new PropertyValueFactory<>("fullname"));
//	        emailRow.setCellValueFactory(new PropertyValueFactory<>("email"));
//
//	        // Assuming HRM.getStudentList() returns a list of User objects
//	        List<User> userListTV = new ().getuserListTV();
//	        ObservableList<User> obsUserList = FXCollections.observableArrayList(userListTV);
//
//	        userListTV.setItems(obsUserList);
//
//	        // Assuming 'role' and 'userName' are defined somewhere
//	        
//	    });
//	}

	@FXML
	public void onCLickAdd() {
		User std = new User(emailTF.getText(), fullnameTF.getText());

		// Thêm vào danh sách dữ liệu của tableview
		userListTV.getItems().add(std);

	}

	@FXML

	public void onClickFix() {

	}

	@FXML

	public void onClickDelete() {

	}

	@FXML
	private Label welcomeMsg;

	@FXML
	private void OnClickExit() {
		// từ thành phần con dò ra (cửa cổ)
		welcomeMsg.getScene().getWindow().hide();
	}

//	public void onCLickAdd() {
//		
//	}
//	
//	public void onClickFix() {
//		
//	}
//	
//	public void onClickDelete() {
//		
//	}
}
