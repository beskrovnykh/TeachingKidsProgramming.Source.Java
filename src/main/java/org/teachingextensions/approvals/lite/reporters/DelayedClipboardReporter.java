package org.teachingextensions.approvals.lite.reporters;

import java.awt.GraphicsEnvironment;

import org.teachingextensions.approvals.lite.util.StringUtils;
import org.teachingextensions.approvals.lite.util.WindowUtils;

/**
 * A reporter which creates the command to accept the received
 * file as the approve file and copies it to the clipboard:<br>
 * <code>move received.txt approved.txt</code>
 */
public class DelayedClipboardReporter implements EnvironmentAwareReporter {
    private static StringBuffer text = new StringBuffer();

    @Override
    public void report(String received, String approved) throws Exception {
        String commandLine = ClipboardReporter.getCommandLine(received, approved);
        text.append(commandLine).append(StringUtils.NEW_LINE);
        WindowUtils.copyToClipBoard(text.toString(), false);
    }

    /**
     * The clipboard will not be available in a headless environment.
     */
    @Override
    public boolean isWorkingInThisEnvironment(String forFile) {
        return !GraphicsEnvironment.isHeadless();
    }
}
