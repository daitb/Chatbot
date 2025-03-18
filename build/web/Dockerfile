# Sử dụng OpenJDK làm môi trường runtime
FROM openjdk:17-jdk-slim

# Cài đặt Tomcat (nếu cần)
RUN apt update && apt install -y wget && \
    wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.82/bin/apache-tomcat-9.0.82.tar.gz && \
    tar xvf apache-tomcat-9.0.82.tar.gz && mv apache-tomcat-9.0.82 /usr/local/tomcat

# Copy mã nguồn hoặc file WAR vào thư mục Tomcat
COPY target/Chatbot.war/usr/local/tomcat/webapps/

# Expose cổng 8080 (Tomcat chạy mặc định trên cổng này)
EXPOSE 8080

# Lệnh chạy ứng dụng khi container khởi động
CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
