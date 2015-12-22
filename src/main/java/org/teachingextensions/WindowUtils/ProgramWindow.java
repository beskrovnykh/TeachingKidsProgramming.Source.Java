package org.teachingextensions.WindowUtils;

import org.teachingextensions.approvals.lite.util.FrameCloser;
import org.teachingextensions.approvals.lite.util.WindowUtils;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.LeftClickMouseAdapter;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.EventUtils.RightClickMouseAdapter;
import org.teachingextensions.logo.utils.LineAndShapeUtils.ImageBackground;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Paintable;
import org.teachingextensions.virtualproctor.VirtualProctorWeb;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * <img src="http://ftpmirror.your.org/pub/wikimedia/images/wikibooks/de/2/2c/JPanel_Add_JButton_PAGE_END.JPG" style="text-align: left" alt="A window image" height="50" width="75" > Program Window
 * allows you to change the color of the background and more...
 */
@SuppressWarnings({"serial"})
public class ProgramWindow extends JPanel {
  protected final ArrayList<Paintable> painters = new ArrayList<Paintable>();
  private JFrame frame;

  public ProgramWindow(String title) {
    this();
    this.frame = new JFrame(title);
    this.frame.getContentPane().add(this);
    ProgramWindow.createStandardFrame(getFrame());
  }

  public ProgramWindow() {
    setPreferredSize(new Dimension(627, 442));
    setColor(PenColors.Whites.White);
  }

  public static void createStandardFrame(JFrame frame) {
    WindowUtils.testFrame(frame, new VirtualProctorWeb(), new FrameCloser());
  }

  public static Graphics2D configureGraphics2D(Graphics g) {
    Graphics2D g2d = (Graphics2D) g.create();
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
    g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
    g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
    return g2d;
  }

  /**
   * Adds a button instance to a window
   * <p><b>Example:</b> {@code programWindow.addButton(myButton)}</p>
   *
   * @param button
   *     A button instance
   */
  public void addButton(JButton button) {
    this.add(button);
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    if (this.painters == null) {
      return;
    }

    ArrayList<Paintable> toPaint = new ArrayList<>(this.painters);

    Graphics2D g2d = configureGraphics2D(g);
    for (Paintable p : toPaint) {
      p.paint(g2d, this);
    }
  }

  public void setColor(Color backgroundColor) {
    setBackground(backgroundColor);
  }

  public ProgramWindow clearWindow() {
    this.painters.clear();
    return this;
  }

  /**
   * Adds a right mouse click listener instance to a window
   * <p><b>Example:</b> {@code programWindow.addMouseRightClickListener(myRightClickListener)}</p>
   *
   * @param listener
   *     A listener instance
   */
  public void addMouseRightClickListener(MouseRightClickListener listener) {
    addMouseListener(new RightClickMouseAdapter(listener));
  }

  /**
   * Adds a left mouse click listener instance to a window
   * <p><b>Example:</b> {@code programWindow.addMouseLeftClickListener(myLeftClickListener)}</p>
   *
   * @param listener
   *     A listener instance
   */
  public void addMouseLeftClickListener(MouseLeftClickListener listener) {
    addMouseListener(new LeftClickMouseAdapter(listener));
  }

  /**
   * Adds a background image to a window
   * <p><b>Example:</b> {@code programWindow.setBackgroundImage("http://www.coolpicture.com/sunshine.jpg")}</p>
   *
   * @param url
   *     A URL path to an image
   */
  public void setBackgroundImage(String url) {
    add(new ImageBackground(url));
  }

  public JFrame getFrame() {
    return frame;
  }

  public void setWindowVisible(boolean b) {
    this.frame.setVisible(b);
    this.setVisible(b);
  }

  public ProgramWindow add(Paintable painter) {
    if (!this.painters.contains(painter)) {
      this.painters.add(painter);
    }

    return this;
  }

  public ProgramWindow remove(Paintable painter) {
    if (this.painters.contains(painter)) {
      this.painters.remove(painter);
    }

    return this;
  }
}
