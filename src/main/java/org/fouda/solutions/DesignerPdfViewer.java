package org.fouda.solutions;

public class DesignerPdfViewer {
    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            int charOrder = ((int) c) - 97;
            if (h[charOrder] > max)
                max = h[charOrder];
        }
        return word.length() * max;
    }

}
