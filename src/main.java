
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TodoListManager manager = new TodoListManager();

        // Example usage
        TodoItem item1 = new TodoItem("Finish Task", "Complete the todo project in Java", "2024-04-30");
        TodoItem item2 = new TodoItem("Buy groceries", "Milk, eggs, bread", "2024-04-20");

        manager.addItem(item1);
        manager.addItem(item2);

        System.out.println("Todo List:");
        manager.displayItems();
    }


	}


