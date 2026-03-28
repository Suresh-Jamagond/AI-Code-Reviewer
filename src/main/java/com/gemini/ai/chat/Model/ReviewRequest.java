package com.gemini.ai.chat.Model;

/**
 * Using a Record is better than a Class because it's immutable,
 * shorter, and perfect for JSON mapping in Spring AI.
 */
public record ReviewRequest(String language, String code)
{

}