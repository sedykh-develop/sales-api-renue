CREATE TABLE CHECK_DATA(
  fn varchar(36) not null,
  fs varchar(36) not null,
  fd varchar(36) not null,
  data text,
  state varchar(12) not null,
  telegram_user_id bigint not null,

  primary key (fn, fd, fs)
);