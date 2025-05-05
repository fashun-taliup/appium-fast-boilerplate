package core.flutter.finders;

import core.flutter.FlutterElement;

import java.util.regex.Pattern;

/**
 * To identify the element using SemanticsLabel
 *
 * @version 1.0.0
 */
public interface BySemanticsLabel {

    FlutterElement bySemanticsLabel(String label);

    FlutterElement bySemanticsLabel(Pattern label);

}
