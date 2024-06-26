package com.azure.function.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonIgnoreProperties
public class ServiceBusQueueMessage {
    private String messageId;
    private String message;
}
