require 'java'

java_import 'javax.swing.JFrame'
java_import 'javax.swing.JPanel'
java_import 'java.awt.Dimension'
java_import 'java.awt.Graphics'
java_import 'java.awt.event.MouseEvent'
java_import 'java.awt.event.MouseMotionListener'


class DrawPanel < JPanel
  
  attr_accessor :x, :y
  
  def initialize
    @x, @y = 0, 0
  end
  
  def paintComponent(graphics)
    graphics.draw_oval(@x, @y, 10, 10)
  end
  
end


class MyListener
  
  attr_accessor :panel
  
  def mouseDragged(event)
    @panel.x = event.x
    @panel.y = event.y
    @panel.repaint
  end
  
  def mouseMoved(event)
  end
  
end


panel = DrawPanel.new
listener = MyListener.new
listener.panel = panel
panel.add_mouse_motion_listener(listener)

frame = JFrame.new 'JRuby Paint'
frame.size = Dimension.new 640, 480
frame.add panel
frame.visible = true
