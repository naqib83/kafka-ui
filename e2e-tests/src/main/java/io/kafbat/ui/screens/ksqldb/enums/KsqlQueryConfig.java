package io.kafbat.ui.screens.ksqldb.enums;

import lombok.Getter;

@Getter
public enum KsqlQueryConfig {

  SHOW_TABLES("show tables;"),
  SHOW_STREAMS("show streams;"),
  SELECT_ALL_FROM("SELECT * FROM %s\n" + "EMIT CHANGES;");

  private final String query;

  KsqlQueryConfig(String query) {
    this.query = query;
  }
}
