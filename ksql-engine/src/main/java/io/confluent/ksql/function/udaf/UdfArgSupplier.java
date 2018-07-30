/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.ksql.function.udaf;

import org.apache.kafka.common.metrics.Metrics;
import org.apache.kafka.connect.data.Schema;

import java.util.List;
import java.util.Optional;

import io.confluent.ksql.function.KsqlAggregateFunction;

@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
/*
 * Used during when creating UDAFS from the ext dir
 */
public interface UdfArgSupplier {
  KsqlAggregateFunction apply(List<Schema> args,
                              Schema returnType,
                              Optional<Metrics> metrics);
}
