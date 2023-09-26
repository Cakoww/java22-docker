FROM openjdk:22-bullseye

COPY ./ /app/

# Start and enable SSH
RUN apt-get update \
    && apt-get install -y --no-install-recommends dialog \
    && apt-get install -y --no-install-recommends openssh-server \
    && echo "root:Docker!" | chpasswd \
    && chmod u+x /app/entrypoint.sh
	
COPY sshd_config /etc/ssh/

EXPOSE 8080 2222



ENTRYPOINT ["/app/entrypoint.sh"]