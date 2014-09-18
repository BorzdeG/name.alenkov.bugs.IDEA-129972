package name.alenkov.bugs.idea_129972;

import javafx.collections.ObservableList;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TreeView;

public class DemoClass {
	public DemoClass() {
		final TreeView treeView = new TreeView();
		final MultipleSelectionModel selectionModel = treeView.getSelectionModel();
		final ObservableList<Integer> selectedIndices = selectionModel.getSelectedIndices();
	}
}
