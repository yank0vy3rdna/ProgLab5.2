package net.yank0vy3rdna_and_Iuribabalin.App;

public class App {
    private final UI ui;
    private final Dispatcher dispatcher;
    private boolean enabled;
    public App(){
        enabled = true;
        ui = new UI();
        dispatcher = new Dispatcher();
    }
    public void stop(){
        enabled = false;
    }
    public void start(){
        while (enabled){
            String line = ui.getNextCommand();
            dispatcher.dispatch(line);
        }
    }
}
