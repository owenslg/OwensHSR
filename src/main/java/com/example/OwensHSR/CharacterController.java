package com.example.OwensHSR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/character")
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService)
    {
        this.characterService = characterService;
    }

    @GetMapping
    public List<Character> getCharacters()
    {
        return characterService.getCharacters();
    }

    @GetMapping(path = "{characterName}")
    public Character getCharacterByName(@PathVariable("characterName") String characterName)
    {
        return characterService.getCharacter(characterName);
    }

    @PutMapping(path = "{characterName}")
    public void updateCharacterByName(@PathVariable("characterName") String characterName, @RequestBody Character character)
    {
        characterService.updateCharacter(characterName, character);
    }
}
