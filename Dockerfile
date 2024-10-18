# syntax=docker/dockerfile:experimental
# DOCKER_BUILDKIT=1 docker build --ssh default -t registry.digitalocean.com/titanro-docr/auriga-game . && docker image push registry.digitalocean.com/titanro-docr/auriga-game

FROM alpine:latest AS build

RUN apk add --no-cache \
	mariadb-dev \
	gcc \
	g++ \
	gdb \
	git \
	pcre-dev \
	make \
	openssh-client \
	zlib-dev \
	linux-headers

COPY . /auriga_server
WORKDIR /auriga_server
RUN delgroup ping \
	&& addgroup -g 999 appuser \
	&& adduser -S -u 999 -G appuser appuser

RUN chown -R 999:999 /auriga_server

USER appuser

RUN make clean \
	&& make


FROM alpine:latest

RUN apk add --no-cache \
	mariadb-connector-c \
	libgcc \
	pcre-dev

WORKDIR /auriga_server
RUN delgroup ping \
	&& addgroup -g 999 appuser \
	&& adduser -S -u 999 -G appuser appuser

COPY --from=build /auriga_server/sql-files ./sql-files
COPY --from=build /auriga_server/conf ./conf
COPY --from=build /auriga_server/db ./db
# COPY --from=build /auriga_server/data ./data
# COPY --from=build /auriga_server/log ./log
COPY --from=build /auriga_server/script ./script
COPY --from=build /auriga_server/script_en ./script_en
# COPY --from=build /auriga_server/save ./save
COPY --from=build /auriga_server/login-server /auriga_server/char-server /auriga_server/map-server ./

RUN chown -R 999:999 /auriga_server

USER appuser
