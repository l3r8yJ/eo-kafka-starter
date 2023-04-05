package io.github.eocqrs.springframework.kafka.autoconfig;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link KafkaAutoConfig}.
 *
 * @author Aliaksei Bialiauski (abialiauski.dev@gmail.com)
 * @since 0.0.0
 */
final class KafkaAutoConfigTest {

  @Test
  void creates() {
    final KafkaAutoConfig config = new KafkaAutoConfig();
    MatcherAssert.assertThat(
      "Auto Config is not NULL",
      config,
      Matchers.notNullValue()
    );
  }
}
