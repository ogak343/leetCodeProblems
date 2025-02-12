package problems;

import java.util.ArrayList;
import java.util.List;

public class SimplifyPath {
    private SimplifyPath() {
    }

    public static String simplifyPath(String path) {

        path = path + "/";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/') {
                continue;
            } else if (path.charAt(i) == '.') {
                if (i < path.length() - 1 && path.charAt(i + 1) == '.') {
                    if (i < path.length() - 2 && path.charAt(i + 2) != '/') {
                        int newIndex = path.indexOf("/", i);
                        list.add(path.substring(i, newIndex));
                        i = newIndex - 1;
                    } else {
                        if (!list.isEmpty()) {
                            list.remove(list.size() - 1);
                            int newIndex = path.indexOf("/", i);
                            i = newIndex - 1;
                        }
                    }
                } else if (i < path.length() - 1 && path.charAt(i + 1) != '/') {
                    int newIndex = path.indexOf("/", i);
                    list.add(path.substring(i, newIndex));
                    i = newIndex - 1;
                }
            } else {
                int newIndex = path.indexOf("/", i);
                list.add(path.substring(i, newIndex));
                i = newIndex - 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        list.forEach(s -> sb.append("/").append(s));
        return list.isEmpty() ? "/" : sb.toString();
    }

}
