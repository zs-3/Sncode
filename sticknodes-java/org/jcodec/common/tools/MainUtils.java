package org.jcodec.common.tools;

/* loaded from: classes2.dex */
public class MainUtils {
    private static java.util.regex.Pattern flagPattern;
    public static boolean isColorSupported;

    public enum ANSIColor extends java.lang.Enum<org.jcodec.common.tools.MainUtils.ANSIColor> {
        private static final /* synthetic */ org.jcodec.common.tools.MainUtils.ANSIColor[] $VALUES = null;
        public static final org.jcodec.common.tools.MainUtils.ANSIColor BLACK = null;
        public static final org.jcodec.common.tools.MainUtils.ANSIColor BLUE = null;
        public static final org.jcodec.common.tools.MainUtils.ANSIColor BROWN = null;
        public static final org.jcodec.common.tools.MainUtils.ANSIColor CYAN = null;
        public static final org.jcodec.common.tools.MainUtils.ANSIColor GREEN = null;
        public static final org.jcodec.common.tools.MainUtils.ANSIColor GREY = null;
        public static final org.jcodec.common.tools.MainUtils.ANSIColor MAGENTA = null;
        public static final org.jcodec.common.tools.MainUtils.ANSIColor RED = null;

        static {
                org.jcodec.common.tools.MainUtils$ANSIColor r0 = new org.jcodec.common.tools.MainUtils$ANSIColor
                java.lang.String r1 = "BLACK"
                r2 = 0
                r0.<init>(r1, r2)
                org.jcodec.common.tools.MainUtils.ANSIColor.BLACK = r0
                org.jcodec.common.tools.MainUtils$ANSIColor r1 = new org.jcodec.common.tools.MainUtils$ANSIColor
                java.lang.String r3 = "RED"
                r4 = 1
                r1.<init>(r3, r4)
                org.jcodec.common.tools.MainUtils.ANSIColor.RED = r1
                org.jcodec.common.tools.MainUtils$ANSIColor r3 = new org.jcodec.common.tools.MainUtils$ANSIColor
                java.lang.String r5 = "GREEN"
                r6 = 2
                r3.<init>(r5, r6)
                org.jcodec.common.tools.MainUtils.ANSIColor.GREEN = r3
                org.jcodec.common.tools.MainUtils$ANSIColor r5 = new org.jcodec.common.tools.MainUtils$ANSIColor
                java.lang.String r7 = "BROWN"
                r8 = 3
                r5.<init>(r7, r8)
                org.jcodec.common.tools.MainUtils.ANSIColor.BROWN = r5
                org.jcodec.common.tools.MainUtils$ANSIColor r7 = new org.jcodec.common.tools.MainUtils$ANSIColor
                java.lang.String r9 = "BLUE"
                r10 = 4
                r7.<init>(r9, r10)
                org.jcodec.common.tools.MainUtils.ANSIColor.BLUE = r7
                org.jcodec.common.tools.MainUtils$ANSIColor r9 = new org.jcodec.common.tools.MainUtils$ANSIColor
                java.lang.String r11 = "MAGENTA"
                r12 = 5
                r9.<init>(r11, r12)
                org.jcodec.common.tools.MainUtils.ANSIColor.MAGENTA = r9
                org.jcodec.common.tools.MainUtils$ANSIColor r11 = new org.jcodec.common.tools.MainUtils$ANSIColor
                java.lang.String r13 = "CYAN"
                r14 = 6
                r11.<init>(r13, r14)
                org.jcodec.common.tools.MainUtils.ANSIColor.CYAN = r11
                org.jcodec.common.tools.MainUtils$ANSIColor r13 = new org.jcodec.common.tools.MainUtils$ANSIColor
                java.lang.String r15 = "GREY"
                r14 = 7
                r13.<init>(r15, r14)
                org.jcodec.common.tools.MainUtils.ANSIColor.GREY = r13
                r15 = 8
                org.jcodec.common.tools.MainUtils$ANSIColor[] r15 = new org.jcodec.common.tools.MainUtils.ANSIColor[r15]
                r15[r2] = r0
                r15[r4] = r1
                r15[r6] = r3
                r15[r8] = r5
                r15[r10] = r7
                r15[r12] = r9
                r0 = 6
                r15[r0] = r11
                r15[r14] = r13
                org.jcodec.common.tools.MainUtils.ANSIColor.$VALUES = r15
                return
        }

        ANSIColor(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.jcodec.common.tools.MainUtils.ANSIColor valueOf(java.lang.String r1) {
                java.lang.Class<org.jcodec.common.tools.MainUtils$ANSIColor> r0 = org.jcodec.common.tools.MainUtils.ANSIColor.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.jcodec.common.tools.MainUtils$ANSIColor r1 = (org.jcodec.common.tools.MainUtils.ANSIColor) r1
                return r1
        }

        public static org.jcodec.common.tools.MainUtils.ANSIColor[] values() {
                org.jcodec.common.tools.MainUtils$ANSIColor[] r0 = org.jcodec.common.tools.MainUtils.ANSIColor.$VALUES
                java.lang.Object r0 = r0.clone()
                org.jcodec.common.tools.MainUtils$ANSIColor[] r0 = (org.jcodec.common.tools.MainUtils.ANSIColor[]) r0
                return r0
        }
    }

    static {
            java.io.Console r0 = java.lang.System.console()
            if (r0 != 0) goto L15
            java.lang.String r0 = "jcodec.colorPrint"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            org.jcodec.common.tools.MainUtils.isColorSupported = r0
            java.lang.String r0 = "^--([^=]+)=(.*)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.jcodec.common.tools.MainUtils.flagPattern = r0
            return
    }

    public static java.lang.String bold(java.lang.String r2) {
            boolean r0 = org.jcodec.common.tools.MainUtils.isColorSupported
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\u001b[1m"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "\u001b[0m"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L1a:
            return r2
    }

    public static java.lang.String colorString(java.lang.String r2, java.lang.String r3) {
            boolean r0 = org.jcodec.common.tools.MainUtils.isColorSupported
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\u001b["
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "m"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = "\u001b[0m"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L22:
            return r2
    }
}
