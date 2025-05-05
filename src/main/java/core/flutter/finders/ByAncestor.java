package core.flutter.finders;

import core.flutter.FlutterElement;

/**
 * To identify the element using Ancestor
 *
 * @version 1.0.0
 */
public interface ByAncestor {

    FlutterElement byAncestor(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly);
}
