package com.daw.Pokedex.model;

import com.daw.Pokedex.model.Ability;

public class AbilitySlot {
private Ability ability;
private boolean is_hidden;
private int slot;
// Getters and setters

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public Ability getAbility() {
        return ability;
    }

    public int getSlot() {
        return slot;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public AbilitySlot(Ability ability, boolean is_hidden, int slot) {
        this.slot = slot;
        this.ability = ability;
        this.is_hidden = is_hidden;
    }
}

