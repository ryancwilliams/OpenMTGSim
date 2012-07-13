/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenMTGSim;

import java.awt.Image;

/**
 *
 * @author ryanwilliams
 */
public abstract class Card {
    /**
     * The Name of the card
     */
    public final String NAME;
    /**
     * The Expansion the card is From
     */
    public final String EXPANSION;
    /**
     * The Rarity of the Card
     */
    public final Rarity RARITY;
    /**
     * A Image of the card
     */
    public final Image IMAGE;
    
    /**
     * The Type of the card
     */
    public final String TYPE;
    /**
     * The Supertype of the card
     */
    public final String SUPERTYPE;
    /**
     * The Subtype of the card
     */
    public final String SUBTYPE;
    
    /**
     * True when the card is tapped
     */
    private boolean isTapped = false;

    /**
     * Creates a Card Object
     * @param NAME The name of the card
     * @param EXPANSION The Expansion the card is From 
     * @param RARITY The Rarity of the Card
     * @param IMAGE A Image of the card
     * @param TYPE The Type of the card
     * @param SUPERTYPE The Supertype of the card
     * @param SUBTYPE The Subtype of the card
     */
    public Card(String NAME, String EXPANSION, Rarity RARITY, Image IMAGE, String TYPE, String SUPERTYPE, String SUBTYPE) {
        this.NAME = NAME;
        this.EXPANSION = EXPANSION;
        this.RARITY = RARITY;
        this.IMAGE = IMAGE;
        this.TYPE = TYPE;
        this.SUPERTYPE = SUPERTYPE;
        this.SUBTYPE = SUBTYPE;
    }
    
    /**
     * This function is called when this card is cast into play
     */
    public abstract void cast();
    
    /**
     * Gets a array containing the events this card responds to
     * @return A array of Event objects containing the events this card responds to
     */
    public abstract Event[] getEvents();
    /**
     * This function is called when a event occurs.
     * @param event The event to respond to.
     */
    public abstract void onEvent(Event event);
    
    /**
     * Gets a array containing the Activated abilities this card can do
     * @return A array of Ability objects containing the Activated abilities this card can do
     */
    public abstract Ability[] getActivateAbilities();
    /**
     * This function is called when a ability is activated
     * @param ability The index of the ability in the getAbilities Array
     */
    public abstract void activate(int ability);
}
