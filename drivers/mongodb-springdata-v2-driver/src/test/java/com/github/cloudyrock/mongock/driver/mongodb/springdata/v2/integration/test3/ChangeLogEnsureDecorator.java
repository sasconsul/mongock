package com.github.cloudyrock.mongock.driver.mongodb.springdata.v2.integration.test3;

import com.github.cloudyrock.mongock.driver.mongodb.springdata.v2.decorator.impl.MongockTemplate;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v2.util.CallVerifier;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v2.util.CallVerifierImpl;
import com.github.cloudyrock.mongock.driver.mongodb.v3.decorator.MongoDatabaseDecorator;
import com.mongodb.client.MongoDatabase;
import io.changock.migration.api.annotations.ChangeLog;
import io.changock.migration.api.annotations.ChangeSet;
import org.junit.Assert;

@ChangeLog
public class ChangeLogEnsureDecorator {
  @ChangeSet(author = "testuser", id = "ensure_mongo_database", order = "00")
  public void ensureMongoDatabaseDecorator(MongoDatabase mongodatabase, CallVerifier callVerifier) {
    Assert.assertTrue(MongoDatabaseDecorator.class.isAssignableFrom(mongodatabase.getClass()));
    callVerifier.increaseCounter();
  }

  @ChangeSet(author = "testuser", id = "ensure_mongo_template", order = "00")
  public void ensureMongoTemplateDecorator(MongockTemplate mongockTemplate, CallVerifier callVerifier) {
    Assert.assertTrue(MongockTemplate.class.isAssignableFrom(mongockTemplate.getClass()));
    callVerifier.increaseCounter();
  }

}
