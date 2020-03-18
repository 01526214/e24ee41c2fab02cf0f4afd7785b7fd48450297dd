-- create table horse if not exists
CREATE TABLE IF NOT EXISTS owner
(
  id         BIGINT AUTO_INCREMENT PRIMARY KEY,
  name       VARCHAR(255) NOT NULL,
  created_at DATETIME     NOT NULL,
  updated_at DATETIME     NOT NULL
);

-- create table horse if not exists
CREATE TABLE IF NOT EXISTS horse (
  -- use auto incrementing IDs as primary key
  id          BIGINT AUTO_INCREMENT PRIMARY KEY,
  name        VARCHAR(255) NOT NULL,
  description VARCHAR(255),
  rating      INTEGER      NOT NULL,
  birth_date  DATE         NOT NULL,
  format      VARCHAR(255) NOT NULL,
  breed       TEXT         NOT NULL,
  created     DATETIME     NOT NULL,
  updated     DATETIME     NOT NULL
);
