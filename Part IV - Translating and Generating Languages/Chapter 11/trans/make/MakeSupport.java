package make;

import java.util.*;
import java.io.*;

public class MakeSupport {
    Map<String, Target> targets = new HashMap<String, Target>();

    public int build(String target) throws Exception {
        Target t = targets.get(target);
        if (t == null)
            return 0;
        File targetFile = new File(target);
        int n = t.dependencies.size();
        boolean buildTarget = false;
        if (n == 0)
            buildTarget = true;
        for (String dep : t.dependencies) {
            File depFile = new File(dep);
            if (!depFile.exists() || depFile.lastModified() > targetFile.lastModified()) {
                buildTarget = true;
                int errorCode = build(dep);
                if (errorCode != 0)
                    return errorCode;
            }
        }
        if (buildTarget) {
            int errorCode = t.exec();
            return errorCode;
        }
        return 0;
    }
}
