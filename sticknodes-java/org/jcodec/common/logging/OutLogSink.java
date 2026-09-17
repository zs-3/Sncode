package org.jcodec.common.logging;

/* loaded from: classes2.dex */
public class OutLogSink implements org.jcodec.common.logging.LogSink {
    public static org.jcodec.common.logging.OutLogSink.SimpleFormat DEFAULT_FORMAT;
    private org.jcodec.common.logging.OutLogSink.MessageFormat fmt;
    private java.io.PrintStream out;

    public interface MessageFormat {
        java.lang.String formatMessage(org.jcodec.common.logging.Message r1);
    }

    public static class SimpleFormat implements org.jcodec.common.logging.OutLogSink.MessageFormat {
        private static java.util.Map<org.jcodec.common.logging.LogLevel, org.jcodec.common.tools.MainUtils.ANSIColor> colorMap;
        private java.lang.String fmt;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                org.jcodec.common.logging.OutLogSink.SimpleFormat.colorMap = r0
                org.jcodec.common.logging.LogLevel r1 = org.jcodec.common.logging.LogLevel.DEBUG
                org.jcodec.common.tools.MainUtils$ANSIColor r2 = org.jcodec.common.tools.MainUtils.ANSIColor.BROWN
                r0.put(r1, r2)
                java.util.Map<org.jcodec.common.logging.LogLevel, org.jcodec.common.tools.MainUtils$ANSIColor> r0 = org.jcodec.common.logging.OutLogSink.SimpleFormat.colorMap
                org.jcodec.common.logging.LogLevel r1 = org.jcodec.common.logging.LogLevel.INFO
                org.jcodec.common.tools.MainUtils$ANSIColor r2 = org.jcodec.common.tools.MainUtils.ANSIColor.GREEN
                r0.put(r1, r2)
                java.util.Map<org.jcodec.common.logging.LogLevel, org.jcodec.common.tools.MainUtils$ANSIColor> r0 = org.jcodec.common.logging.OutLogSink.SimpleFormat.colorMap
                org.jcodec.common.logging.LogLevel r1 = org.jcodec.common.logging.LogLevel.WARN
                org.jcodec.common.tools.MainUtils$ANSIColor r2 = org.jcodec.common.tools.MainUtils.ANSIColor.MAGENTA
                r0.put(r1, r2)
                java.util.Map<org.jcodec.common.logging.LogLevel, org.jcodec.common.tools.MainUtils$ANSIColor> r0 = org.jcodec.common.logging.OutLogSink.SimpleFormat.colorMap
                org.jcodec.common.logging.LogLevel r1 = org.jcodec.common.logging.LogLevel.ERROR
                org.jcodec.common.tools.MainUtils$ANSIColor r2 = org.jcodec.common.tools.MainUtils.ANSIColor.RED
                r0.put(r1, r2)
                return
        }

        public SimpleFormat(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.fmt = r1
                return
        }

        @Override // org.jcodec.common.logging.OutLogSink.MessageFormat
        public java.lang.String formatMessage(org.jcodec.common.logging.Message r4) {
                r3 = this;
                java.lang.String r0 = r3.fmt
                org.jcodec.common.logging.LogLevel r1 = r4.getLevel()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r2 = "#level"
                java.lang.String r0 = r0.replace(r2, r1)
                java.util.Map<org.jcodec.common.logging.LogLevel, org.jcodec.common.tools.MainUtils$ANSIColor> r1 = org.jcodec.common.logging.OutLogSink.SimpleFormat.colorMap
                org.jcodec.common.logging.LogLevel r2 = r4.getLevel()
                java.lang.Object r1 = r1.get(r2)
                org.jcodec.common.tools.MainUtils$ANSIColor r1 = (org.jcodec.common.tools.MainUtils.ANSIColor) r1
                int r1 = r1.ordinal()
                int r1 = r1 + 30
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r2 = "#color_code"
                java.lang.String r0 = r0.replace(r2, r1)
                java.lang.String r1 = r4.getClassName()
                java.lang.String r2 = "#class"
                java.lang.String r0 = r0.replace(r2, r1)
                java.lang.String r1 = r4.getMethodName()
                java.lang.String r2 = "#method"
                java.lang.String r0 = r0.replace(r2, r1)
                java.lang.String r1 = r4.getFileName()
                java.lang.String r2 = "#file"
                java.lang.String r0 = r0.replace(r2, r1)
                int r1 = r4.getLineNumber()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r2 = "#line"
                java.lang.String r0 = r0.replace(r2, r1)
                java.lang.String r4 = r4.getMessage()
                java.lang.String r1 = "#message"
                java.lang.String r4 = r0.replace(r1, r4)
                return r4
        }
    }

    static {
            org.jcodec.common.logging.OutLogSink$SimpleFormat r0 = new org.jcodec.common.logging.OutLogSink$SimpleFormat
            java.lang.String r1 = "[#level]"
            java.lang.String r2 = "#color_code"
            java.lang.String r1 = org.jcodec.common.tools.MainUtils.colorString(r1, r2)
            java.lang.String r2 = "\t#class.#method (#file:#line):"
            java.lang.String r2 = org.jcodec.common.tools.MainUtils.bold(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = "\t#message"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            org.jcodec.common.logging.OutLogSink.DEFAULT_FORMAT = r0
            return
    }

    public OutLogSink(java.io.PrintStream r1, org.jcodec.common.logging.OutLogSink.MessageFormat r2) {
            r0 = this;
            r0.<init>()
            r0.out = r1
            r0.fmt = r2
            return
    }

    public static org.jcodec.common.logging.OutLogSink createOutLogSink() {
            org.jcodec.common.logging.OutLogSink r0 = new org.jcodec.common.logging.OutLogSink
            java.io.PrintStream r1 = java.lang.System.out
            org.jcodec.common.logging.OutLogSink$SimpleFormat r2 = org.jcodec.common.logging.OutLogSink.DEFAULT_FORMAT
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.jcodec.common.logging.LogSink
    public void postMessage(org.jcodec.common.logging.Message r3) {
            r2 = this;
            java.io.PrintStream r0 = r2.out
            org.jcodec.common.logging.OutLogSink$MessageFormat r1 = r2.fmt
            java.lang.String r3 = r1.formatMessage(r3)
            r0.println(r3)
            return
    }
}
