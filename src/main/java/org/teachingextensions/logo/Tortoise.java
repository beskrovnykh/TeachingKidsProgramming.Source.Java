package org.teachingextensions.logo;

import java.awt.Color;

import org.teachingextensions.WindowUtils.TurtleWindow;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.TortoiseUtils;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;
import org.teachingextensions.logo.utils.PizzaUtils.Pizza;
import org.teachingextensions.logo.utils.PizzaUtils.Topping;
import org.teachingextensions.virtualproctor.VirtualProctor;

/**
 * <img src="https://lh5.googleusercontent.com/-B3Q59gpYW8o/T4tA2k_TYUI/AAAAAAAAAjo/WiqdoXjbkb0/s65/Tortoise.png" style="text-align: left" alt="Черепашка рисующая линию" >
 * Черепашка (The Tortoise) умеет рисовать всевозможные линии и предметы передвигаясь по экрану
 */
public class Tortoise
{
  private Topping topping;
  /**
   * Показывает черепашку
   * <div><b>Example:</b> {@code  Tortoise.show()} </div>
   */
  public static void show()
  {
    turtle().show();
  }
  /**
   * Возвращает имя черепашки
   * <div><b>Example:</b> {@code String name =  Tortoise.getName("Маруська");}</div>
   *
   * @return имя черепашки
   */
  public static String getName()
  {
    return turtle().getName();
  }
  /**
   * Устанавливает имя для черепашки
   * <div><b>Example:</b> {@code  Tortoise.setName("Васька")}</div>
   *
   * @param name
   *          The name for the Tortoise
   */
  public static void setName(String name)
  {
    turtle().setName(name);
  }
  /**
   * Возвращает скорость с которой будет передвигаться черепашка
   * <div><b>Example:</b> {@code int speed =  Tortoise.getSpeed(8);}</div>
   *
   * @return скорость с которой передвигается черепашка
   */
  public static int getSpeed()
  {
    return turtle().getSpeed();
  }
  /**
   * Устанавливает скорость с которой будет передвигаться черепашка
   * <div><b>Example:</b> {@code  Tortoise.setSpeed(8)}</div>
   *
   * @param speed
   *          Скорость от 1 (самая медленная) до 10 (самая большая)
   */
  public static void setSpeed(int speed)
  {
    turtle().setSpeed(speed);
  }
  /**
   * Перемещает черепашку на заданное число пикселей. <br>
   * <div><b>Example:</b> {@code Tortoise.move(72)}</div>
   *
   * @param lengthInPixels
   *          Число пикселей на которое нужно переместиться.
   *          Отрицательное число будет перемещать черепашку в обратном направлении.
   */
  public static void move(Number lengthInPixels)
  {
    turtle().move(lengthInPixels);
  }
  /**
   * Поворачивает черепашку на указанное число пикселей направо (по часовой стрелке)<br>
   * <div><b>Example:</b> {@code Tortoise.turn(90)}</div>
   *
   * @param degreesToTheRight по часовой стрелке
   *          Число градусов на которое нужно повернуться. Отрицательное число будет
   *          поворачивать черепашку налево (против часовой стрелки)
   */
  public static void turn(Number degreesToTheRight)
  {
    turtle().turn(degreesToTheRight.doubleValue());
  }
  /**
   * Дает возможность управлять холстом, по которому перемещается черепашка.
   * Используя холст, вы сможете изменить цвет фона. </br>
   * <b>Example:</b> {@code  TurtlePanel panel = Tortoise.getBackgroundWindow()}
   * @return окно программы, по которому перемещается черепашка.
   */
  public static TurtleWindow getBackgroundWindow()
  {
    return turtle().getBackgroundWindow();
  }
  /**
   * Возвращает ширину линии пера, которым рисует черепашка <br>
   * <div><b>Example:</b> {@code  width = Tortoise.getPenWidth()}</div>
   *
   * @return ширина линии пера
   */
  public static int getPenWidth()
  {
    return turtle().getPenWidth();
  }
  /**
   * Устанавливает ширину линии пера, которым рисует черепашка <br>
   * <div><b>Example:</b> {@code  Tortoise.setPenWidth(2)}</div>
   *
   * @param width
   *          ширина линии
   */
  public static void setPenWidth(Number width)
  {
    turtle().setPenWidth(width.intValue());
  }
  /**
   * Возвращает цвет пера, которым рисует черепашка <br>
   * <div><b>Example:</b> {@code  pen = Tortoise.getPenColor()}</div>
   *
   * @return цвет линии
   */
  public static Color getPenColor()
  {
    return turtle().getPenColor();
  }
  /**
   * Задает цвет пера, которым рисует черепашка<br>
   * <div><b>Example:</b> {@code  Tortoise.setPenColor(PenColors.Reds.Red)}</div>
   *
   * @param color
   *          цвет нарисованной линии
   * @see PenColors
   */
  public static void setPenColor(Color color)
  {
    turtle().setPenColor(color);
  }
  /**
   * Возвращает текущее положении черепашки по оси ординат Y.<br>
   * (0,0) - координаты верхнего левого угла экрана<br>
   * <div><b>Example:</b> {@code  y = Tortoise.getY()}</div>
   *
   * @return значение координаты Y черепашки в пикселях
   */
  public static int getY()
  {
    return turtle().getY();
  }
  /**
   * Устанавливает текущее положении черепашки по оси ординат Y.<br>
   * (0,0) - координаты верхнего левого угла экрана<br>
   * <div><b>Example:</b> {@code  Tortoise.setY(30);}</div>
   *
   * @param y
   *           значение координаты Y черепашки в пикселях
   */
  public static void setY(int y)
  {
    turtle().setY(y);
  }
  /**
   * Возвращает текущее положении черепашки по оси абсцисс X.<br>
   * (0,0) - координаты верхнего левого угла экрана<br>
   * <div><b>Example:</b> {@code  x = Tortoise.getX()}</div>
   *
   * @return значение координаты X черепашки в пикселях
   */
  public static int getX()
  {
    return turtle().getX();
  }
  /**
   * Устанавливает текущее положении черепашки по оси абсцисс X.<br>
   * (0,0) - координаты верхнего левого угла экрана<br>
   * <div><b>Example:</b> {@code  Tortoise.setX(30);}</div>
   *
   * @param x
   *          значение координаты X черепашки в пикселях
   */
  public static void setX(int x)
  {
    turtle().setX(x);
  }
  /**
   * Возвращает угол (направление) черепашки.<br>
   * 0 градусов - север. <br>
   * 90 градусов - восток. <br>
   * <div><b>Example:</b> {@code  angle = Tortoise.getAngleInDegrees()}</div>
   *
   * @return направление черепашки (угол в градусах)
   */
  public static double getAngle()
  {
    return turtle().getAngleInDegrees();
  }
  /**
   * Устанавливает угол (направление) черепашки.<br>
   * 0 градусов - север. <br>
   * 90 градусов - восток. <br>
   * <div><b>Example:</b> {@code  Tortoise.setAngle(42);}</div>
   *
   * @param
   *          angle
   *              направление черепашки (угол в градусах)
   */
  public static void setAngle(int angle)
  {
    turtle().setAngleInDegrees(angle);
  }
  /**
   * Изменяет тип зверька, которым вы управляете.<br>
   * <div><b>Example:</b> {@code  Tortoise.setAnimal(Animals.Spider);}</div>
   *
   * @param animal
   *               зверек которым вы хотите управлять
   * @see Animals
   */
  public static void setAnimal(Animals animal)
  {
    turtle().setAnimal(animal);
  }
  /**
   * Делает БУМ! <br>
   * <div><b>Example:</b> {@code  Tortoise.explode(Animals.ExplodedTurtle);}</div>
   *
   * @see Animals
   */
  public static void explode()
  {
    turtle().setAnimal(Animals.ExplodedTurtle);
  }
  /**
   * Делает так чтобы черепашка перестала рисовать цветом.<br>
   * <b>Example:</b> {@code  Tortoise.penUp()}
   */
  public static void setPenUp()
  {
    turtle().penUp();
  }
  /**
   * Делает так чтобы черепашка могла рисовать цветом.<br>
   * <b>Example:</b> {@code  Tortoise.penDown()}
   */
  public static void setPenDown()
  {
    turtle().penDown();
  }
  /**
   * Удаляет все с экрана.<br>
   * <b>Example:</b> {@code  Tortoise.clearWindow()}
   */
  public static void clear()
  {
    turtle().clear();
    turtle().getBackgroundWindow().setTurtle(turtle());
  }
  /**
   * Прячет черепашку. Вы сможете увидеть то, что нарисовали до этого. <br>
   * <b>Example:</b> {@code  Tortoise.hide()}
   */
  public static void hide()
  {
    turtle().hide();
  }
  private static Turtle turtle()
  {
    return TortoiseUtils.getTurtle();
  }
  /**
   * Переместить черепашку в определенную точку экрана. <br>
   * <div><b>Example:</b> {@code  Tortoise.moveTo(100,200);}</div>
   *
   * @param x
   *          координата по оси абсцисс X
   * @param y
   *          координата по оси ординат Y
   */
  public static void moveTo(int x, int y)
  {
    turtle().moveTo(x, y);
  }
  public static TurtleWindow ___()
  {
    return new TurtleWindow();
  }
  /**
   * Быстро рисует крутую фигурку
   * <div><b>Example:</b> {@code tortoise.drawShape(6,PenColors.Reds.Red, 50, 20)}</div>
   * @param sides
   *            число сторон
   * @param color
   *           шикарный цвет
   * @param length
   *           чем больше тем лучше
   * @param width
   *           сделай линию потолще - будет круто!
   */
  public static void drawShape(int sides, Color color, int length, int width)
  {
    Tortoise.show();
    Tortoise.setSpeed(7);
    Tortoise.getBackgroundWindow().getCanvas().setBackground(PenColors.Yellows.Goldenrod);
    new Text("TKP Java - Нарисуй мне что-нибудь!").setTopLeft(225, 50).addTo(Tortoise.getBackgroundWindow());
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(color);
      Tortoise.setPenWidth(width);
      Tortoise.move(length);
      Tortoise.turn(360 / sides);
    }
    VirtualProctor.setClassName("Выдающиеся дети");
    VirtualProctor.setName("Жан Бартик");
  }
  /**
   * Рисует настоящую черепашку - быстро!
   * <div><b>Example:</b> {@code tortoise.drawTortoise()}</div>
   */
  public static void drawTortoise()
  {
    Tortoise.show();
    Tortoise.setSpeed(9);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Greens.DarkSeaGreen);
    new Text("TKP Java - это черепашка!").setTopLeft(200, 75).addTo(Tortoise.getBackgroundWindow());
    Tortoise.setPenColor(PenColors.Greens.Green);
    Tortoise.setPenWidth(3);
    makeTortoiseBody();
    Tortoise.setPenColor(PenColors.Browns.Brown);
    Tortoise.turn(-65);
    Tortoise.makeTortoiseLeg();
    Tortoise.turn(90);
    Tortoise.move(150);
    Tortoise.turn(-90);
    Tortoise.makeTortoiseLeg();
  }
  private static void makeTortoiseLeg()
  {
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(35);
      Tortoise.turn(90);
    }
  }
  private static void makeTortoiseBody()
  {
    Tortoise.turn(-90);
    Tortoise.move(255);
    Tortoise.turn(135);
    Tortoise.move(135);
    Tortoise.turn(45);
    Tortoise.move(120);
    Tortoise.turn(45);
    Tortoise.move(70);
    Tortoise.turn(-90);
    Tortoise.move(35);
    Tortoise.turn(45);
    Tortoise.move(60);
    Tortoise.turn(65);
    Tortoise.move(50);
    Tortoise.turn(115);
    Tortoise.move(65);
    Tortoise.turn(-25);
    Tortoise.move(65);
  }
  public static void setVisible(boolean b)
  {
    turtle().setFrameVisible(b);
    turtle().setPanelVisible(b);
  }
  /**
   * Может ли ваша черепашка съесть этот кусочек пиццы
   * <div><b>Example:</b> {@code  tortoise.eatPizza(pizza)}</div>
   * @param pizza
   *            кусочек пиццы
   * @return может ваша черепашка съесть этот кусочек пиццы или нет
   */
  public boolean eatPizza(Pizza pizza)
  {
    if (!pizza.takeSlice()) { return false; }
    if (this.topping == null) { return true; }
    if (this.topping != Topping.Cheese) { return pizza.hasTopping(topping); }
    return pizza.wasCooked() && pizza.hasTopping(topping);
  }
  /**
   * Считает ли ваша черепашка данное блюдо восхитительным
   * <div><b>Example:</b> {@code  tortoise.likesTopping(topping)}</div>
   *
   * @param topping
   *            восхитительное блюдо
   */
  public void likesTopping(Topping topping)
  {
    this.topping = topping;
  }
}
