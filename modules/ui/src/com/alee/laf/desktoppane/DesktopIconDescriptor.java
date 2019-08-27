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

package com.alee.laf.desktoppane;

import com.alee.managers.style.StyleId;

import javax.swing.*;

/**
 * Basic descriptor for {@link JInternalFrame.JDesktopIcon} component.
 * For creating custom {@link JInternalFrame.JDesktopIcon} descriptor {@link AbstractDesktopIconDescriptor} class can be extended.
 *
 * @author Mikle Garin
 * @see <a href="https://github.com/mgarin/weblaf/wiki/How-to-use-StyleManager">How to use StyleManager</a>
 * @see com.alee.managers.style.StyleManager
 * @see com.alee.managers.style.StyleManager#registerComponentDescriptor(com.alee.managers.style.ComponentDescriptor)
 * @see com.alee.managers.style.StyleManager#unregisterComponentDescriptor(com.alee.managers.style.ComponentDescriptor)
 */
public final class DesktopIconDescriptor extends AbstractDesktopIconDescriptor<JInternalFrame.JDesktopIcon, WDesktopIconUI>
{
    /**
     * Constructs new descriptor for {@link JInternalFrame.JDesktopIcon} component.
     */
    public DesktopIconDescriptor ()
    {
        super ( "desktopicon", JInternalFrame.JDesktopIcon.class, "DesktopIconUI", WDesktopIconUI.class, WebDesktopIconUI.class,
                StyleId.desktopicon );
    }
}