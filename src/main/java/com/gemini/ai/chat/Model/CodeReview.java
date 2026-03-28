package com.gemini.ai.chat.Model;

import java.util.List;

/**
 * Using a Record is better than a Class because it's immutable,
 * shorter, and perfect for JSON mapping in Spring AI.
 */
public record CodeReview(
        String functionality,
        List<String> bestPractices,
        String dsaRelevance,
        String recommendation
) {}