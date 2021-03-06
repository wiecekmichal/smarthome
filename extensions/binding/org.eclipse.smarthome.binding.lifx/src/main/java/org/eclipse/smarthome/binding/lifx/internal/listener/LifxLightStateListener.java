/**
 * Copyright (c) 2014,2019 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.binding.lifx.internal.listener;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.smarthome.binding.lifx.internal.LifxLightState;
import org.eclipse.smarthome.binding.lifx.internal.fields.HSBK;
import org.eclipse.smarthome.binding.lifx.internal.protocol.PowerState;
import org.eclipse.smarthome.binding.lifx.internal.protocol.SignalStrength;
import org.eclipse.smarthome.core.library.types.PercentType;

/**
 * The {@link LifxLightStateListener} is notified when the properties of a {@link LifxLightState} change.
 *
 * @author Wouter Born - Initial contribution
 */
@NonNullByDefault
public interface LifxLightStateListener {

    /**
     * Called when the colors property changes.
     *
     * @param oldColors the old colors value
     * @param newColors the new colors value
     */
    void handleColorsChange(HSBK[] oldColors, HSBK[] newColors);

    /**
     * Called when the power state property changes.
     *
     * @param oldPowerState the old power state value
     * @param newPowerState the new power state value
     */
    void handlePowerStateChange(@Nullable PowerState oldPowerState, PowerState newPowerState);

    /**
     * Called when the infrared property changes.
     *
     * @param oldInfrared the old infrared value
     * @param newInfrared the new infrared value
     */
    void handleInfraredChange(@Nullable PercentType oldInfrared, PercentType newInfrared);

    /**
     * Called when the signal strength property changes.
     *
     * @param oldSignalStrength the old signal strength value
     * @param newSignalStrength the new signal strength value
     */
    void handleSignalStrengthChange(@Nullable SignalStrength oldSignalStrength, SignalStrength newSignalStrength);
}
