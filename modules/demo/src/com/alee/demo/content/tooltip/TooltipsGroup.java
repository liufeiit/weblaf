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

package com.alee.demo.content.tooltip;

import com.alee.api.annotations.NotNull;
import com.alee.api.annotations.Nullable;
import com.alee.demo.api.example.AbstractExampleGroup;
import com.alee.utils.CollectionUtils;

import java.util.List;

/**
 * @author Mikle Garin
 */
public class TooltipsGroup extends AbstractExampleGroup
{
    @Nullable
    @Override
    public String getId ()
    {
        return "tooltips";
    }

    @Override
    protected List<Class> getExampleClasses ()
    {
        return CollectionUtils.<Class>asList (
                JTooltipExample.class,
                WebCustomTooltipExample.class,
                ListTooltipExample.class,
                TableTooltipExample.class,
                TreeTooltipExample.class
        );
    }
}