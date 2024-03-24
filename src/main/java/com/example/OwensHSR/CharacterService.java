package com.example.OwensHSR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<Character> getCharacters() {
        return characterRepository.findAll();
    }

    public Character getCharacter(String characterName)
    {
        Optional<Character> characterOptional = characterRepository.findById(characterName.toLowerCase());
        if(characterOptional.isEmpty())
        {
            throw new IllegalStateException("Character with name " + characterName + " does not exist.");
        }
        else
        {
            return characterOptional.get();
        }
    }
}
