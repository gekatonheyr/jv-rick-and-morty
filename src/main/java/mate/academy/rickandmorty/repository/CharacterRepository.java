package mate.academy.rickandmorty.repository;

import mate.academy.rickandmorty.model.RnMCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CharacterRepository
        extends JpaRepository<RnMCharacter, Long>,
        JpaSpecificationExecutor<RnMCharacter> {
}
