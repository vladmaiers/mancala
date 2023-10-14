package com.vladmaiers.mancala.model;

import com.vladmaiers.mancala.type.PitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.util.UUID;

/**
 * Pit
 */
@Builder
@EqualsAndHashCode
@AllArgsConstructor
public final class Pit {

    private final PitType type;

    private final int index;

    private final UUID ownerUuid;

    private final int stones;

}
