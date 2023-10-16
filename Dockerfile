FROM openjdk:17
# 이 프로젝트를 복사해서
RUN ["mkdir", "project"]
# 현재 경로에 있는 것을 현재경로 프로젝트에 붙여넣겠다.
COPY . .
# 도커 파일 안에서 빌드를 치고
RUN ["chmod", "774", "./project/gradlew"]
RUN ["./gradlew", "clean", "build"]
#그 후에 자파일을 실행한다.
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "build/libs/*T.jar"]