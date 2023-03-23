package Application;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.geometry.Insets;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class registration_form extends Application {	
	 private GridPane root;
	 private Label fnameLabel;
	 private TextField fnTextField;
	 private Label mnameLabel;
	 private TextField mnTextField;
	 private Label lnameLabel;
	 private TextField lnTextField;
	 private Label emailLabel;
	 private TextField emailTextField;
	 private Label mnoLabel;
	 private TextField mnoTextField;
	 private Label dobLabel;
	 private ComboBox<Object> date;
	 private ComboBox month;
	 private ComboBox<Object> year; 
	 private RadioButton male;
	 private RadioButton female;
	 private Label genderLabel;
	 private Label langLabel;
	 private CheckBox hindi;
	 private CheckBox gujarati;
	 private CheckBox english;
	 private Label fnameStatus;
	 private Label mnameStatus;
	 private Label lnameStatus;
	 private Label emailStatus;
	 private Label mnoStatus;
	 private Label dobStatus;
	 private Label genderStatus;
	 private Label langStatus;
	 private int valid=0; 
	 private Button submit;
	 private Button cancel;
	 @Override
	    public void start(Stage primaryStage) throws Exception {
	        primaryStage.setTitle("Registration Form ");
	        //Variables declaration
	        root=new GridPane();
	        root.setHgap(10);
	        root.setVgap(10);
	        root.setPadding(new Insets(10,10,10,10));
	        fnameLabel=new Label("First Name:");
	        mnameLabel=new Label("Middle Name:");
	        lnameLabel=new Label("Last Name:");
	        emailLabel=new Label("E-mail:");
	        mnoLabel=new Label("Mobile No:");
	        dobLabel=new Label("Date Of Birth:");
	        genderLabel=new Label("Gender:");
	        langLabel=new Label("Languages Known:");
	        
	        fnameStatus=new Label("*");
	        fnameStatus.setTextFill(Color.RED);
	        mnameStatus=new Label("*");
	        mnameStatus.setTextFill(Color.RED);
	        lnameStatus=new Label("*");
	        lnameStatus.setTextFill(Color.RED);
	        emailStatus=new Label("*");
	        emailStatus.setTextFill(Color.RED);
	        mnoStatus=new Label("*");
	        mnoStatus.setTextFill(Color.RED);
	        dobStatus=new Label("*");
	        dobStatus.setTextFill(Color.RED);
	        genderStatus=new Label("*");
	        genderStatus.setTextFill(Color.RED);
	        langStatus=new Label("*");
	        langStatus.setTextFill(Color.RED);
	        
	        fnTextField=new TextField();
	        mnTextField=new TextField();
	        lnTextField=new TextField();
	        emailTextField=new TextField();
	        mnoTextField=new TextField();
	        
	        submit=new Button("Submit");
	        cancel=new Button("Cancel");
	        
	        root.add(fnameLabel, 0, 0);
	        root.add(mnameLabel, 0, 1);
	        root.add(lnameLabel, 0, 2);
	        root.add(emailLabel, 0, 3);
	        root.add(mnoLabel, 0, 4);
	        root.add(dobLabel, 0, 5);
	        root.add(genderLabel, 0, 6);
	        root.add(langLabel, 0, 7);
	        root.add(submit, 0, 8);
	        root.add(cancel, 1, 8);
	        root.add(fnTextField, 1, 0);
	        root.add(mnTextField, 1, 1);
	        root.add(lnTextField, 1, 2);
	        root.add(emailTextField, 1, 3);
	        root.add(mnoTextField, 1, 4);
	        root.add(fnameStatus, 3, 0);
	        root.add(mnameStatus, 3, 1);
	        root.add(lnameStatus, 3, 2);
	        root.add(emailStatus, 3, 3);
	        root.add(mnoStatus, 3, 4);
	        root.add(dobStatus, 3, 5);
	        root.add(genderStatus, 3, 6);
	        root.add(langStatus, 3, 7);
	        
	        date=new ComboBox();
	        date.setPromptText("Day");
	        month=new ComboBox();
	        month.setPromptText("Month");
	        year=new ComboBox();
	        year.setPromptText("Year");
	        
	        List<Object> list=new ArrayList<Object>();
        	Integer IntObj;
	        for(int i=1; i<=31; i++) {
	            IntObj=i;
	        	list.add(IntObj);
	        }
	        date.getItems().addAll(list);
	        DateFormatSymbols dfs=new DateFormatSymbols();
	        String arr[]=dfs.getMonths();
	        month.getItems().addAll((Object[]) arr);
	        
	        list.removeAll(list);
	        for(int i=1947; i<=2022; i++) {
	        	IntObj=i;
	        	list.add(IntObj);
	        }
	        year.getItems().addAll(list);
	        GridPane root1=new GridPane();
	        root1.setHgap(10);
	        root1.add(date, 0, 0);
	        root1.add(month, 1, 0);
	        root1.add(year, 2, 0);
	        root.add(root1, 1, 5);
	        
	        male=new RadioButton("Male");
	        female=new RadioButton("Female");
	        
	        ToggleGroup tg=new ToggleGroup();
	        male.toggleGroupProperty().set(tg);
	        female.toggleGroupProperty().set(tg);
	        
	        
	        GridPane root2=new GridPane();
	        root2.setHgap(10);
	        root2.add(male, 0, 0);
	        root2.add(female, 1, 0);
	        
	        root.add(root2, 1, 6);
	        
	        
	        hindi=new CheckBox("Hindi");
	        gujarati=new CheckBox("Gujarati");
	        english=new CheckBox("English");
	        GridPane root3=new GridPane();
	        root3.setHgap(10);
	        root3.add(hindi, 0, 0);
	        root3.add(gujarati, 1, 0);
	        root3.add(english, 2, 0);
	        
	        root.add(root3, 1, 7);
	        
	        Scene scene=new Scene(root,700,420);
	        primaryStage.setScene(scene);
	        
	        //event handling
	        
	        fnTextField.setOnKeyReleased(e -> {
	        	if(fnTextField.getText()=="") {
	        		fnameStatus.setText("*");
	    	        fnameStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		fnameStatus.setText("");
	        	}
	        });
	        mnTextField.setOnKeyReleased(e -> {
	        	if(mnTextField.getText()=="") {
	        		mnameStatus.setText("*");
	    	        mnameStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		mnameStatus.setText("");
	        	}
	        });
	        lnTextField.setOnKeyReleased(e -> {
	        	if(lnTextField.getText()=="") {
	        		lnameStatus.setText("*");
	    	        lnameStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		lnameStatus.setText("");
	        	}
	        });
	        emailTextField.setOnKeyReleased(e -> {
	        	if(emailTextField.getText()=="") {
	        		emailStatus.setText("*");
	    	        emailStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		emailStatus.setText("");
	        	}
	        });
	        mnoTextField.setOnKeyReleased(e -> {
	        	if(mnoTextField.getText()=="") {
	        		mnoStatus.setText("*");
	    	        mnoStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		mnoStatus.setText("");
	        	}
	        });
	        date.setOnAction(e -> {
	        	if(date.getValue()==null || month.getValue()==null || year.getValue()==null) {
	        		dobStatus.setText("*");
	    	        dobStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		dobStatus.setText("");
	        	}
	        });
	        month.setOnAction(e -> {
	        	if(date.getValue()==null || month.getValue()==null || year.getValue()==null) {
	        		dobStatus.setText("*");
	    	        dobStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		dobStatus.setText("");
	        	}
	        });
	        year.setOnAction(e -> {
	        	if(date.getValue()==null || month.getValue()==null || year.getValue()==null) {
	        		dobStatus.setText("*");
	    	        dobStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		dobStatus.setText("");
	        	}
	        });
	        
	        male.setOnAction(e -> {
	        	if(male.isSelected()==false && female.isSelected()==false) {
	        		genderStatus.setText("*");
	        		genderStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		genderStatus.setText("");
	        	}
	        });
	        female.setOnAction(e -> {
	        	if(male.isSelected()==false && female.isSelected()==false) {
	        		genderStatus.setText("*");
	        		genderStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		genderStatus.setText("");
	        	}
	        });
	        
	        hindi.setOnAction(e -> {
	        	if(hindi.isSelected()==false && gujarati.isSelected()==false && english.isSelected()==false) {
	        		langStatus.setText("*");
	        		langStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		langStatus.setText("");
	        	}
	        });
	        gujarati.setOnAction(e -> {
	        	if(hindi.isSelected()==false && gujarati.isSelected()==false && english.isSelected()==false) {
	        		langStatus.setText("*");
	        		langStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		langStatus.setText("");
	        	}
	        });
	        english.setOnAction(e -> {
	        	if(hindi.isSelected()==false && gujarati.isSelected()==false && english.isSelected()==false) {
	        		langStatus.setText("*");
	        		langStatus.setTextFill(Color.RED);
	        	}
	        	else {
	        		langStatus.setText("");
	        	}
	        });
	          
	        emailTextField.setOnAction(e -> {
	        	try {
		        	String email=emailTextField.getText();
		        	if(email.charAt(0)=='.') {
		        		emailStatus.setText("Invalid email");
		        		emailStatus.setTextFill(Color.RED);
		        		valid=0;
		        		return;
		        	}
		        	int i;
		        	char ch;
		        	int index1; //@
		        	int index2; //first .
		        	
		        	for(i=0; email.charAt(i)!='@'; i++) {
		        		ch=email.charAt(i);
		        		if(i!=0 &&  ch=='.' && email.charAt(i-1)==ch) { //two consecutive dot must not be present
		        			System.out.println("Invalid Email");
		        			valid=0;
		        			return;
						}
		        		if(!((ch>='0' && ch<='9') || (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || ch=='.' || ch=='-' || ch=='_')) {
		        			System.out.println("Invalid Email num");
		        			valid=0;
			        		return;
		        		}
		        	}
		        	index1=i;
		        	if((email.length()-1-index1)>253) {	//domain name must not exceed 253 characters
		        		System.out.println("Invalid Email");
		        		valid=0;
		        		return;
					}
		        	if(email.charAt(i-1)=='.' || email.charAt(i+1)=='.') //on either side of @ . must not be present
					{
		        		emailStatus.setText("Invalid email");
		        		emailStatus.setTextFill(Color.RED);
		        		valid=0;
		        		return;
					}
		        	if(email.charAt(index1-1)=='.' || index1>64) {
		        		emailStatus.setText("Invalid email");
		        		emailStatus.setTextFill(Color.RED);
		        		valid=0;
		        		return;
		        	}
	//	        	System.out.println(index1);
		        	for(i=index1+1; email.charAt(i)!='.'; i++) {
		        		ch=email.charAt(i);
		        		if(!((ch>='0' && ch<='9') || (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || ch=='-')) {
		        			emailStatus.setText("Invalid email");
			        		emailStatus.setTextFill(Color.RED);
			        		valid=0;
			        		return;
		        		}
		        	}
		        	index2=i;
		        	if(!(index2-index1-1>=2)) {
		        		emailStatus.setText("Invalid email");
		        		emailStatus.setTextFill(Color.RED);
		        		valid=0;
		        		return;
		        	}
		        	int dotIndex=i;
					for(i=index2+1; i<email.length(); i++) {
						char ch1=email.charAt(i);
						if(ch1=='.' && ch1==email.charAt(i-1)) { //two consecutive dot must not be present
							emailStatus.setText("Invalid email");
			        		emailStatus.setTextFill(Color.RED);
			        		valid=0;
			        		return;
						}
						if(!((ch1>='A'&& ch1<='Z') || (ch1>='a' && ch1<='z') || ch1=='.')) {
							emailStatus.setText("Invalid email");
			        		emailStatus.setTextFill(Color.RED);
			        		valid=0;
			        		return;
						}
						if(ch1=='.') { //dotIndex will keep track on last dot
							dotIndex=i;
						}
					}
					if(email.charAt(i-1)=='.') { //	email must not end with .
						emailStatus.setText("Invalid email");
		        		emailStatus.setTextFill(Color.RED);
		        		valid=0;
		        		return;
					}
					if(!(email.length()-1-dotIndex>1 && email.length()-1-dotIndex<=6)) { //the top lvl domain must be in range [2,6]
						emailStatus.setText("Invalid email");
		        		emailStatus.setTextFill(Color.RED);
		        		valid=0;
		        		return;
					}
	        	}
	        	catch(Exception e1) {
	        		emailStatus.setText("Invalid email");
	        		emailStatus.setTextFill(Color.RED);
	        		valid=0;
	        		return;
	        	}
	        	emailStatus.setText("Valid email");
        		emailStatus.setTextFill(Color.GREEN);
        		valid=1;
	        });
	        
	        cancel.setOnAction(e -> {
	        	fnTextField.setText("");
				mnTextField.setText("");
				lnTextField.setText("");
				emailTextField.setText("");
				mnoTextField.setText("");
				date.setValue(null);
				month.setValue(null);
				year.setValue(null);
				male.setSelected(false);
				female.setSelected(false);
				hindi.setSelected(false);
				gujarati.setSelected(false);
				english.setSelected(false);
	        });
	        submit.setOnAction(e -> {
	        	if(fnTextField.getText()=="" || mnTextField.getText()=="" || lnTextField.getText()=="" || valid==0 || mnoTextField.getText()=="" ||
						 date.getValue()==null || month.getValue()==null || year.getValue()==null || (male.isSelected()==false && female.isSelected()==false) || 
						 (hindi.isSelected()==false && gujarati.isSelected()==false && english.isSelected()==false)) {
					Alert alert=new Alert(AlertType.WARNING,"Some of the field is empty or Invalid");
					alert.showAndWait();
				}
	        	else {
	        	
	        	Stage stage=new Stage();
				AnchorPane root=new AnchorPane();
				Scene scene1=new Scene(root,300,300);
				
				Label label=new Label("Welcome "+fnTextField.getText());
				
				label.setLayoutX(20);
				label.setLayoutY(20);
				
				root.getChildren().add(label);
				stage.setTitle("Welcome");
				stage.setScene(scene1);
				stage.show();}
	        });
	        
	        mnoTextField.textProperty().addListener((observable, newValue, oldValue) -> {
	        	if(mnoTextField.getText().length()>10) {
	        		String copy=mnoTextField.getText();
	        		copy=copy.substring(0,10);
	        		mnoTextField.setText(copy);
	        	}
	        	try {
		        	String str=mnoTextField.getText();
		        	int lastIndex=str.length()-1;
		        	if(!(str.charAt(lastIndex)>='0' && str.charAt(lastIndex)<='9')) {
		        		String copy=mnoTextField.getText();
		        		copy=copy.substring(0,lastIndex);
		        		mnoTextField.setText(copy);
		        	}
	        	}
	        	catch(Exception e) {
	        		
	        	}
	        });
			 primaryStage.show();
	 }
}
