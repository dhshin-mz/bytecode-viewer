/***************************************************************************
 * Bytecode Viewer (BCV) - Java & Android Reverse Engineering Suite        *
 * Copyright (C) 2014 Konloch - Konloch.com / BytecodeViewer.com           *
 *                                                                         *
 * This program is free software: you can redistribute it and/or modify    *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation, either version 3 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>. *
 ***************************************************************************/

package the.bytecode.club.bytecodeviewer.util;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * An awesome security manager.
 *
 * Note: SecurityManager has been deprecated for removal in modern Java.
 * This class now serves as a no-op placeholder preserving the public API
 * for callers that reference silenceExec/setPrinting/setPrintingPackage.
 *
 * @author Konloch
 */

public class SecurityMan
{
    private final AtomicInteger silentExec = new AtomicInteger(1);
    private boolean printing = false;
    private boolean printingPackage = false;

    public void silenceExec(boolean b)
    {
        silentExec.addAndGet(b ? 1 : -1);
    }

    public void setPrinting(boolean printing)
    {
        this.printing = printing;
    }

    public void setPrintingPackage(boolean printingPackage)
    {
        this.printingPackage = printingPackage;
    }
}
