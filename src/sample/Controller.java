package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Controller {
    @FXML
    private ProgressBar progressBar1;
    @FXML
    private ProgressBar progressBar2;
    @FXML
    private ProgressBar progressBar3;
    @FXML
    private ProgressBar progressBar4;
    @FXML
    private Label progress1;
    @FXML
    private Label progress2;
    @FXML
    private Label progress3;
    @FXML
    private Label progress4;

    @FXML
    public void onButtonClicked(){
        progressBar1.visibleProperty().setValue(true);
        progressBar2.visibleProperty().setValue(true);
        progressBar3.visibleProperty().setValue(true);
        progressBar4.visibleProperty().setValue(true);
        progress1.visibleProperty().setValue(true);
        progress2.visibleProperty().setValue(true);
        progress3.visibleProperty().setValue(true);
        progress4.visibleProperty().setValue(true);
//        System.out.println("Clicked.");

        Runnable task = () -> {
            try{
                Thread.sleep(10000);
                progressBar4.visibleProperty().setValue(false);
            } catch(InterruptedException e){
                // Nothing.
            }
        };
        new Thread(task).start();
    }
}
