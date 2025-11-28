package dev.langchain4j.model.openai.spi;

import java.util.function.Supplier;
import dev.langchain4j.Internal;
import dev.langchain4j.model.openai.OpenAiAudioModel;

/**
 * A factory for building {@link OpenAiAudioModel.OpenAiAudioModelBuilder} instances.
 */
@Internal
public interface OpenAiAudioModelBuilderFactory extends Supplier<OpenAiAudioModel.OpenAiAudioModelBuilder> {
}
