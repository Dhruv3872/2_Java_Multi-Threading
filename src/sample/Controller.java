package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Controller {

    private boolean downloadStarted = false;

    @FXML
    private Button downloadButton;
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
    public void onButtonClicked() {
        downloadButton.setVisible(false);
        if (!downloadStarted) {
            downloadStarted = true;
            progressBar1.visibleProperty().setValue(true);
            progressBar2.visibleProperty().setValue(true);
            progressBar3.visibleProperty().setValue(true);
            progressBar4.visibleProperty().setValue(true);
            progress1.visibleProperty().setValue(true);
            progress2.visibleProperty().setValue(true);
            progress3.visibleProperty().setValue(true);
            progress4.visibleProperty().setValue(true);
            //        System.out.println("Clicked.");
            Runnable thread1 = () -> {
                try {
                    double x = 0.0;

                    while(x <= 1.0) {
                        x = x + 0.01;
                        Thread.sleep(100);
                        progressBar1.setProgress(x);
                        //progress1.setText(String.format("%f",progressBar1.getProgress()));

                    }
                    //progressBar4.visibleProperty().setValue(false);
                } catch (InterruptedException e) {
                     //Nothing.
                }
            };
            Runnable thread2 = () -> {
                try {
                    double x = 0.0;

                    while(x <= 1.0) {
                        x = x + 0.01;
                        Thread.sleep(50);
                        progressBar2.setProgress(x);
                        //progress1.setText(String.format("%f",progressBar1.getProgress()));
                    }
                    //progressBar4.visibleProperty().setValue(false);
                } catch (InterruptedException e) {
                    //Nothing.
                }
            };
            Runnable thread3 = () -> {
                try {
                    double x = 0.0;

                    while(x <= 1.0) {
                        x = x + 0.01;
                        Thread.sleep(150);
                        progressBar3.setProgress(x);
                        //progress1.setText(String.format("%f",progressBar1.getProgress()));

                    }
                    //progressBar4.visibleProperty().setValue(false);
                } catch (InterruptedException e) {
                    //Nothing.
                }
            };
            Runnable thread4 = new Thread(() -> {
                try {
                    double x = 0.0;
                    while (x <= 1.0) {
                        x = x + 0.01;
                        Thread.sleep(200);
                        progressBar4.setProgress(x);
                    }
                    //progressBar4.visibleProperty().setValue(false);
                } catch (InterruptedException e) {
                    //Nothing.
                }
            });
            new Thread(thread1).start();
            new Thread(thread2).start();
            new Thread(thread3).start();
            new Thread(thread4).start();
            //progress1.setText(String.format("%f",progressBar1.getProgress()));
        }
    }
}
