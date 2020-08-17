package org.jooq.mcve.test;

import static java.util.UUID.randomUUID;

import java.util.UUID;

public class SomeUuidWrapper
{
  UUID id;

  public SomeUuidWrapper(UUID id)
  {
    this.id = id;
  }

  public SomeUuidWrapper()
  {
    this(randomUUID());
  }

  public static SomeUuidWrapper valueOf(String idString)
  {
    return new SomeUuidWrapper(UUID.fromString(idString));
  }

  public UUID getId()
  {
    return id;
  }
}
