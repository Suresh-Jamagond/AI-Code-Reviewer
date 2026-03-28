# 🚀 Java AI Code Reviewer
### *Powered by Spring Boot & Google Gemini*

A high-performance backend service that leverages **Generative AI** to perform automated code reviews. This project demonstrates how to integrate Large Language Models (LLMs) into a traditional Java stack using the modern **Spring AI** framework.

---

## 🛠️ Technical Architecture
* **Java 21**: Utilizing **Records** for immutable, type-safe Data Transfer Objects (DTOs).
* **Spring Boot 3.4+**: Providing the core RESTful infrastructure.
* **Spring AI (Google Gemini Starter)**: Orchestrating the connection to the Gemini 1.5 Flash model.
* **Maven**: Dependency management and build automation.

---

## 🌟 Features
- **Structured Feedback**: Unlike raw chat responses, this API returns a structured JSON object containing specific fields for functionality, best practices, and DSA relevance.
- **Large Payload Support**: Implements `POST` with `@RequestBody` to handle complex Java classes that exceed standard URL character limits.
- **Fluent AI Integration**: Uses the Spring AI `ChatClient` API for efficient prompt management and system-level instructions.

---

## Developed by - Suresh Jamagond
## 🚀 Getting Started

### 1. Prerequisites
- **JDK 21** or higher.
- A **Gemini API Key** (Get one for free at [Google AI Studio](https://aistudio.google.com/)).

### 2. Configuration
Add your API key to your `src/main/resources/application.properties`:

```properties
# Google Gemini Configuration
spring.ai.google.genai.api-key=YOUR_GEMINI_API_KEY
spring.ai.google.genai.chat.options.model=gemini-1.5-flash

URL - http://localhost:8080/api/genai/review