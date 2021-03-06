package javafx;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.xml.transform.stream.StreamSource;

public class App extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("antes de subir a janela");
    }

    @Override
    public void start(Stage stage) throws Exception {
        /*
        stage.setTitle("Cabomaldade Application");
        stage.show();

        // Criando uma nova janela(stage)
        Stage segundaJanela = new Stage();
        segundaJanela.setTitle("Segunda Janela");
        segundaJanela.show();

        // Tamanho da Janela
        segundaJanela.setWidth(900);
        segundaJanela.setHeight(600);

        // Posicao da janela na tela
        segundaJanela.setX(200);
        segundaJanela.setY(100);

        Stage terceiraJanela = new Stage();
        terceiraJanela.setTitle("Terceira Janela");

        // Modality
        // só usa essa janela - outras paradadas até fechar essa
        // terceiraJanela.initModality(Modality.APPLICATION_MODAL);

        // janela 2 é dona da 3 - só usa segunda quando fecha terceira
        terceiraJanela.initModality(Modality.WINDOW_MODAL);
        terceiraJanela.initOwner(segundaJanela);

        //terceiraJanela.initModality(Modality.NONE); // Default

        // Style
        terceiraJanela.initStyle(StageStyle.DECORATED);

        terceiraJanela.isFullScreen();

        terceiraJanela.show();
        */

        // Scenes
        Stage janelaScene = new Stage();
        janelaScene.setWidth(400);
        janelaScene.setHeight(400);
        janelaScene.setTitle("Usando Scenes");

        // parent node - vertical layout
        VBox parent = new VBox(); // LayoutManager - controle a disposição

        // child node - Controllers
        Label label1 = new Label("Teste Primeiro Label");
        Label label2 = new Label("Teste Segundo Label");

        Scene primeiraCena = new Scene(parent);

        janelaScene.setScene(primeiraCena);

        primeiraCena.setCursor(Cursor.CLOSED_HAND);

        String url = "https://cdn3.iconfinder.com/data/icons/" +
                "currency-2/460/Brazil-Real-512.png";
        ImageView imagemTeste = new ImageView(url);
        imagemTeste.setFitHeight(100);
        imagemTeste.setFitWidth(100);

        Label imagemLabel = new Label("Teste Label Imagem", imagemTeste);
        imagemLabel.setFont(new Font("Coimbra",20));
        imagemLabel.setTextFill(Color.web("#03fc2c"));

        //parent.getChildren().add(label1);
        parent.getChildren().addAll(label1,label2,imagemLabel);


        janelaScene.show();
        // Labels e Imagens

    }

    @Override
    public void stop() throws Exception {
        System.out.println("após fechar a janela");
    }
}
