package com.example.pokemontcg.response;

import com.example.pokemontcg.models.PokemonModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PokemonResponses {
    @SerializedName("results")
    @Expose
    private List<PokemonModel> pokemon;

    public List<PokemonModel> getPokemon() {
        return pokemon;
    }

    @Override
    public String toString() {
        return "PokemonResponses{" +
                "pokemon=" + pokemon +
                '}';
    }
}
