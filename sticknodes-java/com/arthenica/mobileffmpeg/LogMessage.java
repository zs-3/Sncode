package com.arthenica.mobileffmpeg;

/* loaded from: classes.dex */
public class LogMessage {
    private final long executionId;
    private final com.arthenica.mobileffmpeg.Level level;
    private final java.lang.String text;

    public LogMessage(long r1, com.arthenica.mobileffmpeg.Level r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.executionId = r1
            r0.level = r3
            r0.text = r4
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LogMessage{"
            r0.append(r1)
            java.lang.String r1 = "executionId="
            r0.append(r1)
            long r1 = r3.executionId
            r0.append(r1)
            java.lang.String r1 = ", level="
            r0.append(r1)
            com.arthenica.mobileffmpeg.Level r1 = r3.level
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r1 = r3.text
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
