package com.alee.managers.style.skin.web;

import com.alee.extended.painter.AbstractPainter;
import com.alee.laf.separator.AbstractSeparatorPainter;
import com.alee.laf.separator.WebSeparator;
import com.alee.managers.style.skin.web.data.SeparatorLine;
import com.alee.managers.style.skin.web.data.SeparatorLines;
import com.alee.utils.GraphicsUtils;

import javax.swing.*;
import javax.swing.plaf.SeparatorUI;
import java.awt.*;

/**
 * @author Alexandr Zernov
 * @author Mikle Garin
 */

public abstract class WebAbstractSeparatorPainter<E extends JSeparator, U extends SeparatorUI> extends AbstractPainter<E, U>
        implements AbstractSeparatorPainter<E, U>
{
    /**
     * Separator line descriptors.
     */
    protected SeparatorLines lines;

    @Override
    public void paint ( final Graphics2D g2d, final Rectangle bounds, final E c, final U ui )
    {
        final Object aa = GraphicsUtils.setupAntialias ( g2d );

        // General settings
        final Insets insets = c.getInsets ();
        final int x = insets.left;
        final int y = insets.top;
        final int width = c.getWidth () - insets.left - insets.right;
        final int height = c.getHeight () - insets.top - insets.bottom;
        final boolean vertical = c.getOrientation () == WebSeparator.VERTICAL;

        // Painting each separator line
        for ( int i = 0; i < lines.getLines ().size (); i++ )
        {
            // Current line
            final SeparatorLine line = lines.getLines ().get ( i );

            // Calculating line coordinates
            final int x1;
            final int y1;
            final int x2;
            final int y2;
            if ( vertical )
            {
                x1 = x2 = ltr ? x + i : x + width - i - 1;
                y1 = y;
                y2 = y + height - 1;
            }
            else
            {
                x1 = x;
                x2 = x + width - 1;
                y1 = y2 = y + i;
            }

            // Painting line
            final Stroke stroke = GraphicsUtils.setupStroke ( g2d, line.getStroke (), line.getStroke () != null );
            g2d.setPaint ( line.getPaint ( x1, y1, x2, y2 ) );
            g2d.drawLine ( x1, y1, x2, y2 );
            GraphicsUtils.restoreStroke ( g2d, stroke, line.getStroke () != null );
        }

        GraphicsUtils.restoreAntialias ( g2d, aa );
    }

    @Override
    public Dimension getPreferredSize ()
    {
        final Insets insets = component.getInsets ();
        final int lines = this.lines.getLines ().size ();
        return component.getOrientation () == WebSeparator.VERTICAL ?
                new Dimension ( insets.left + lines + insets.right, insets.top + insets.bottom ) :
                new Dimension ( insets.left + insets.right, insets.top + lines + insets.bottom );
    }
}