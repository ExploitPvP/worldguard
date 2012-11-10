// $Id$
/*
 * This file is a part of WorldGuard.
 * Copyright (c) sk89q <http://www.sk89q.com>
 * Copyright (c) the WorldGuard team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldguard.bukkit;

import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;

import com.sk89q.rulelists.Context;

/**
 * An implementation of a {@link Context} for Bukkit.
 *
 * @see Context
 */
public class BukkitContext extends Context {

    private final Event event;
    private String message;
    private Entity sourceEntity;
    private Entity targetEntity;
    private ItemStack item;
    private BlockState sourceBlock;
    private BlockState targetBlock;
    private BlockState replacedTargetBlock;

    /**
     * Construct a context linked to the given event.
     *
     * @param event the event
     */
    public BukkitContext(Event event) {
        this.event = event;
    }

    /**
     * Get the message attribute of this context.
     *
     * @return message or null
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the message attribute of this context.
     *
     * @param message or null
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get the source entity for this context. The source entity is the 'cause' of
     * this context, if it is available.
     *
     * @return entity or null
     */
    public Entity getSourceEntity() {
        return sourceEntity;
    }

    /**
     * Set the source entity for this context. The source entity is the 'cause' of
     * this context, if it is available.
     *
     * @param sourceEntity entity or null
     */
    public void setSourceEntity(Entity sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    /**
     * Get the target entity for this context. The target entity is the 'subject'
     * of this context, if it is available.
     *
     * @return entity or null
     */
    public Entity getTargetEntity() {
        return targetEntity;
    }

    /**
     * Set the target entity for this context. The target entity is the 'subject'
     * of this context, if it is available.
     *
     * @param targetEntity entity or null
     */
    public void setTargetEntity(Entity targetEntity) {
        this.targetEntity = targetEntity;
    }

    /**
     * Get the primary item related to this context. Only events that are oriented
     * around an item have this property set.
     *
     * @return item or null
     */
    public ItemStack getItem() {
        return item;
    }

    /**
     * Set the primary item related to this context. Only events that are oriented
     * around an item have this property set.
     *
     * @param item  item or null
     */
    public void setItem(ItemStack item) {
        this.item = item;
    }

    /**
     * Get the source block for this context. The source block is the 'cause'
     * of this context, if it is available.
     *
     * @return block or null
     */
    public BlockState getSourceBlock() {
        return sourceBlock;
    }

    /**
     * Set the source block for this context. The source block is the 'cause'
     * of this context, if it is available.
     *
     * @param block block or null
     */
    public void setSourceBlock(BlockState block) {
        this.sourceBlock = block;
    }

    /**
     * Get a target block for this context. The target block is the 'subject' of
     * this context, if it is available.
     *
     * @return block or null
     */
    public BlockState getTargetBlock() {
        return targetBlock;
    }

    /**
     * Set a target block for this context. The target block is the 'subject' of
     * this context, if it is available.
     *
     * @param targetBlock block or null
     */
    public void setTargetBlock(BlockState targetBlock) {
        this.targetBlock = targetBlock;
    }

    /**
     * Get the placed block for this context. The placed block is the 'new' block
     * that will replace the existing block in this context, if it is available.
     *
     * @return block or null
     */
    public BlockState getPlacedBlock() {
        return replacedTargetBlock;
    }

    /**
     * Set the placed block for this context. The placed block is the 'new' block
     * that will replace the existing block in this context, if it is available.
     *
     * @param replacedTargetBlock block or null
     */
    public void setPlacedBlock(BlockState replacedTargetBlock) {
        this.replacedTargetBlock = replacedTargetBlock;
    }

    /**
     * Get the underlying event object.
     *
     * @return event object
     */
    public Event getEvent() {
        return event;
    }

}