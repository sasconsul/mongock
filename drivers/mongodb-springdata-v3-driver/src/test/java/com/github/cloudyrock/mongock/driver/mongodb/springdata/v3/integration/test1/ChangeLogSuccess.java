package com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.integration.test1;

import com.mongodb.client.MongoDatabase;
import io.changock.migration.api.annotations.ChangeLog;
import io.changock.migration.api.annotations.ChangeSet;

@ChangeLog
public class ChangeLogSuccess {

  @ChangeSet(author = "testuser", id = "ChangeLog1_0", order = "00")
  public void method_0() {
    System.out.println(ChangeLogSuccess.class.getCanonicalName() + ".method_0()");
  }

  @ChangeSet(author = "testuser", id = "ChangeLog1_1", order = "01")
  public void method_1() {
    System.out.println(ChangeLogSuccess.class.getCanonicalName() + ".method_1()");
  }

  @ChangeSet(author = "testuser", id = "ChangeLog1_2", order = "02")
  public void method_2() {
    System.out.println(ChangeLogSuccess.class.getCanonicalName() + ".method_2()");
  }

  @ChangeSet(author = "testuser", id = "ChangeLog1_3", order = "03", runAlways = true)
  public void method_3() {
    System.out.println(ChangeLogSuccess.class.getCanonicalName() + ".method_3()");
  }

  @ChangeSet(author = "testuser", id = "ChangeLog1_4", order = "04")
  public void method_4(MongoDatabase mongoDatabase) {
    System.out.println(ChangeLogSuccess.class.getCanonicalName() + ".method_4(MongoDatabase mongoDatabase)\n\t\twith " + mongoDatabase.toString());
  }

}
