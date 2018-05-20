package ro.bobocgabrielcojocaruandrei.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;
import java.util.UUID;

public class TodoId {
    private UUID id;

    @JsonCreator
    public TodoId(UUID id) {
                this.id = id;
         }

    @JsonValue
    public UUID getId() {
                return id;
            }

    @Override
    public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                TodoId paymentId = (TodoId) o;
                return Objects.equals(id, paymentId.id);
            }

    @Override
    public int hashCode() {
                return Objects.hash(id);
            }

    @Override
    public String toString() {
                return String.format("PaymentId{id=%s}", id);
            }
}
