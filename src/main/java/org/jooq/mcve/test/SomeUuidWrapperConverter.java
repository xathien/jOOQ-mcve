package org.jooq.mcve.test;

import java.util.Optional;
import java.util.UUID;

import org.jooq.Converter;

public class SomeUuidWrapperConverter implements Converter<UUID, SomeUuidWrapper>
{
  @Override
  public UUID to(SomeUuidWrapper entityId)
  {
    return Optional.ofNullable(entityId)
        .map(SomeUuidWrapper::getId)
        .orElse(null);
  }

  @Override
  public Class<UUID> fromType()
  {
    return UUID.class;
  }

  @Override
  public SomeUuidWrapper from(UUID databaseObject)
  {
    return Optional.ofNullable(databaseObject)
        .map(SomeUuidWrapper::new)
        .orElse(null);
  }

  @Override
  public Class<SomeUuidWrapper> toType()
  {
    return SomeUuidWrapper.class;
  }

}
