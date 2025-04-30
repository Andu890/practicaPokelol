import com.daw.Pokedex.model.PokemonSummary;

import java.util.List;

public class PokemonListResponse {
        private int count;
        private List<PokemonSummary> items;
        // Getters and setters

    public List<PokemonSummary> getItems() {
        return items;
    }

    public void setItems(List<PokemonSummary> items) {
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public PokemonListResponse(int count, List<PokemonSummary> items) {
        this.count = count;
        this.items = items;
    }
}