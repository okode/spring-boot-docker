FROM openjdk:19 as build
RUN microdnf install findutils
COPY . /src
RUN cd /src && ./gradlew build

FROM openjdk:19
RUN groupadd -r app && useradd -r -gapp app
COPY --from=build /src/build/libs/app.jar /app/
RUN chown -R app:app /app
USER app:app
WORKDIR /app
CMD [ "/app/app.jar" ]
