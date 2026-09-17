package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class JuliLogger extends com.googlecode.mp4parser.util.Logger {
    java.util.logging.Logger logger;

    public JuliLogger(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            r0.logger = r1
            return
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logDebug(java.lang.String r3) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            r0.log(r1, r3)
            return
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logError(java.lang.String r3) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            r0.log(r1, r3)
            return
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logWarn(java.lang.String r3) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            r0.log(r1, r3)
            return
    }
}
