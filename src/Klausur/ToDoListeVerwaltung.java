package Klausur;

public class ToDoListeVerwaltung {
    private Task [] tasks;
    private int belegt = 0;

    public ToDoListeVerwaltung (int anzahl){
        this.tasks = new Task[anzahl];
    }

    public void addTask (String title){
        tasks [belegt] = new Task(belegt, title);
        belegt ++;
    }
    public void getTask (int id) {
        for (int i = 0; i < tasks.length; i++){
            if (tasks[i] != null){
                if (tasks[i].getId() == id){
                    tasks[i].setComplete(true);
                }
            }
        }
    }

    public void deleteTask (int id){
        for (int i = 0; i < tasks.length; i++){
                if (tasks[i] !=null){
                    if (tasks[i].getId() == id) {
                        tasks[i] = null;
                        break;

                }
            }
        }
    }
    public void displayTasks(){


    }
}
