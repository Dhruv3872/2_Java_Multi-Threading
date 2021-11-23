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
            Runnable thread1 = () -> {
                try {
                    double x = 0.0;

                    while(x <= 1.0) {
                        x = x + 0.01;
                        Thread.sleep(100);
                        progressBar1.setProgress(x);
                        //progress1.setText(String.format("%f",progressBar1.getProgress()));

                    }
                } catch (InterruptedException e) {
                     //Nothing to do here for now.
                }
            };
            Runnable thread2 = () -> {
                try {
                    double x = 0.0;

                    while(x <= 1.0) {
                        x = x + 0.01;
                        Thread.sleep(50);
                        progressBar2.setProgress(x);
                    }
                } catch (InterruptedException e) {
                    //Nothing to do here for now.
                }
            };
            Runnable thread3 = () -> {
                try {
                    double x = 0.0;

                    while(x <= 1.0) {
                        x = x + 0.01;
                        Thread.sleep(150);
                        progressBar3.setProgress(x);
                    }
                } catch (InterruptedException e) {
                    //Nothing to do here for now.
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
                } catch (InterruptedException e) {
                    //Nothing to do here for now.
                }
            });
            new Thread(thread1).start(); /* Necessary to run the run() method of the thread-1
            object initialised as an object of the Runnable interface and
            defined as an object of the Thread class.
            The method is not visible as the lambda expression hides it within. */
            new Thread(thread2).start();
            new Thread(thread3).start();
            new Thread(thread4).start();
        }
    }
}
