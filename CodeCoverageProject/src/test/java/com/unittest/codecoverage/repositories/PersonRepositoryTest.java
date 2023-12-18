package com.unittest.codecoverage.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.unittest.codecoverage.models.Person;
import static org.junit.jupiter.api.Assertions.*;

public class PersonRepositoryTest {

    private PersonRepository repository;

    @BeforeEach
    public void setUp() {
        repository = new PersonRepository();
    }

    @Test
    public void insert_ValidPerson_ReturnsSamePerson() {
        // Arrange
        Person newPerson = new Person();

        // Act
        Person insertedPerson = repository.insert(newPerson);

        // Assert
        assertEquals(newPerson, insertedPerson);
    }

    @Test
    public void insert_NullPerson_ThrowsNullPointerException() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> repository.insert(null));
    }

    @Test
    public void update_NullPerson_ThrowsNullPointerException() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> repository.update(null));
    }

    @Test
    public void delete_NullName_ThrowsNullPointerException() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> repository.delete(null));
    }

    @Test
    public void get_WithName_ReturnsNull() {
        // Act
        Person foundPerson = repository.get("Name");

        // Assert
        assertNull(foundPerson);
    }

    @Test
    public void get_NullName_ThrowsNullPointerException() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> repository.get(null));
    }

    @Test
    public void update_ValidPerson_DoesNotThrowException() {
        // Arrange
        Person personToUpdate = new Person();

        // Act & Assert
        assertDoesNotThrow(() -> repository.update(personToUpdate));
    }

    @Test
    public void delete_ValidName_DoesNotThrowException() {
        // Act & Assert
        assertDoesNotThrow(() -> repository.delete("Name"));
    }
}
