# employee-count-batch

部門毎社員数集計バッチ

Spring Batchを使用しないシンプルなバッチのサンプルソース

## 必要な環境

- JDK 11
- Groovy 3.0
- Gradle
- IDE(IntelliJ IDEA(有料版) か Eclipse)
- Docker(自前でMySQL用意するなら不要)

## MySQL起動方法

- Docker Desktopをインストールしてローカル環境でDockerの環境構築を行う([Docker Desktop](https://www.docker.com/products/docker-desktop) )
- プロジェクトのルートディレクトリで 以下のコマンドを実行して mysqlのコンテナを立ち上げる(Win/Mac共通)

~~~
$ cd docker
$ docker-compose up -d --build
~~~

### DB初期化手順

- MySQLに直接以下のファイルに配置された DDLとDMLを投入する or コンテナ再作成を行う

~~~
(1) docker/initdb.d/1_schema.sql を直接MySQLに投入する
(2) docker/initdb.d/2_initdata.sql　をDBに投入してデータを投入
~~~

## checkStyle

- configディレクトリ配下に置いてあるcheckstyle.xmlをIDEに読み込ませる
    - [IntelliJでの手順](https://qiita.com/kent-hamaguchi/items/f4d2a5594c3c4d3195ab)

## 参考

- [git hub リポジトリ複製方法](https://docs.github.com/ja/repositories/creating-and-managing-repositories/duplicating-a-repository)
- [リポジトリの履歴初期化方法](https://qumeru.com/magazine/526)
