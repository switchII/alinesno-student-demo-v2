# 该镜像需要依赖的基础镜像
FROM openjdk:11

# 将当前目录下的jar包复制到docker容器的/目录下
ADD target/alinesno-student-demo-0.0.1-SNAPSHOT.jar /app.jar

# 运行过程中创建一个mall-tiny-docker-file.jar文件
RUN bash -c 'touch /app.jar'

# 声明服务运行在8080端口
EXPOSE 8080

# 指定docker容器启动时运行jar包
ENTRYPOINT ["java", "-jar","/app.jar"]