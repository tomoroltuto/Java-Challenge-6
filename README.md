# 概要
Java-Challenge-6ではWeb上にHello World！+日時が表示できるように以下のことをしました。
レビューお願いします。

# やったこと
* ①Spring Boot設定
* ②Hello World！を表示
* ③日時を表示

## ①Spring Boot設定
Spring Bootの設定にはspring initializrを使用して設定しました。


| Project| Gradle Project| 
| :---: | :---: | 
| Language | Java | 
| Spring Boot | 2.7.3 | 
| packing | Jar | 
| Java | 17 | 
| Dependencies | Spring Web <br> Thymeleaf <br> |

## ②Hello World！を表示
Hello World！を表示するため以下のことをしました。
・src/main/java/com/example/JavaChallenge6にWebのディレクトリを作成
・Webのディレクトリ内にJavaクラスIndexController.javaを作成
・JavaクラスIndexController.java内に以下の処理が行われるようにうにコードを作成しました。
　　①@Controllerアノテーション使用してSpringにControllerクラスであることを認識させる　　
　　②@GetMappingアノテーション使用してGETリクエストの (http://localhost:8080) とindexメソッドを紐付ける
　　③indexメソッドのreturn(戻り値)でViewの遷移先をindex.htmlに指定する
・src/main/resources/templatesにHTMLファイルindex.html内に以下の処理が行われるようにうにコードを作成しました。
　　① Hello World！を表示できるようにhタグを追加

## ③日時を表示
日時を表示を表示するため以下のことをしました。
・src/main/java/com/example/JavaChallenge6/web/IndexController.java内に以下の処理が行われるようにコードを追加しました。
　　①LocalDateTimeクラスを使用して現在の日時を取得する
　　②DateTimeFormatterクラスを使用して取得した日時のフォーマットを指定する
　　③Modelクラスを使用して"index"(index.html)に、todayを指定した値を表示
・src/main/resources/templates/index.html内に以下の処理が行われるようにコードを追加しました。
　　①javaから渡されたデータを表示できるようにテンプレートエンジン(Thymeleaf)名前空間記法（th:*）を使用
　　②名前空間記法（th:*）を使えるように xmlns:th="http://www.thymeleaf.org" を宣言


# localhostアクセス結果
<img width="541" alt="課題６" src="https://user-images.githubusercontent.com/90845405/186192024-59a07686-0e5a-4083-87a2-f2344d2ac385.png">


# 開発環境
IntelliJ IDEA 2022.2.1 (Community Edition)
