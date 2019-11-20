package org.freedesktop.NetworkManager.Connection;

import java.util.Map;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.types.Variant;
import org.freedesktop.dbus.exceptions.DBusException;
public interface Active extends DBusInterface
{
   public static class PropertiesChanged extends DBusSignal
   {
      public final Map<String,Variant> a;
      public PropertiesChanged(String path, Map<String,Variant> a) throws DBusException
      {
         super(path, a);
         this.a = a;
      }
   }
}
