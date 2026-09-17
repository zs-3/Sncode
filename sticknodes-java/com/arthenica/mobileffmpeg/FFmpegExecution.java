package com.arthenica.mobileffmpeg;

/* loaded from: classes.dex */
public class FFmpegExecution {
    private final java.lang.String command;
    private final long executionId;
    private final java.util.Date startTime;

    public FFmpegExecution(long r2, java.lang.String[] r4) {
            r1 = this;
            r1.<init>()
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r1.startTime = r0
            r1.executionId = r2
            java.lang.String r2 = com.arthenica.mobileffmpeg.FFmpeg.argumentsToString(r4)
            r1.command = r2
            return
    }
}
