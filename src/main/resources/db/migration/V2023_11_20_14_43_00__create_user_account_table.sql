DROP TABLE IF EXISTS user_account;

CREATE TABLE user_account(
    id           VARCHAR(32) PRIMARY KEY NOT NULL,
    username     VARCHAR(92)             NOT NULL,
    password     VARCHAR(128)            NOT NULL,
    email        VARCHAR(128)            NOT NULL,
    privilege_id VARCHAR(32)             NOT NULL,
    created_at   DATE                    NOT NULL,
    updated_at   DATE                    NOT NULL,
    created_by   VARCHAR(36)             NOT NULL,
    updated_by   VARCHAR(36)             NOT NULL,
    deleted      BOOLEAN                 NOT NULL DEFAULT FALSE
);