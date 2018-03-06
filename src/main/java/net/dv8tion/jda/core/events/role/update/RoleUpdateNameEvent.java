/*
 *     Copyright 2015-2018 Austin Keener & Michael Ritter & Florian Spieß
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.core.events.role.update;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Role;

/**
 * Indicates that a {@link net.dv8tion.jda.core.entities.Role Role} updated its name.
 *
 * <p>Can be used to retrieve the old name.
 *
 * <p>Identifier: {@code name}
 */
public class RoleUpdateNameEvent extends GenericRoleUpdateEvent<String>
{
    public static final String IDENTIFIER = "name";

    private final String oldName;
    private final String newName;

    public RoleUpdateNameEvent(JDA api, long responseNumber, Role role, String oldName)
    {
        super(api, responseNumber, role);
        this.oldName = oldName;
        this.newName = role.getName();
    }

    /**
     * The old name
     *
     * @return The old name
     */
    public String getOldName()
    {
        return oldName;
    }

    @Override
    public String getPropertyIdentifier()
    {
        return IDENTIFIER;
    }

    @Override
    public String getOldValue()
    {
        return oldName;
    }

    @Override
    public String getNewValue()
    {
        return newName;
    }
}
