/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.utils.classes;

/**
 * Sample test class.
 *
 * @author Mikle Garin
 */
public final class PublicClassConstructor implements ClassData
{
    /**
     * Class data.
     */
    private final String data;

    /**
     * Constructs new {@link PublicClassConstructor}.
     */
    public PublicClassConstructor ()
    {
        super ();
        data = SUCCESS;
    }

    @Override
    public String get ()
    {
        return data;
    }
}