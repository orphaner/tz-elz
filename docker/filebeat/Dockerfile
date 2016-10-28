FROM prima/filebeat:5.0.0-rc1

CMD mkdir /applog

COPY docker-entrypoint.sh /
COPY config/filebeat.yml /filebeat.yml

CMD [ "filebeat", "-e", "-d", "\"*\"", "-c", "/filebeat.yml" ]
