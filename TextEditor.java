class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
        this.prev = this.next = null;
    }
}

class TextEditor {
    private TextState current;
    private int maxHistory;
    private int historyCount;

    public TextEditor(int maxHistory) {
        this.maxHistory = maxHistory;
        this.historyCount = 0;
        this.current = new TextState(""); // Initial empty state
    }

    // Add new text state
    public void addTextState(String content) {
        TextState newState = new TextState(content);
        newState.prev = current;
        if (current != null) {
            current.next = newState;
        }
        current = newState;
        historyCount++;

        // Limit history size
        if (historyCount > maxHistory) {
            TextState temp = current;
            while (temp.prev != null && historyCount > maxHistory) {
                temp = temp.prev;
                historyCount--;
            }
            temp.prev = null;
        }
    }

    // Undo operation
    public void undo() {
        if (current.prev != null) {
            current = current.prev;
        }
    }

    // Redo operation
    public void redo() {
        if (current.next != null) {
            current = current.next;
        }
    }

    // Display current text state
    public void displayCurrentState() {
        System.out.println("Current Text: " + current.content);
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);
        editor.addTextState("Hello");
        editor.addTextState("Hello, World!");
        editor.addTextState("Hello, World! This is a test.");

        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
    }
}

