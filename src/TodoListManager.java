import java.util.ArrayList;
import java.util.List;

public class TodoListManager {
    private List<TodoItem> todoList;

    public TodoListManager() {
        todoList = new ArrayList<>();
    }

    public void addItem(TodoItem item) {
        todoList.add(item);
    }

    public void removeItem(int index) {
        todoList.remove(index);
    }

    public void displayItems() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i).getTitle());
        }
    }

}
