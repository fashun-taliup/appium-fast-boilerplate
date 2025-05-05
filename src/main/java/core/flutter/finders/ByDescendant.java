package core.flutter.finders;

import core.flutter.FlutterElement;


/**
 * To identify the element using Descendant
 *
 * @version 1.0.0
 */
public interface ByDescendant {

    FlutterElement byDescendant(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly);

}
