/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.sdk.metrics.internal.data.ImmutableGaugeData;
import java.util.Collection;
import javax.annotation.concurrent.Immutable;

/**
 * Data for a {@link MetricDataType#LONG_GAUGE} or {@link MetricDataType#DOUBLE_GAUGE} metric.
 *
 * @since 1.14.0
 */
@Immutable
public interface GaugeData<T extends PointData> extends Data<T> {

  /**
   * Create a record.
   *
   * @since 1.50.0
   */
  static GaugeData<DoublePointData> createDoubleGaugeData(Collection<DoublePointData> points) {
    return ImmutableGaugeData.create(points);
  }

  /**
   * Create a record.
   *
   * @since 1.50.0
   */
  static GaugeData<LongPointData> createLongGaugeData(Collection<LongPointData> points) {
    return ImmutableGaugeData.create(points);
  }
}
