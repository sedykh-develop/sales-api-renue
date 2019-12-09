CREATE TABLE USER (
  id bigint primary key not null,
  telegram_user_id bigint unique
);

CREATE SEQUENCE USER_ID_SEQUENCE INCREMENT BY 1;

CREATE TABLE CHECK (
  fn varchar(36) not null,
  fs varchar(36) not null,
  fd varchar(36) not null,
  data json,
  state varchar(12) not null,
  user_id bigint references USER(id),

  primary key (fn, fd, fs)
);

COMMENT ON COLUMN CHECK.fs IS 'Фискальный признак документа';
COMMENT ON COLUMN CHECK.fn IS 'Номер ФН';
COMMENT ON COLUMN CHECK.fd IS 'Порядковый номер ФД';