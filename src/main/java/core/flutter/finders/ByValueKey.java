package core.flutter.finders;

import core.flutter.FlutterElement;


/**
 * To identify the element using Value key
 *
 * @version 1.0.0
 */
public interface ByValueKey {

    FlutterElement byValueKey(String key);

    FlutterElement byValueKey(int key);

}
