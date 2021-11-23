A project to demonstrate understanding of Multi-threading in Java.
JDK version: 11
For this purpose, I have created these:
    A UI using JavaFX. It contains the following:
    A 1000 x 700 pixels-size application screen. It contains the following:
        A title.
        A message at the top.
        4 file-names.
        A dummy "Download All" button.
        4 progress-bars to show the dummy progress of these 4 files and 4 labels to show these dummy progresses in percentage.
        
commit 3: title: Introduced 4 threads:
    Added code for 4 threads running the code to increment the values of the progress of the individual
    progress-bars.
    The integration of the progress-bars and the labels that were initially introduced as to show the 
    progress in % has not been realised yet. For now, I may end the project at this point as the 
    purpose of the project has already been served.
Commit: Did some housekeeping and addition of comments:
    Have removed some commented code. Have added some comments for understanding and explaining.
    Have decided to drop the idea of investing time to learn to show the progress in % simultaneously for now.
    Will try to add a video to demonstrate how exactly the code works in the next commit. 
