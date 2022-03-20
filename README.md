# Order-Api control Rest API

Müşteri, Ürün ve Sipariş için oluşturulmuş bir CRUD Api'si.
- Sipariş öğeleri ve müşterilerle ilişkilendirme ile siparişi kontrol eden bir API oluşturuldu. Çalışmada kullanılanlar; 
  - Maven
  - H2-Database
  - Spring Boot
  - Spring Data Jpa
  - Spring web
  - Spring boot dev tools
  - Lombok
  - STS(Spring tools Studio) IDE
    
Nasıl Kullanılır;
  - Projeyi pc'sinize indirdikten sonra STS IDE ortamında çalıştırabilirsiniz. Projeyi çalıştırdıktan sonra Postman kullanabilirsiniz. Resorce folderin altında daha önce hazırlamış olduğumuz dataOrder.sql içindeki dataları insert ettikten sonra çalışmaları kontrol edebilirsiniz. 
  - Kolonlama ve çalıştırma aşağıdaki gibidir;
    
    Clone : 
     - git clone https://github.com/eyupetrez/Order-Api.git
     
    Run : 
     - mvn spring-boot:run

   Endpoints: 
   -  GET - Database de tüm dataları listelenme :
      - /customers
      - /orders
      - /products
      
   -  GET - ID'lere göre dataları getirmek :
      - /customers/{id}
      - /orders/{id}
      - /products/{id}
     
   - DELETE - ID'ye göre dataları silmek : 
       - /customers/{id}
       - /orders/{id}
       - /products/{id}
    
   - POST - Entity oluşturma : 
      - /customers
      - /products
      - /orders
      
