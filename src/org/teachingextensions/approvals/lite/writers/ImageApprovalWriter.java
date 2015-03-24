package org.teachingextensions.approvals.lite.writers;

import org.teachingextensions.approvals.lite.ApprovalWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageApprovalWriter implements ApprovalWriter {
    private final BufferedImage image;

    public ImageApprovalWriter(BufferedImage image) {
        this.image = image;
    }

    @Override
    public String writeReceivedFile(String received) throws Exception {
        ImageIO.write(image, "png", new File(received));
        return received;
    }

    @Override
    public String getApprovalFilename(String base) {
        return base + Writer.approved + ".png";
    }

    @Override
    public String getReceivedFilename(String base) {
        return base + Writer.received + ".png";
    }
}
