/*
 * Hivemall: Hive scalable Machine Learning Library
 *
 * Copyright (C) 2013
 *   National Institute of Advanced Industrial Science and Technology (AIST)
 *   Registration Number: H25PRO-1520
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package hivemall.io;

import hivemall.mix.MixedWeight;

import javax.annotation.Nonnull;

public interface ModelUpdateHandler {

    /**
     * @param feature
     * @param weight
     * @param covar 1.0 by the default
     * @param clock 0 by the default
     * @param deltaUpdates 
     * @return reset the deltaUpdates?
     */
    boolean onUpdate(@Nonnull Object feature, float weight, float covar, short clock, int deltaUpdates)
            throws Exception;

    void sendCancelRequest(@Nonnull Object feature, @Nonnull MixedWeight mixed) throws Exception;

}
