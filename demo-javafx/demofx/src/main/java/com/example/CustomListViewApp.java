package com.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.VBox;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.util.Random;


/**
 * Custom ListView per mostrare ricette
 */
public class CustomListViewApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ObservableList<Recipe> dishes = FXCollections.observableArrayList(
            new Recipe("Piatto 1", 60), new Recipe("Piatto 2", 33)
        );

        ListView<Recipe> listView = new ListView<>();
        listView.setItems(dishes);
        listView.setCellFactory((ListView<Recipe> item) -> new RecipeCell());
        
        /* 
         * Le liste observable notificano in automatico la ListView quando il contenuto è modificato.
         * In questo esempio aggiungiamo un elemento quando il pulsante viene premuto.
         */
        Button addRecipeButton = new Button("Add new recipe");
        addRecipeButton.setOnAction((ActionEvent e ) -> {
            int duration = (new Random()).nextInt(120);
            dishes.add(new Recipe(String.format("Piatto %d", dishes.toArray().length), duration));
        });

        VBox layout = new VBox(10.0, listView, addRecipeButton);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Custom List View");
        stage.show();
    }

    class Recipe {
        public String name;
        public Integer duration;

        public Recipe(String name, Integer duration) {
            this.name = name;
            this.duration = duration;
        }
    }

    static class RecipeCell extends ListCell<Recipe> {
        @Override
        public void updateItem(Recipe item, boolean empty) {
            super.updateItem(item, empty);

            if (item != null) {
                Label text = new Label(String.format("%s (duration: %d min)", item.name, item.duration));
                this.setGraphic(text);
            }
        }
    }

    public static void main(String[] args) {
        launch();
    }

}